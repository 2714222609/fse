package com.edu.hzau.cocs.fe.service;

import com.edu.hzau.cocs.fe.pojo.datalog.Datalog;
import com.edu.hzau.cocs.fe.pojo.datalog.Relationship;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author yue
 */
@Slf4j
@Service
public class DatalogParser {
    public Datalog parseDatalog(String datalogStr) {
        if (datalogStr == null) {
            log.error("> datalog is null");
            return null;
        }
        // 头部
        Datalog datalog = new Datalog();
        List<String> header = Arrays.asList(datalogStr.substring(2, datalogStr.indexOf(":-") - 1).split(","));
        datalog.setHeader(header);

        // 关系和属性
        String body = datalogStr.substring(datalogStr.indexOf(":-") + 2, datalogStr.length() - 1).trim();
        String[] relationships = body.split("relationship:");
        Map<String, Relationship> relationshipMap = new HashMap<>();
        for (int i = 1; i < relationships.length; i++) {
            Relationship rela = new Relationship();
            Map<String, String> attrMap = new HashMap<>();
            String[] re = relationships[i].split("\\),");
            for (int j = 0; j < re.length; j++) {
                if (j == 0) {
                    String relationship = re[j].substring(0, re[j].indexOf("("));
                    rela.setRelationship(relationship);
                } else {
                    if (re[j].contains("<")) {
                        String attrPrefix = re[j].substring(re[j].indexOf(":") + 1, re[j].indexOf("("));
                        String attrSuffix = re[j].substring(re[j].indexOf("<") + 1, re[j].indexOf(">"));
                        attrMap.put(attrPrefix, attrSuffix);
                    }
                }
            }
            rela.setAttributes(attrMap);
            relationshipMap.put(rela.getRelationship(), rela);
        }
        datalog.setRelationships(relationshipMap);
        return datalog;
    }
}
