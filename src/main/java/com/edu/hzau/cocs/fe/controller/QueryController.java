package com.edu.hzau.cocs.fe.controller;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.edu.hzau.cocs.fe.service.QueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yue
 */
@Slf4j
@RestController
public class QueryController {
    @Autowired
    QueryService queryService;

    @PostMapping("/query")
    public JSONArray query(@RequestBody JSONObject jsonObject) {
        return queryService.query(jsonObject);
    }
}
