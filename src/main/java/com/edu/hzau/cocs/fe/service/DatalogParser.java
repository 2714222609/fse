package com.edu.hzau.cocs.fe.service;

/**
 * @Author yue
 */

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.stereotype.Service;
/**
 * 方案：每个relationship对应一个bpmn服务
 * 输入：重写后的datalog
 ?(Microbe_name,Gene_symbol,Gene_kegg_pathway) :-
 relationship_entity.is_host_of(Swine_id, Microbe_id, <100>),
 fsmm.microbe(Microbe_id, VAR_1, VAR_2, VAR_3, VAR_4, VAR_5, <1>, VAR_7),
 fsmm.swine(Swine_id, VAR_1, VAR_2, VAR_3, <100>, VAR_5, VAR_6),
 fsmm.microbe(Microbe_id, VAR_1, Microbe_name, VAR_3, VAR_4, VAR_5, VAR_6, VAR_7),

 relationship_entity.change_the_expression_by_microbiota(Microbe_id, Ncbi_gene_id, <change_the_expression_by_microbiota>),
 gene_info.gene(Ncbi_gene_id, Gene_symbol),

 relationship_entity.has_gene_kegg_info(Ncbi_gene_id, Gene_kegg_id, <has_gene_kegg_info>),
 gene_info.gene_kegg_info(Gene_kegg_id, VAR_1, Gene_kegg_pathway, VAR_3).

 难点1：子查询datalog如何存储和解析？
    1. 存储header
    2. 通过relationship字样来分割出每个子查询，存储关系和实体参数
 难点2：子查询之间如何传递？
    1. 通过主键传递？
    2. 通过对象传递？
 难点3：如何识别子查询？
    1. 通过relationship，switch case
 * ---> 重写后datalog
 *
 * 输出：从数据库中查出的数据
 */
@Slf4j
@Service
public class DatalogParser {
    public String datalogParser(String datalog) {
        if (datalog == null) {
            log.error("datalog is null");
            return null;
        }
        // todo
        return null;
    }

    @Test
    public void test() {

    }

}
