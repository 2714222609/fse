package com.edu.hzau.cocs.fe.service;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.edu.hzau.cocs.fe.pojo.SwineMetabolismHmdbRes;
import com.edu.hzau.cocs.fe.pojo.SwineMicrobeGeneKeggRes;
import com.edu.hzau.cocs.fe.pojo.datalog.Datalog;
import com.edu.hzau.cocs.fe.utils.*;
import lombok.extern.slf4j.Slf4j;
import org.activiti.api.process.model.ProcessInstance;
import org.activiti.api.process.model.builders.ProcessPayloadBuilder;
import org.activiti.api.process.runtime.ProcessRuntime;
import org.activiti.api.task.model.builders.TaskPayloadBuilder;
import org.activiti.api.task.runtime.TaskRuntime;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RserveException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author yue
 */
@Slf4j
@Service
public class QueryService {

    @Autowired
    private DateUtils dateUtil;
    @Autowired
    private RedisService redisService;

    @Autowired
    private CommonUtils commonUtils;
    @Autowired
    private ProcessRuntime processRuntime;
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private TaskRuntime taskRuntime;
    @Autowired
    private SecurityUtils securityUtils;
    @Autowired
    private DatalogParser datalogParser;

    public JSONArray query(@RequestBody JSONObject jsonObject) throws REXPMismatchException, IOException, RserveException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // response time
        double startTime = dateUtil.getDate();
        double endTime;

        JSONArray datalogs = jsonObject.getJSONArray("datalog");
        JSONArray resultAll = new JSONArray();
        int responseCount = 0;
        // 处理每一条datalog
        for (Object datalogStr : datalogs) {
            JSONArray resultJson = null;
            // 缓存
            String key = String.valueOf(datalogStr.hashCode());
            String resultString = redisService.getString(key);
            if (resultString != null) {
                resultJson = JSONArray.parseArray(resultString);
            } else {
                log.info("> Query cache missed.");

                // 获取模板
                String processDefinitionKey = commonUtils.getQuestionTemplate((String) datalogStr);

                // 启动流程引擎
                securityUtils.logInAs("user_00");
                ProcessInstance processInstance = processRuntime.start(ProcessPayloadBuilder.start().withProcessDefinitionKey(processDefinitionKey).build());
                String id = processInstance.getId();
                log.info("> Process started: {}", processInstance);

                // 读取流程并执行
                Datalog datalog = null;
                List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList = new ArrayList<>();
                List<SwineMetabolismHmdbRes> swineMetabolismHmdbResList = new ArrayList<>();
                while (true) {
                    Task task = taskService.createTaskQuery().processInstanceId(id).active().singleResult();
                    if (task == null) break;
                    String taskName = task.getName();
                    if (taskName.equals("parseDatalog")) {
                        Class<?> datalogParserClass = DatalogParser.class;
                        Method method = datalogParserClass.getMethod(taskName, String.class);
                        datalog = (Datalog) method.invoke(new DatalogParser(), datalogStr);
                        log.info(">>> datalog: " + datalog);
                        taskRuntime.claim(TaskPayloadBuilder.claim().withTaskId(task.getId()).build());
                        taskRuntime.complete(TaskPayloadBuilder.complete().withTaskId(task.getId()).build());
                    }
                    if (Arrays.asList(Constants.SUBQUERY_TEMPLATE_1).contains(taskName)) {
                        Class<?> subQueryServiceClass = SubQueryService.class;
                        Method method = subQueryServiceClass.getMethod(taskName, Datalog.class, List.class);
                        swineMicrobeGeneKeggResList = (List<SwineMicrobeGeneKeggRes>) method.invoke(new SubQueryService(), datalog, swineMicrobeGeneKeggResList);
                        taskRuntime.claim(TaskPayloadBuilder.claim().withTaskId(task.getId()).build());
                        taskRuntime.complete(TaskPayloadBuilder.complete().withTaskId(task.getId()).build());
                    }
                    if (Arrays.asList(Constants.SUBQUERY_TEMPLATE_2).contains(taskName)) {
                        Class<?> subQueryServiceClass = SubQueryService.class;
                        Method method = subQueryServiceClass.getMethod(taskName, Datalog.class, List.class);
                        swineMetabolismHmdbResList = (List<SwineMetabolismHmdbRes>) method.invoke(new SubQueryService(), datalog, swineMetabolismHmdbResList);
                        taskRuntime.claim(TaskPayloadBuilder.claim().withTaskId(task.getId()).build());
                        taskRuntime.complete(TaskPayloadBuilder.complete().withTaskId(task.getId()).build());
                    }
                    if (taskName.equals("resultConvert")) {
                        Class<?> commonUtilsClass = CommonUtils.class;
                        Method method = commonUtilsClass.getMethod(taskName, List.class);
                        if (swineMicrobeGeneKeggResList.size() == 0) {
                            resultJson = (JSONArray) method.invoke(new CommonUtils(), swineMetabolismHmdbResList);
                        }else {
                            resultJson = (JSONArray) method.invoke(new CommonUtils(), swineMicrobeGeneKeggResList);

                        }
                        taskRuntime.claim(TaskPayloadBuilder.claim().withTaskId(task.getId()).build());
                        taskRuntime.complete(TaskPayloadBuilder.complete().withTaskId(task.getId()).build());
                    }
                }


//                if (!processDefinitionKey.equals("question-template-2")) {
//                    List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList = subQueryService.isHostOf(datalog);
//                    List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggRes = subQueryService.changeTheExpressionByMicrobiota(datalog, swineMicrobeGeneKeggResList);
//                    List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggAns = subQueryService.hasGeneKeggInfo(datalog, swineMicrobeGeneKeggRes);
//                    resultJson = JSONArray.parseArray(JSON.toJSONString(swineMicrobeGeneKeggAns));
//                }else {
//                    List<SwineMetabolismHmdbRes> swineMetabolismHmdbResList = subQueryService.generates(datalog);
//                    List<SwineMetabolismHmdbRes> swineMetabolismHmdbResAns = subQueryService.hasHmdbInfo(datalog, swineMetabolismHmdbResList);
//                    resultJson = JSONArray.parseArray(JSON.toJSONString(swineMetabolismHmdbResAns));
//                }
//                // 结果转换
//                Page<Task> taskPage = taskRuntime.tasks(Pageable.of(0, 1));
//                for (Task task : taskPage.getContent()) {
//                    taskRuntime.claim(TaskPayloadBuilder.claim().withTaskId(task.getId()).build());
//                    taskRuntime.complete(TaskPayloadBuilder.complete().withTaskId(task.getId()).build());
//                    log.info("> 任务完成: {}", task);
//                }
                // 缓存到redis
                resultString = resultJson.toString();
                redisService.setString(key, resultString);
            }
            responseCount += resultJson.toArray().length;
            resultAll.addAll(resultJson);
        }
        endTime = dateUtil.getDate();
        double responseTime = (endTime - startTime) / 1000;
        JSONObject responseInfo = new JSONObject();
        responseInfo.put("response count", responseCount);
        responseInfo.put("response time", responseTime + "s");
        resultAll.add(responseInfo);
        return resultAll;
    }
}
