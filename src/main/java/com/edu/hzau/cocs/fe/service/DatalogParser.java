package com.edu.hzau.cocs.fe.service;

/**
 * @Author yue
 */

import com.edu.hzau.cocs.fe.mapper.SubQueryMapper;
import com.edu.hzau.cocs.fe.pojo.Datalog;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 方案：每个relationship对应一个bpmn服务
 * 输入：重写后的datalog
 * ?(Microbe_name,Gene_symbol,Gene_kegg_pathway) :-
 * relationship_entity.is_host_of(Swine_id, Microbe_id, <100>),
 * fsmm.microbe(Microbe_id, VAR_1, VAR_2, VAR_3, VAR_4, VAR_5, <1>, VAR_7),
 * fsmm.swine(Swine_id, VAR_1, VAR_2, VAR_3, <100>, VAR_5, VAR_6),
 * fsmm.microbe(Microbe_id, VAR_1, Microbe_name, VAR_3, VAR_4, VAR_5, VAR_6, VAR_7),
 * <p>
 * relationship_entity.change_the_expression_by_microbiota(Microbe_id, Ncbi_gene_id, <change_the_expression_by_microbiota>),
 * gene_info.gene(Ncbi_gene_id, Gene_symbol),
 * <p>
 * relationship_entity.has_gene_kegg_info(Ncbi_gene_id, Gene_kegg_id, <has_gene_kegg_info>),
 * gene_info.gene_kegg_info(Gene_kegg_id, VAR_1, Gene_kegg_pathway, VAR_3).
 */
@Slf4j
@Service
public class DatalogParser {
    @Autowired
    private SubQueryMapper subQueryMapper;

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
        Map<String, String> relationshipMap = new HashMap<>();
        Map<String, Map<String, String>> attributeMap = new HashMap<>();
        String body = datalogStr.substring(datalogStr.indexOf(":-") + 2, datalogStr.length() - 1).trim();
        String[] lines = body.split("\\),");
        for (String line : lines) {
            line = line.trim();
            String substr = line.substring(line.indexOf(".") + 1, line.indexOf("("));
            if (line.startsWith("relationship")) {
                String value = line.substring(line.indexOf("<") + 1, line.indexOf(">"));
                relationshipMap.put(substr, value);
            } else {
                String tableName = line.substring(0, line.indexOf("("));
                List<String> attributes = new ArrayList<>();
                String[] columns = line.substring(line.indexOf("(") + 1).split(",");
                for (String column : columns) {
                    attributes.add(column.trim());
                }
                List<String> tableStructure = subQueryMapper.getTableStructure(tableName);
                if (attributeMap.containsKey(substr)) {
                    Map<String, String> map = attributeMap.get(substr);
                    for (int i = 0; i < attributes.size(); i++) {
                        String attr = attributes.get(i);
                        if (attr.startsWith("<")) {
                            String column = tableStructure.get(i);
                            String value = attr.substring(1, attr.indexOf(">"));
                            map.put(column, value);
                        }
                    }
                }else {
                    Map<String, String> map = new HashMap<>();
                    for (int i = 0; i < attributes.size(); i++) {
                        String attr = attributes.get(i);
                        if (attr.startsWith("<")) {
                            String column = tableStructure.get(i);
                            String value = attr.substring(1, attr.indexOf(">"));
                            map.put(column, value);
                        }
                    }
                    attributeMap.put(substr, map);
                }
            }
            datalog.setRelationship(relationshipMap);
            datalog.setAttribute(attributeMap);
        }
        return datalog;
    }


}
