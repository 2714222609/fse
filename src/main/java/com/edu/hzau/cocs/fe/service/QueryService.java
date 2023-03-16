package com.edu.hzau.cocs.fe.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.edu.hzau.cocs.fe.pojo.Datalog;
import com.edu.hzau.cocs.fe.pojo.SwineMetabolismHmdbRes;
import com.edu.hzau.cocs.fe.pojo.SwineMicrobeGeneKeggRes;
import com.edu.hzau.cocs.fe.utils.CommonUtils;
import com.edu.hzau.cocs.fe.utils.DateUtils;
import com.edu.hzau.cocs.fe.utils.SecurityUtils;
import lombok.extern.slf4j.Slf4j;
import org.activiti.api.process.model.ProcessInstance;
import org.activiti.api.process.model.builders.ProcessPayloadBuilder;
import org.activiti.api.process.runtime.ProcessRuntime;
import org.activiti.api.runtime.shared.query.Page;
import org.activiti.api.runtime.shared.query.Pageable;
import org.activiti.api.task.model.Task;
import org.activiti.api.task.model.builders.TaskPayloadBuilder;
import org.activiti.api.task.runtime.TaskRuntime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Author yue
 */
@Slf4j
@Service
public class QueryService {

    @Autowired
    private GraalService graalService;
    @Autowired
    private DateUtils dateUtil;
    @Autowired
    private RedisService redisService;
    @Autowired
    private DatalogParser datalogParser;
    @Autowired
    private SubQueryService subQueryService;
    @Autowired
    private CommonUtils commonUtils;
    @Autowired
    private ProcessRuntime processRuntime;
    @Autowired
    private TaskRuntime taskRuntime;
    @Autowired
    private SecurityUtils securityUtils;

    public JSONArray query(@RequestBody JSONObject jsonObject) {
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
                // 启动流程引擎
                String processDefinitionKey = commonUtils.getQuestionTemplate((String) datalogStr);
                securityUtils.logInAs("user_00");
                ProcessInstance processInstance = processRuntime.start(ProcessPayloadBuilder.start().withProcessDefinitionKey(processDefinitionKey).build());
                log.info("> Process started: {}", processInstance);
                // 重写后datalo
                String rewriteDatalog = graalService.rewriteDatalog(String.valueOf(datalogStr));
                System.out.println(rewriteDatalog);
                // 转为Datalog object
                Datalog datalog = datalogParser.parseDatalog(rewriteDatalog);
                log.info("> Datalog object: {}", datalog);
                // 执行流程
                if (!processDefinitionKey.equals("question-template-2")) {
                    List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList = subQueryService.isHostOf(datalog);
                    List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggRes = subQueryService.changeTheExpressionByMicrobiota(datalog, swineMicrobeGeneKeggResList);
                    List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggAns = subQueryService.hasGeneKeggInfo(datalog, swineMicrobeGeneKeggRes);
                    resultJson = JSONArray.parseArray(JSON.toJSONString(swineMicrobeGeneKeggAns));
                }else {
                    List<SwineMetabolismHmdbRes> swineMetabolismHmdbResList = subQueryService.generates(datalog);
                    List<SwineMetabolismHmdbRes> swineMetabolismHmdbResAns = subQueryService.hasHmdbInfo(datalog, swineMetabolismHmdbResList);
                    resultJson = JSONArray.parseArray(JSON.toJSONString(swineMetabolismHmdbResAns));
                }

                // 结果转换
                Page<Task> taskPage = taskRuntime.tasks(Pageable.of(0, 1));
                for (Task task : taskPage.getContent()) {
                    taskRuntime.claim(TaskPayloadBuilder.claim().withTaskId(task.getId()).build());
                    taskRuntime.complete(TaskPayloadBuilder.complete().withTaskId(task.getId()).build());
                    log.info("> 任务完成: {}", task);
                }
                log.info("> json array: {}", resultJson);
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
