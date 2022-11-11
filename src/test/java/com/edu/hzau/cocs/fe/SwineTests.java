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
        JSONArray res = graalService.query("?(Microbiota_id,Gene_symbol,Microbiota_kegg_info_index):-\n" +
                "class:Swine(Swine_id),\n" +
                "class:Microbiota(Microbiota_id),\n" +
                "relationship:is_host_ofQ1(Swine_id,Microbiota_id,<100>),\n" +
                "attribute:p_value_group(Microbiota_id,<1>),\n" +
                "attribute:age(Swine_id,<100>),\n" +
                "class:Microbiota(Microbiota_id),\n" +
                "class:Gene(Gene_symbol),\n" +
                "relationship:changes_the_expression_by_microbiotaQ1(Microbiota_id,Gene_symbol,<changes_the_expression_by_microbiota>),\n" +
                "attribute:gene_symbol(Gene_symbol,Gene_symbol),\n" +
                "class:Gene(Gene_symbol),\n" +
                "class:Gene_KEGG_Info(Microbiota_kegg_info_index),\n" +
                "relationship:has_gene_kegg_infoQ1(Gene_symbol,Microbiota_kegg_info_index,<has_gene_kegg_info>),\n" +
                "attribute:gene_kegg_pathway(Microbiota_kegg_info_index,Gene_kegg_pathway).");
    }

    @Test
    public void testQ2(){
        JSONArray res = graalService.query("?(Microbiota_id,Gene_symbol,Microbiota_kegg_info_index):-\n" +
                "class:Swine(Swine_id),\n" +
                "class:Microbiota(Microbiota_id),\n" +
                "relationship:is_host_ofQ2(Swine_id,Microbiota_id,<80>),\n" +
                "attribute:age(Swine_id,<80>),\n" +
                "attribute:group(Microbiota_id,<A>),\n" +
                "attribute:p_value_age(Microbiota_id,<1>),\n" +
                "class:Gene(Gene_symbol),\n" +
                "class:Microbiota(Microbiota_id),\n" +
                "relationship:changes_the_expression_by_microbiotaQ2(Microbiota_id,Gene_symbol,<changes_the_expression_by_microbiota>),\n" +
                "attribute:gene_symbol(Gene_symbol,Gene_symbol),\n" +
                "class:Gene(Gene_symbol),\n" +
                "class:Gene_KEGG_Info(Microbiota_kegg_info_index),\n" +
                "relationship:has_gene_kegg_infoQ2(Gene_symbol,Microbiota_kegg_info_index,<has_gene_kegg_info>),\n" +
                "attribute:gene_kegg_pathway(Microbiota_kegg_info_index,Gene_kegg_pathway).");
    }

    @Test
    public void testQ3(){
        JSONArray res = graalService.query("?(Microbiota_id,Gene_symbol,Microbiota_kegg_info_index):-\n" +
                "class:Swine(Swine_id),\n" +
                "class:Microbiota(Microbiota_id),\n" +
                "relationship:is_host_ofQ3(Swine_id,Microbiota_id,<131>),\n" +
                "attribute:age(Swine_id,<131>),\n" +
                "attribute:taxonomy(Microbiota_id,<Phylum>),\n" +
                "attribute:group(Microbiota_id,<A1>),\n" +
                "attribute:p_value_age(Microbiota_id,<1>),\n" +
                "relationship:changes_the_expression_by_microbiotaQ3(Microbiota_id,Gene_symbol,<changes_the_expression_by_microbiota>),\n" +
                "attribute:gene_symbol(Gene_symbol,Gene_symbol),\n" +
                "relationship:has_gene_kegg_infoQ3(Gene_symbol,Microbiota_kegg_info_index,<has_gene_kegg_info>),\n" +
                "attribute:gene_kegg_pathway(Microbiota_kegg_info_index,Gene_kegg_pathway).");
    }

    @Test
    public void testQ4(){
        JSONArray res = graalService.query("?(Metabolome_name,Metabolome_hmdb_pathways_name):-" +
                "class:Swine(Swine_id)," +
                "class:Metabolome(Metabolome_name)," +
                "relationship:generatesQ4(Swine_id,Metabolome_name,<generates>)," +
                "attribute:age(Swine_id,<100>)," +
                "attribute:p_value(Metabolome_name,<1>)," +
                "attribute:fold_change(Metabolome_name,<1>)," +
                "attribute:vip(Metabolome_name,<1>)," +
                "class:Metabolome(Metabolome_name)," +
                "class:Metabolome_HMDB_info(Metabolome_hmdb_info_index)," +
                "relationship:has_hmdb_infoQ4(Metabolome_name,Metabolome_hmdb_info_index,<has_hmdb_info>)," +
                "attribute:metabolome_hmdb_pathways_name(Metabolome_hmdb_info_index,Metabolome_hmdb_pathways_name).");
    }
}
