package com.edu.hzau.cocs.fe.service;


import com.edu.hzau.cocs.fe.mapper.SubQueryMapper;
import com.edu.hzau.cocs.fe.pojo.Datalog;
import com.edu.hzau.cocs.fe.pojo.SwineMetabolismHmdbRes;
import com.edu.hzau.cocs.fe.pojo.SwineMicrobeGeneKeggRes;
import com.edu.hzau.cocs.fe.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author yue
 */
@Slf4j
@Service
public class SubQueryService {

    @Autowired
    private SubQueryMapper subQueryMapper;

    public List<SwineMicrobeGeneKeggRes> isHostOf(Datalog datalog) {
        StringBuilder subQuerySql = new StringBuilder(Constants.IS_HOST_OF);
        Map<String, String> relationship = datalog.getRelationship();
        if (relationship.containsKey("is_host_of")) {
            String relationshipStr = relationship.get("is_host_of");
            subQuerySql.append(String.format( " and is_host_of.relationship = %s", relationshipStr));
        }
        Map<String, Map<String, String>> attribute = datalog.getAttribute();
        if (attribute.containsKey("swine")) {
            Map<String, String> swineMap = attribute.get("swine");
            swineMap.forEach((k,v) -> subQuerySql.append(String.format(" and swine.%s = %s", k, v)));
        }
        if (attribute.containsKey("microbe")) {
            Map<String, String> microbeMap = attribute.get("microbe");
            microbeMap.forEach((k,v) -> subQuerySql. append(String.format(" and microbe.%s = %s", k, v)));
        }
        return subQueryMapper.getMicrobeBySwine(subQuerySql.toString());
    }

    public List<SwineMicrobeGeneKeggRes> changeTheExpressionByMicrobiota(Datalog datalog, List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList) {
        StringBuilder subQuerySql = new StringBuilder(Constants.CHANGE_THE_EXPRESSION_BY_MICROBIOTA);
        Map<String, String> relationship = datalog.getRelationship();
        if (relationship.containsKey("change_the_expression_by_microbiota")) {
            String relationshipStr = relationship.get("change_the_expression_by_microbiota");
            subQuerySql.append(String.format( " and change_the_expression_by_microbiota.relationship = %s", relationshipStr));
        }
        Map<String, Map<String, String>> attribute = datalog.getAttribute();
        if (attribute.containsKey("microbe")) {
            Map<String, String> swineMap = attribute.get("microbe");
            swineMap.forEach((k,v) -> subQuerySql.append(String.format(" and microbe.%s = %s", k, v)));
        }
        if (attribute.containsKey("gene")) {
            Map<String, String> microbeMap = attribute.get("gene");
            microbeMap.forEach((k,v) -> subQuerySql. append(String.format(" and gene.%s = %s", k, v)));
        }

        return subQueryMapper.getGeneByMicrobe(subQuerySql.toString(), swineMicrobeGeneKeggResList);
    }

    public List<SwineMicrobeGeneKeggRes> hasGeneKeggInfo(Datalog datalog, List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList) {
        StringBuilder subQuerySql = new StringBuilder(Constants.HAS_GENE_KEGG_INFO);
        Map<String, String> relationship = datalog.getRelationship();
        if (relationship.containsKey("has_gene_kegg_info")) {
            String relationshipStr = relationship.get("has_gene_kegg_info");
            subQuerySql.append(String.format( " and has_gene_kegg_info.relationship = %s", relationshipStr));
        }
        Map<String, Map<String, String>> attribute = datalog.getAttribute();
        if (attribute.containsKey("gene")) {
            Map<String, String> swineMap = attribute.get("gene");
            swineMap.forEach((k,v) -> subQuerySql.append(String.format(" and gene.%s = %s", k, v)));
        }
        if (attribute.containsKey("gene_kegg_info")) {
            Map<String, String> microbeMap = attribute.get("gene_kegg_info");
            microbeMap.forEach((k,v) -> subQuerySql. append(String.format(" and gene_kegg_info.%s = %s", k, v)));
        }

        return subQueryMapper.getKeggByGene(subQuerySql.toString(), swineMicrobeGeneKeggResList);
    }

    public List<SwineMetabolismHmdbRes> generates(Datalog datalog) {
        StringBuilder subQuerySql = new StringBuilder(Constants.GENERATES);
        Map<String, String> relationship = datalog.getRelationship();
        if (relationship.containsKey("generates")) {
            String relationshipStr = relationship.get("generates");
            subQuerySql.append(String.format( " and generates.relationship = %s", relationshipStr));
        }
        Map<String, Map<String, String>> attribute = datalog.getAttribute();
        if (attribute.containsKey("swine")) {
            Map<String, String> swineMap = attribute.get("swine");
            swineMap.forEach((k,v) -> subQuerySql.append(String.format(" and swine.%s = %s", k, v)));
        }
        if (attribute.containsKey("metabolism")) {
            Map<String, String> microbeMap = attribute.get("metabolism");
            microbeMap.forEach((k,v) -> subQuerySql. append(String.format(" and metabolism.%s = %s", k, v)));
        }
        return subQueryMapper.getMetabolismBySwine(subQuerySql.toString());
    }

    public List<SwineMetabolismHmdbRes> hasHmdbInfo(Datalog datalog, List<SwineMetabolismHmdbRes> swineMetabolismHmdbResList) {
        StringBuilder subQuerySql = new StringBuilder(Constants.HAS_HMDB_INFO);
        Map<String, String> relationship = datalog.getRelationship();
        if (relationship.containsKey("has_hmdb_info")) {
            String relationshipStr = relationship.get("has_hmdb_info");
            subQuerySql.append(String.format( " and has_hmdb_info.relationship = %s", relationshipStr));
        }
        Map<String, Map<String, String>> attribute = datalog.getAttribute();
        if (attribute.containsKey("gene")) {
            Map<String, String> swineMap = attribute.get("metabolism");
            swineMap.forEach((k,v) -> subQuerySql.append(String.format(" and metabolism.%s = %s", k, v)));
        }
        if (attribute.containsKey("metabolism_hmdb_info")) {
            Map<String, String> microbeMap = attribute.get("metabolism_hmdb_info");
            microbeMap.forEach((k,v) -> subQuerySql. append(String.format(" and metabolism_hmdb_info.%s = %s", k, v)));
        }
        return subQueryMapper.getHmdbByMetabolism(subQuerySql.toString(), swineMetabolismHmdbResList);
    }

}
