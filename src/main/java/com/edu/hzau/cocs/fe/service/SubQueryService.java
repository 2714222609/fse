package com.edu.hzau.cocs.fe.service;


import com.edu.hzau.cocs.fe.pojo.Datalog;
import com.edu.hzau.cocs.fe.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author yue
 */
@Slf4j
@Service
public class SubQueryService {

    public String isHostOf(Datalog datalog) {
        StringBuilder subQuerySql = new StringBuilder(Constants.IS_HOST_OF);
        Map<String, Map<String, String>> attribute = datalog.getAttribute();
        if (attribute.containsKey("swine")) {
            Map<String, String> swineMap = attribute.get("swine");
            swineMap.forEach((k,v) -> subQuerySql.append(String.format(" and swine.%s = %s", k, v)));
        }
        if (attribute.containsKey("microbe")) {
            Map<String, String> microbeMap = attribute.get("microbe");
            microbeMap.forEach((k,v) -> subQuerySql. append(String.format(" and microbe.%s = %s", k, v)));
        }
        return subQuerySql.toString();
    }

    public String changeTheExpressionByMicrobiota(Datalog datalog) {
        StringBuilder subQuerySql = new StringBuilder(Constants.CHANGE_THE_EXPRESSION_BY_MICROBIOTA);
        Map<String, Map<String, String>> attribute = datalog.getAttribute();
        if (attribute.containsKey("microbe")) {
            Map<String, String> swineMap = attribute.get("microbe");
            swineMap.forEach((k,v) -> subQuerySql.append(String.format(" and microbe.%s = %s", k, v)));
        }
        if (attribute.containsKey("gene")) {
            Map<String, String> microbeMap = attribute.get("gene");
            microbeMap.forEach((k,v) -> subQuerySql. append(String.format(" and gene.%s = %s", k, v)));
        }
        return subQuerySql.toString();
    }

    public String hasGeneKeggInfo(Datalog datalog) {
        StringBuilder subQuerySql = new StringBuilder(Constants.HAS_GENE_KEGG_INFO);
        Map<String, Map<String, String>> attribute = datalog.getAttribute();
        if (attribute.containsKey("gene")) {
            Map<String, String> swineMap = attribute.get("gene");
            swineMap.forEach((k,v) -> subQuerySql.append(String.format(" and gene.%s = %s", k, v)));
        }
        if (attribute.containsKey("gene_kegg_info")) {
            Map<String, String> microbeMap = attribute.get("gene_kegg_info");
            microbeMap.forEach((k,v) -> subQuerySql. append(String.format(" and gene_kegg_info.%s = %s", k, v)));
        }
        return subQuerySql.toString();
    }

    public String hasHmdbInfo(Datalog datalog) {
        StringBuilder subQuerySql = new StringBuilder(Constants.HAS_GENE_KEGG_INFO);
        Map<String, Map<String, String>> attribute = datalog.getAttribute();
        if (attribute.containsKey("gene")) {
            Map<String, String> swineMap = attribute.get("metabolism");
            swineMap.forEach((k,v) -> subQuerySql.append(String.format(" and metabolism.%s = %s", k, v)));
        }
        if (attribute.containsKey("metabolism_hmdb_info")) {
            Map<String, String> microbeMap = attribute.get("metabolism_hmdb_info");
            microbeMap.forEach((k,v) -> subQuerySql. append(String.format(" and metabolism_hmdb_info.%s = %s", k, v)));
        }
        return subQuerySql.toString();
    }

    public String generates(Datalog datalog) {
        StringBuilder subQuerySql = new StringBuilder(Constants.HAS_GENE_KEGG_INFO);
        Map<String, Map<String, String>> attribute = datalog.getAttribute();
        if (attribute.containsKey("swine")) {
            Map<String, String> swineMap = attribute.get("swine");
            swineMap.forEach((k,v) -> subQuerySql.append(String.format(" and swine.%s = %s", k, v)));
        }
        if (attribute.containsKey("metabolism")) {
            Map<String, String> microbeMap = attribute.get("metabolism");
            microbeMap.forEach((k,v) -> subQuerySql. append(String.format(" and metabolism.%s = %s", k, v)));
        }
        return subQuerySql.toString();
    }
}
