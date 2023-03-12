package com.edu.hzau.cocs.fe.controller;

import com.edu.hzau.cocs.fe.utils.SecurityUtils;
import lombok.extern.slf4j.Slf4j;
import org.activiti.api.process.model.ProcessDefinition;
import org.activiti.api.process.runtime.ProcessRuntime;
import org.activiti.api.runtime.shared.query.Page;
import org.activiti.api.runtime.shared.query.Pageable;
import org.activiti.api.task.runtime.TaskRuntime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.activiti.api.process.model.ProcessInstance;
import org.activiti.api.process.model.builders.ProcessPayloadBuilder;

/**
 * @Description
 * @Author yue
 * @Date 2023/3/9 20:03
 */
@Controller
@Slf4j

public class TestController {
    @Autowired
    private ProcessRuntime processRuntime;

    @Autowired
    private TaskRuntime taskRuntime;

    @Autowired
    private SecurityUtils securityUtils;


    @RequestMapping("/deploy")
    public String deploy(){
        securityUtils.logInAs("user_00");
        Page<ProcessDefinition> definitionPage = processRuntime.processDefinitions(Pageable.of(0, 10));
        log.info("> 可用的流程定义总数： {}", definitionPage.getTotalItems());
        for (ProcessDefinition processDefinition : definitionPage.getContent()) {
            log.info("> 流程定义内容：{}", processDefinition);
        }
        ProcessInstance processInstance = processRuntime.
                start(ProcessPayloadBuilder.
                        start().withProcessDefinitionKey("question-template-1").
                        build());
        log.info("> 流程实例的内容，{}", processInstance);
        ProcessInstance processInstance1 = processRuntime.
                start(ProcessPayloadBuilder.
                        start().withProcessDefinitionKey("question-template-2").
                        build());
        log.info("> 流程实例的内容，{}", processInstance1);
        return "hello world";
    }
}
