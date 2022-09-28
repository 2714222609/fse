package com.edu.hzau.ic.fe.service;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.edu.hzau.ic.fe.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author yue
 */
@Slf4j
@Service
public class QueryService {
    @Autowired
    FDAFunctions fdaFunctions;
    @Autowired
    DateUtils dateUtil;
    @Autowired
    RedisService redisService;

    public JSONArray query(@RequestBody JSONObject jsonObject) {
        // response time
        double startTime = dateUtil.getDate();
        double endTime;

        JSONArray datalogs = jsonObject.getJSONArray("datalog");
        JSONArray resultAll = new JSONArray();
        int responseCount = 0;
        // 处理每一条datalog
        for (Object datalog : datalogs) {
            JSONArray resultJson = null;
            // 缓存
            String key = String.valueOf(datalog.hashCode());
            String resultString = redisService.getString(key);
            if (resultString != null) {
                resultJson = JSONArray.parseArray(resultString);
            }else {
                log.info("Query cache missed.");
                resultJson = fdaFunctions.query((String) datalog);
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
