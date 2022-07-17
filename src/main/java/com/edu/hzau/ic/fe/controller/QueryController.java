package com.edu.hzau.ic.fe.controller;

import com.edu.hzau.ic.fe.service.FDAFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yue
 */

@RestController
public class QueryController {
    @Autowired
    FDAFunctions fdaFunctions;

    @PostMapping("/query")
    public JSONArray query(@RequestBody JSONObject jsonObject) {
        String datalog = (String) jsonObject.get("datalog");
        return fdaFunctions.query(datalog);
    }
}
