package com.edu.hzau.cocs.fe.utils;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author yue
 */
@Slf4j
@Component
public class CommonUtils {
    static Map<String, String> map = new HashMap<>();

    static {
        map.put("is_host_of-changes_the_expression_by_microbiota-has_gene_kegg_info", "question-template-1");
        map.put("generates-has_hmdb_info", "question-template-2");
    }

    public String getQuestionTemplate(String datalogStr) {
        String body = datalogStr.substring(datalogStr.indexOf(":-") + 2, datalogStr.length() - 1).trim();
        String[] relationships = body.split("relationship:");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < relationships.length; i++) {
            if (i == 0) continue;
            if (i == relationships.length - 1) {
                sb.append(relationships[i], 0, relationships[i].indexOf("("));
            } else {
                sb.append(relationships[i], 0, relationships[i].indexOf("(")).append("-");
            }
        }
        String s = sb.toString();
        return map.getOrDefault(s, "null");
    }

    public JSONArray resultConvert(List list) {
        return JSONArray.parseArray(JSON.toJSONString(list));
    }

    public JdbcTemplate getJdbcTemplate(){

        BasicDataSource dataSource=new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/activiti?useUnicode=true&characterEncoding=utf8&serverTime=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("111111");
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
}
