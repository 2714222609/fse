package com.edu.hzau.cocs.fe;

import com.alibaba.fastjson2.JSONArray;
import com.edu.hzau.cocs.fe.service.GraalService;
import com.edu.hzau.cocs.fe.service.SqlTranslation;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.*;
import java.util.LinkedHashMap;

/**
 * @Author yue
 */
@SpringBootTest
@Slf4j
public class SwineTests {
    @Autowired
    GraalService graalService;

    @Test
    public void testQ1(){
        JSONArray res = graalService.query("?(Microbe_name,Gene_symbol,Gene_kegg_pathway):-\n" +
//                "class:Swine(Swine_id),\n" +
//                "class:Microbiota(Microbe_id),\n" +
                "relationship:is_host_ofQ1(Swine_id,Microbe_id,<100>),\n" +
                "attribute:p_value_dpf_tpf(Microbe_id,<1>),\n" +
                "attribute:ages(Swine_id,<100>),\n" +
                "attribute:microbe_name(Microbe_id,Microbe_name),\n" +
//                "class:Microbiota(Microbe_id),\n" +
//                "class:Gene(Ncbi_gene_id),\n" +
                "relationship:changes_the_expression_by_microbiotaQ1(Microbe_id,Ncbi_gene_id,<change_the_expression_by_microbiota>),\n" +
                "attribute:gene_symbol(Ncbi_gene_id,Gene_symbol),\n" +
//                "class:Gene(Ncbi_gene_id),\n" +
//                "class:Gene_KEGG_Info(Gene_kegg_id),\n" +
                "relationship:has_gene_kegg_infoQ1(Ncbi_gene_id,Gene_kegg_id,<has_gene_kegg_info>),\n" +
                "attribute:gene_kegg_pathway(Gene_kegg_id,Gene_kegg_pathway).");
    }

    @Test
    public void testQ2(){
        JSONArray res = graalService.query("?(Microbe_name,Gene_symbol,Gene_kegg_pathway):-\n" +
//                "class:Swine(Swine_id),\n" +
//                "class:Microbiota(Microbe_id),\n" +
                "relationship:is_host_ofQ2(Swine_id,Microbe_id,<80>),\n" +
                "attribute:ages(Swine_id,<80>),\n" +
                "attribute:group(Microbe_id,<A1>),\n" +
                "attribute:p_value_age(Microbe_id,<1>),\n" +
                "attribute:microbe_name(Microbe_id,Microbe_name),\n" +
//                "class:Microbiota(Microbe_id),\n" +
//                "class:Gene(Ncbi_gene_id),\n" +
                "relationship:changes_the_expression_by_microbiotaQ2(Microbe_id,Ncbi_gene_id,<change_the_expression_by_microbiota>),\n" +
                "attribute:gene_symbol(Ncbi_gene_id,Gene_symbol),\n" +
//                "class:Gene(Ncbi_gene_id),\n" +
//                "class:Gene_KEGG_Info(Gene_kegg_id),\n" +
                "relationship:has_gene_kegg_infoQ2(Ncbi_gene_id,Gene_kegg_id,<has_gene_kegg_info>),\n" +
                "attribute:gene_kegg_pathway(Gene_kegg_id,Gene_kegg_pathway).");
    }

    @Test
    public void testQ3(){
        JSONArray res = graalService.query("?(Microbe_name,Gene_symbol,Gene_kegg_pathway):-\n" +
//                "class:Swine(Swine_id),\n" +
//                "class:Microbiota(Microbe_id),\n" +
                "relationship:is_host_ofQ3(Swine_id,Microbe_id,<131>),\n" +
                "attribute:ages(Swine_id,<131>),\n" +
                "attribute:taxonomy(Microbe_id,<Phylum>),\n" +
                "attribute:group(Microbe_id,<A1>),\n" +
                "attribute:p_value_age(Microbe_id,<1>),\n" +
                "attribute:microbe_name(Microbe_id,Microbe_name),\n" +
//                "class:Microbiota(Microbe_id),\n" +
//                "class:Gene(Ncbi_gene_id),\n" +
                "relationship:changes_the_expression_by_microbiotaQ3(Microbe_id,Ncbi_gene_id,<change_the_expression_by_microbiota>),\n" +
                "attribute:gene_symbol(Ncbi_gene_id,Gene_symbol),\n" +
//                "class:Gene(Ncbi_gene_id),\n" +
//                "class:Gene_KEGG_Info(Gene_kegg_id),\n" +
                "relationship:has_gene_kegg_infoQ3(Ncbi_gene_id,Gene_kegg_id,<has_gene_kegg_info>),\n" +
                "attribute:gene_kegg_pathway(Gene_kegg_id,Gene_kegg_pathway).");
    }

    @Test
    public void testQ4(){
        JSONArray res = graalService.query("?(Metabolome_name,Metabolome_pathway,Metabolome_pathway_url):-\n" +
//                "class:Swine(Swine_id),\n" +
//                "class:Metabolome(Metabolome_index),\n" +
                "relationship:generatesQ4(Swine_id,Metabolome_index,<generates>),\n" +
                "attribute:ages(Swine_id,<100>),\n" +
                "attribute:p_value(Metabolome_index,<1>),\n" +
                "attribute:fold_change(Metabolome_index,<1>),\n" +
                "attribute:vip(Metabolome_index,<1>),\n" +
                "attribute:metabolism_name(Metabolome_index,Metabolome_name),\n" +
//                "class:Metabolome(Metabolome_index),\n" +
//                "class:Metabolome_HMDB_info(Hmdb_info_index),\n" +
                "relationship:has_hmdb_infoQ4(Hmdb_info_index,Metabolome_index,<has_hmdb_info>),\n" +
                "attribute:metabolome_pathway_url(Hmdb_info_index,Metabolome_pathway_url),\n" +
                "attribute:metabolome_pathway(Hmdb_info_index,Metabolome_pathway).");
    }

}
