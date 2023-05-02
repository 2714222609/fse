package com.edu.hzau.cocs.fe.mapper;

import com.edu.hzau.cocs.fe.pojo.Gene;
import com.edu.hzau.cocs.fe.pojo.HMDBEntity;
import com.edu.hzau.cocs.fe.pojo.SwineMetabolismHmdbRes;
import com.edu.hzau.cocs.fe.pojo.SwineMicrobeGeneKeggRes;
import com.edu.hzau.cocs.fe.pojo.datasource.KEGGPathwayMap;
import com.edu.hzau.cocs.fe.utils.CommonUtils;
import com.edu.hzau.cocs.fe.utils.HMDBUtils;
import com.edu.hzau.cocs.fe.utils.KEGGUtils;
import lombok.extern.slf4j.Slf4j;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RserveException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author yue
 */
@Component
@Slf4j
public class SubQueryMapper {
    @Autowired
    KEGGUtils keggUtils;
    @Autowired
    HMDBUtils hmdbUtils;

    public List<SwineMicrobeGeneKeggRes> getMicrobeBySwine(String sql, List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList) throws SQLException {
        JdbcTemplate jdbcTemplate = new CommonUtils().getJdbcTemplate();
        swineMicrobeGeneKeggResList =  jdbcTemplate.query(sql, (rs, rowNum) -> {
            SwineMicrobeGeneKeggRes swineMicrobeGeneKeggRes = new SwineMicrobeGeneKeggRes();
            swineMicrobeGeneKeggRes.setSwineIndex(rs.getInt("swine_index"));
            swineMicrobeGeneKeggRes.setMicrobeId(rs.getInt("microbe_id"));
            swineMicrobeGeneKeggRes.setMicrobeName(String.valueOf(rs.getString("microbe_Name")));
            return swineMicrobeGeneKeggRes;
        });
        Connection connection = jdbcTemplate.getDataSource().getConnection();
        connection.close();
        return swineMicrobeGeneKeggResList;
    }

    public List<SwineMicrobeGeneKeggRes> getGeneByMicrobe(String sql, List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList) throws SQLException {
        JdbcTemplate jdbcTemplate = new CommonUtils().getJdbcTemplate();
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
        jdbcTemplate.getDataSource().getConnection().close();
        return swineMicrobeGeneKeggAns;
    }

    public List<SwineMicrobeGeneKeggRes> getKeggByGene(String sql, List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList) throws SQLException {
        JdbcTemplate jdbcTemplate = new CommonUtils().getJdbcTemplate();
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
        jdbcTemplate.getDataSource().getConnection().close();
        return swineMicrobeGeneKeggAns;
    }
    public List<SwineMicrobeGeneKeggRes> getKeggByGeneOnline(List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResList)  {
        JdbcTemplate jdbcTemplate = new CommonUtils().getJdbcTemplate();
        List<SwineMicrobeGeneKeggRes> swineMicrobeGeneKeggResAns = new ArrayList<>();
        for (SwineMicrobeGeneKeggRes swineMicrobeGeneKeggRes : swineMicrobeGeneKeggResList) {
            Gene gene = new Gene(swineMicrobeGeneKeggRes.getGeneSymbol(), String.valueOf(swineMicrobeGeneKeggRes.getNcbiGeneId()));
            try {
                List<Gene> geneList = new ArrayList<>();
                geneList.add(gene);
                List<KEGGPathwayMap> keggPathwayMapList = keggUtils.getKeggPathwayMap(geneList);
                KEGGPathwayMap keggPathwayMap = keggPathwayMapList.get(0);
                SwineMicrobeGeneKeggRes swineMicrobeGeneKeggResNew = swineMicrobeGeneKeggRes.clone();
                swineMicrobeGeneKeggResNew.setGeneKeggPathway(keggPathwayMap.getPathwayMap().toString());
                swineMicrobeGeneKeggResAns.add(swineMicrobeGeneKeggResNew);
            } catch (REXPMismatchException | IOException | RserveException e) {
                log.warn("{} get gene pathway online fail.", gene.getGeneSymbol());
            }
        }
        return swineMicrobeGeneKeggResAns;
    }

