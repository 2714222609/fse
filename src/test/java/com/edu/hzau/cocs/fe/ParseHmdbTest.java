package com.edu.hzau.cocs.fe;

import com.edu.hzau.cocs.fe.entity.HMDBEntity;
import com.edu.hzau.cocs.fe.utils.HMDBUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yue
 */
@SpringBootTest
@Slf4j
public class ParseHmdbTest {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    public void parseHmdbTest() {
        HMDBUtils hmdbUtils = new HMDBUtils();
        List<String> hmdbIds = hmdbUtils.getHmdbIdsFromCsv();
        List<HMDBEntity> hmdbEntity = hmdbUtils.getHmdbEntity(hmdbIds);
        for (HMDBEntity entity : hmdbEntity) {
            jdbcTemplate.update("insert into hmdb.metabolome_hmdb_info" +
                            "(`index`, pathway, kegg_url) values (?,?,?)",
                    entity.getHmdbId(),entity.getPathway(), entity.getImg());
            log.info("entity {} stored", entity);
        }
    }
}
