package com.edu.hzau.cocs.fe.mapper;

import com.edu.hzau.cocs.fe.pojo.SwineMetabolismHmdbRes;
import com.edu.hzau.cocs.fe.pojo.SwineMicrobeGeneKeggRes;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author yue
 */
@Component
public class SubQueryMapper {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<SwineMicrobeGeneKeggRes> getMicrobeBySwine(String sql) {
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            SwineMicrobeGeneKeggRes swineMicrobeGeneKeggRes = new SwineMicrobeGeneKeggRes();
            swineMicrobeGeneKeggRes.setSwineIndex(rs.getInt("swine_index"));
            swineMicrobeGeneKeggRes.setMicrobeId(rs.getInt("microbe_id"));
            swineMicrobeGeneKeggRes.setMicrobeName(String.valueOf(rs.getString("microbe_Name")));
            return swineMicrobeGeneKeggRes;
        });
    }

    public List<SwineMicrobeGeneKeggRes> getGeneByMicrobe(String sql, List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList) {
        List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggAns = new ArrayList<>();
        for (SwineMicrobeGeneKeggRes swineMicrobeGeneKeggRes : swineMicrobeGeneKeggResList) {
            String sqlQuery = sql + " and microbe.microbe_id = " + swineMicrobeGeneKeggRes.getMicrobeId();
            List<Map<String, Object>> resMaps = jdbcTemplate.queryForList(sqlQuery);
            for (Map<String, Object> map : resMaps) {
                SwineMicrobeGeneKeggRes swineMicrobeGeneKeggResNew = swineMicrobeGeneKeggRes.clone();
                swineMicrobeGeneKeggResNew.setNcbiGeneId(Integer.parseInt((String) map.get("NCBI_gene_id")));
                swineMicrobeGeneKeggResNew.setGeneSymbol(String.valueOf(map.get("Gene_Symbol")));
                swineMicrobeGeneKeggAns.add(swineMicrobeGeneKeggResNew);
            }
        }
        return swineMicrobeGeneKeggAns;
    }

    public List<SwineMicrobeGeneKeggRes> getKeggByGene(String sql, List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList) {
        List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggAns = new ArrayList<>();
        for (SwineMicrobeGeneKeggRes swineMicrobeGeneKeggRes : swineMicrobeGeneKeggResList) {
            String sqlQuery = sql + " and gene.NCBI_gene_id = " + swineMicrobeGeneKeggRes.getNcbiGeneId();
            List<Map<String, Object>> resMaps = jdbcTemplate.queryForList(sqlQuery);
            for (Map<String, Object> map : resMaps) {
                SwineMicrobeGeneKeggRes swineMicrobeGeneKeggResNew = swineMicrobeGeneKeggRes.clone();
                swineMicrobeGeneKeggResNew.setGeneKeggIndex((Integer) map.get("Gene_kegg_index"));
                swineMicrobeGeneKeggResNew.setGeneKeggPathway(String.valueOf(map.get("Gene_kegg_pathway")));
                swineMicrobeGeneKeggAns.add(swineMicrobeGeneKeggResNew);
            }
        }
        return swineMicrobeGeneKeggAns;
    }

    public List<SwineMetabolismHmdbRes> getMetabolismBySwine(String sql) {
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            SwineMetabolismHmdbRes swineMetabolismHmdbRes = new SwineMetabolismHmdbRes();
            swineMetabolismHmdbRes.setSwineIndex(rs.getInt("swine_index"));
            swineMetabolismHmdbRes.setMetabolismIndex(rs.getInt("metabolism_index"));
            swineMetabolismHmdbRes.setMetabolismName(rs.getString("metabolism_name"));
            return swineMetabolismHmdbRes;
        });
    }

    public List<SwineMetabolismHmdbRes> getHmdbByMetabolism(String sql, List<SwineMetabolismHmdbRes> swineMetabolismHmdbResList) {
        List<SwineMetabolismHmdbRes> swineMetabolismHmdbResAns = new ArrayList<>();
        for (SwineMetabolismHmdbRes swineMetabolismHmdbRes : swineMetabolismHmdbResList) {
            String sqlQuery = sql + " and metabolism.metabolism_index = " + swineMetabolismHmdbRes.getMetabolismIndex();
            List<Map<String, Object>> resMaps = jdbcTemplate.queryForList(sqlQuery);
            for (Map<String, Object> resMap : resMaps) {
                SwineMetabolismHmdbRes swineMetabolismHmdbResNew = swineMetabolismHmdbRes.clone();
                swineMetabolismHmdbResNew.setHmdbInfoIndex((Integer) resMap.get("hmdb_info_index"));
                swineMetabolismHmdbResNew.setHmdbPathway(String.valueOf(resMap.get("hmdb_pathway")));
                swineMetabolismHmdbResAns.add(swineMetabolismHmdbResNew);
            }
        }
        return swineMetabolismHmdbResAns;
    }

    public List<String> getTableStructure(String tableName) {
        SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(String.format("select * from %s limit 0", tableName));
        return List.of(sqlRowSet.getMetaData().getColumnNames());
    }
}
