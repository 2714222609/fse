package com.edu.hzau.cocs.fe;

import com.alibaba.fastjson2.JSONArray;
import com.edu.hzau.cocs.fe.service.GraalService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author yue
 * @Date 2022/10/29 15:13
 */
@SpringBootTest
@Slf4j
public class SwineTests {
    @Autowired
    GraalService graalService;

    @Test
    public void testQ1(){
        JSONArray result = graalService.query("?(Microbiota_taxonomy_name,Gene_symbol,Microbiota_kegg_info_index):-" +
//                "class:Swine(Swine_id)," +
//                "class:Microbiota(Microbiota_taxonomy_name)," +
                "relationship:is_host_ofQ1(Swine_id,Microbiota_taxonomy_name,<100>)," +
                "attribute:p_value_group(Microbiota_taxonomy_name,<1>)," +
                "attribute:age(Swine_id,<100>)," +
//                "class:Microbiota(Microbiota_taxonomy_name)," +
//                "class:Gene(Gene_symbol)," +
                "relationship:changes_the_expression_by_microbiotaQ1(Gene_symbol,Microbiota_taxonomy_name,<changes_the_expression_by_microbiota>)," +
                "attribute:gene_symbol(Gene_symbol,Gene_symbol)," +
//                "class:Gene(Gene_symbol)," +
//                "class:Gene_KEGG_Info(Microbiota_kegg_info_index)," +
                "relationship:has_gene_kegg_infoQ1(Gene_symbol,Microbiota_kegg_info_index,<has_gene_kegg_info>)," +
                "attribute:gene_kegg_pathway(Microbiota_kegg_info_index,Gene_kegg_pathway).");
    }

    @Test
    public void testQ2(){
        JSONArray result = graalService.query("?(Microbiota_taxonomy_name,Gene_symbol,Microbiota_kegg_info_index):-" +
                "class:Swine(Swine_id)," +
                "class:Microbiota(Microbiota_taxonomy_name)," +
                "relationship:is_host_ofQ2(Swine_id,Microbiota_taxonomy_name,<is_host_of>)," +
                "attribute:age(Swine_id,<80>)," +
                "attribute:group(Microbiota_taxonomy_name,<A>)," +
                "attribute:p_value_age(Microbiota_taxonomy_name,<1>)," +
                "class:Gene(Gene_symbol)," +
                "class:Microbiota(Microbiota_taxonomy_name)," +
                "relationship:changes_the_expression_by_microbiotaQ2(Gene_symbol,Microbiota_taxonomy_name,<changes_the_expression_by_microbiota>)," +
                "attribute:gene_symbol(Gene_symbol,Gene_symbol)," +
                "class:Gene(Gene_symbol)," +
                "class:Gene_KEGG_Info(Microbiota_kegg_info_index)," +
                "relationship:has_gene_kegg_info(Gene_symbol,Microbiota_kegg_info_index,<has_gene_kegg_info>)," +
                "attribute:gene_kegg_pathway(Microbiota_kegg_info_index,Gene_kegg_pathway).");
    }

    @Test
    public void testQ3(){
        JSONArray result = graalService.query("?(Microbiota_taxonomy_name,Gene_symbol,Microbiota_kegg_info_index):-" +
                "class:Swine(Swine_id)," +
                "class:Microbiota(Microbiota_taxonomy_name)," +
                "relationship:is_host_ofQ3(Swine_id,Microbiota_taxonomy_name,<is_host_of>)," +
                "attribute:age(Swine_id,<131>)," +
                "attribute:taxonomy(Microbiota_taxonomy_name,<Phylum>)," +
                "attribute:group(Microbiota_taxonomy_name,<A1>)," +
                "attribute:p_value_age(Microbiota_taxonomy_name,<1>)," +
                "relationship:changes_the_expression_by_microbiotaQ3(Gene_symbol,microbiota_taxonomy_name,Microbiota_taxonomy_name,<changes_the_expression_by_microbiota>)," +
                "attribute:gene_symbol(Gene_symbol,Gene_symbol)," +
                "relationship:has_gene_kegg_infoQ3(Gene_symbol,Microbiota_kegg_info_index,<has_gene_kegg_info>)," +
                "attribute:gene_kegg_pathway(Microbiota_kegg_info_index,Gene_kegg_pathway).");
    }

    @Test
    public void testQ4(){

    }
}