    public List<SwineMetabolismHmdbRes> getMetabolismBySwine(String sql, List<SwineMetabolismHmdbRes> swineMetabolismHmdbResList) throws SQLException {
        JdbcTemplate jdbcTemplate = new CommonUtils().getJdbcTemplate();
        swineMetabolismHmdbResList =  jdbcTemplate.query(sql, (rs, rowNum) -> {
            SwineMetabolismHmdbRes swineMetabolismHmdbRes = new SwineMetabolismHmdbRes();
            swineMetabolismHmdbRes.setSwineIndex(rs.getInt("swine_index"));
            swineMetabolismHmdbRes.setMetabolismIndex(rs.getInt("metabolism_index"));
            swineMetabolismHmdbRes.setMetabolismName(rs.getString("metabolism_name"));
            return swineMetabolismHmdbRes;
        });
        jdbcTemplate.getDataSource().getConnection().close();
        return swineMetabolismHmdbResList;
    }

    public List<SwineMetabolismHmdbRes> getHmdbByMetabolism(String sql, List<SwineMetabolismHmdbRes> swineMetabolismHmdbResList) throws SQLException {
        JdbcTemplate jdbcTemplate = new CommonUtils().getJdbcTemplate();
        List<SwineMetabolismHmdbRes> swineMetabolismHmdbResAns = new ArrayList<>();
        for (SwineMetabolismHmdbRes swineMetabolismHmdbRes : swineMetabolismHmdbResList) {
            String sqlQuery = sql + " and metabolism.metabolism_index = " + swineMetabolismHmdbRes.getMetabolismIndex();
            List<Map<String, Object>> resMaps = jdbcTemplate.queryForList(sqlQuery);
            for (Map<String, Object> resMap : resMaps) {
                SwineMetabolismHmdbRes swineMetabolismHmdbResNew = swineMetabolismHmdbRes.clone();
                swineMetabolismHmdbResNew.setHmdbInfoIndex((Integer) resMap.get("hmdb_info_index"));
                swineMetabolismHmdbResNew.setHmdbPathway(String.valueOf(resMap.get("hmdb_pathway")));
                swineMetabolismHmdbResNew.setMetabolismHmdbInfoIndex(String.valueOf(resMap.get("metabolism_hmdb_info_index")));
                swineMetabolismHmdbResNew.setHmdbPathwayUrl(String.valueOf(resMap.get("kegg_url")));
                swineMetabolismHmdbResAns.add(swineMetabolismHmdbResNew);
            }
        }
        jdbcTemplate.getDataSource().getConnection().close();
        return swineMetabolismHmdbResAns;
    }

    public List<SwineMetabolismHmdbRes> getHmdbByMetabolismOnline(String sql, List<SwineMetabolismHmdbRes> swineMetabolismHmdbResList) {
        JdbcTemplate jdbcTemplate = new CommonUtils().getJdbcTemplate();
        List<SwineMetabolismHmdbRes> swineMetabolismHmdbResAns = new ArrayList<>();
        for (SwineMetabolismHmdbRes swineMetabolismHmdbRes : swineMetabolismHmdbResList) {
            String sqlQuery = sql + " and metabolism.metabolism_index = " + swineMetabolismHmdbRes.getMetabolismIndex();
            List<Map<String, Object>> resMaps = jdbcTemplate.queryForList(sqlQuery);
            for (Map<String, Object> resMap : resMaps) {
                SwineMetabolismHmdbRes swineMetabolismHmdbResNew = swineMetabolismHmdbRes.clone();
                swineMetabolismHmdbResNew.setHmdbInfoIndex((Integer) resMap.get("hmdb_info_index"));
                swineMetabolismHmdbResNew.setMetabolismHmdbInfoIndex(String.valueOf(resMap.get("metabolism_hmdb_info_index")));
                swineMetabolismHmdbResAns.add(swineMetabolismHmdbResNew);
            }
        }
        for (SwineMetabolismHmdbRes swineMetabolismHmdbResAn : swineMetabolismHmdbResAns) {
            List<String> hmdbid = new ArrayList<>();
            hmdbid.add(swineMetabolismHmdbResAn.getMetabolismHmdbInfoIndex());
            List<HMDBEntity> hmdbEntity = hmdbUtils.getHmdbEntity(hmdbid);
            swineMetabolismHmdbResAn.setHmdbPathway(hmdbEntity.get(0).getPathway());
            swineMetabolismHmdbResAn.setHmdbPathwayUrl(hmdbEntity.get(0).getPathway());
        }
        return swineMetabolismHmdbResAns;
    }
}
