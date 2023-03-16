package com.edu.hzau.cocs.fe.controller;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.edu.hzau.cocs.fe.service.QueryService;
import lombok.extern.slf4j.Slf4j;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RserveException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @Author yue
 */
@Slf4j
@RestController
public class QueryController {
    @Autowired
    private QueryService queryService;

    @PostMapping("/query")
    public JSONArray query(@RequestBody JSONObject jsonObject) throws REXPMismatchException, IOException, RserveException {
        return queryService.query(jsonObject);
    }

}
