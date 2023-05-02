package com.edu.hzau.cocs.fe.service;

import com.edu.hzau.cocs.fe.mapper.SubQueryMapper;
import com.edu.hzau.cocs.fe.pojo.SwineMetabolismHmdbRes;
import com.edu.hzau.cocs.fe.pojo.SwineMicrobeGeneKeggRes;
import com.edu.hzau.cocs.fe.pojo.datalog.Datalog;
import com.edu.hzau.cocs.fe.pojo.datalog.Relationship;
import com.edu.hzau.cocs.fe.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RserveException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author yue
 */
@Slf4j
@Service
public class SubQueryService {
    private final SubQueryMapper subQueryMapper = new SubQueryMapper();
    private static final Map<String, String> mapper = new HashMap<>();
    static {
        String[] k = {"p_value_dpf_tpf_difference", "microbe_time", "group",
                "p_age_difference", "metabolome_difference", "metabolism_time"};
        String[] v = {"fsmm.microbe.microbe_dpf_tpf_difference", "fsmm.microbe.days",
                "fsmm.microbe.col", "fsmm.microbe.microbe_age_difference", "fsmm.metabolism.metabolome_difference",
                "metabolism_time"};
        for(int i = 0; i < k.length; i++) {
            mapper.put(k[i], v[i]);
        }
    }

    public List<SwineMicrobeGeneKeggRes> isHostOf(Datalog datalog, List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList) throws SQLException {
        StringBuilder subQuerySql = new StringBuilder(Constants.IS_HOST_OF);
        Map<String, Relationship> relationships = datalog.getRelationships();
        if (relationships.containsKey("is_host_of")) {
            Relationship is_host_of = relationships.get("is_host_of");
            Map<String, String> attributeMap = is_host_of.getAttributes();
            attributeMap.forEach((k, v) -> {
                String nk = mapper.get(k);
                subQuerySql.append(String.format(" and %s = '%s'", nk, v));
            });
        }
        swineMicrobeGeneKeggResList = subQueryMapper.getMicrobeBySwine(subQuerySql.toString(), swineMicrobeGeneKeggResList);
        return swineMicrobeGeneKeggResList;
    }

    public List<SwineMicrobeGeneKeggRes> changeTheExpressionByMicrobiota(Datalog datalog, List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList) throws SQLException {
        StringBuilder subQuerySql = new StringBuilder(Constants.CHANGE_THE_EXPRESSION_BY_MICROBIOTA);
        Map<String, Relationship> relationships = datalog.getRelationships();
        if (relationships.containsKey("changes_the_expression_by_microbiota")) {
            Relationship changes_the_expression_by_microbiota = relationships.get("changes_the_expression_by_microbiota");
            Map<String, String> attributeMap = changes_the_expression_by_microbiota.getAttributes();
            attributeMap.forEach((k, v) -> {
                String nk = mapper.get(k);
                subQuerySql.append(String.format(" and %s = '%s'", nk, v));
            });
        }
        return subQueryMapper.getGeneByMicrobe(subQuerySql.toString(), swineMicrobeGeneKeggResList);
    }

    public List<SwineMicrobeGeneKeggRes> hasGeneKeggInfo(Datalog datalog, List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList) throws REXPMismatchException, IOException, RserveException, SQLException {
        StringBuilder subQuerySql = new StringBuilder(Constants.HAS_GENE_KEGG_INFO);
        Map<String, Relationship> relationships = datalog.getRelationships();
        if (relationships.containsKey("has_gene_kegg_info")) {
            Relationship has_gene_kegg_info = relationships.get("has_gene_kegg_info");
            Map<String, String> attributeMap = has_gene_kegg_info.getAttributes();
            attributeMap.forEach((k, v) -> {
                String nk = mapper.get(k);
                subQuerySql.append(String.format(" and %s = '%s'", nk, v));
            });
        }
        return subQueryMapper.getKeggByGene(subQuerySql.toString(), swineMicrobeGeneKeggResList);
//        return subQueryMapper.getKeggByGeneOnline(swineMicrobeGeneKeggResList);
    }

    public List<SwineMetabolismHmdbRes> generates(Datalog datalog, List<SwineMetabolismHmdbRes> swineMetabolismHmdbResList) throws SQLException {
        StringBuilder subQuerySql = new StringBuilder(Constants.GENERATES);
        Map<String, Relationship> relationships = datalog.getRelationships();
        if (relationships.containsKey("generates")) {
            Relationship generates = relationships.get("generates");
            Map<String, String> attributeMap = generates.getAttributes();
            attributeMap.forEach((k, v) -> {
                String nk = mapper.get(k);
                subQuerySql.append(String.format(" and %s = '%s'", nk, v));
            });
        }
        swineMetabolismHmdbResList = subQueryMapper.getMetabolismBySwine(subQuerySql.toString(), swineMetabolismHmdbResList);
        return swineMetabolismHmdbResList;
    }

    public List<SwineMetabolismHmdbRes> hasHmdbInfo(Datalog datalog, List<SwineMetabolismHmdbRes> swineMetabolismHmdbResList) throws SQLException {
        StringBuilder subQuerySql = new StringBuilder(Constants.HAS_HMDB_INFO);
        Map<String, Relationship> relationships = datalog.getRelationships();
        if (relationships.containsKey("has_hmdb_info")) {
            Relationship has_hmdb_info = relationships.get("has_hmdb_info");
            Map<String, String> attributeMap = has_hmdb_info.getAttributes();
            attributeMap.forEach((k, v) -> {
                String nk = mapper.get(k);
                subQuerySql.append(String.format(" and %s = '%s'", nk, v));
            });
        }
//        return subQueryMapper.getHmdbByMetabolismOnline(subQuerySql.toString(), swineMetabolismHmdbResList);
        return subQueryMapper.getHmdbByMetabolism(subQuerySql.toString(), swineMetabolismHmdbResList);
    }
}
