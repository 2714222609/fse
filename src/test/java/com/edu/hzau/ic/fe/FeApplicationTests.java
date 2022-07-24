package com.edu.hzau.ic.fe;

import com.alibaba.fastjson2.JSONArray;
import com.edu.hzau.ic.fe.service.FDAFunctions;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class FeApplicationTests {

    @Autowired
    FDAFunctions fdaFunctions;

    @Test
    void contextLoads() {
        JSONArray results = fdaFunctions.query("?(Disorder,Alteration_Microbio,Microbiota,Alteration_Gene,Gene):-relationship:has_abundance_change_results_by_disorder(Microbiota,Index,<colorectal_carcinoma>)," +
                "attribute:Disorder(X,Disorder)," +
                "attribute:disorder_microbiota_host_type(Index,<human>)," +
                "attribute:microbiota_alteration_caused_by_disorder(Index,Alteration_Microbio)," +
                "relationship:has_expression_change_results_by_microbiota(Gene,Index1,Microbiota)," +
                "attribute:gene_expression_alteration_caused_by_microbiota(Index1,Alteration_Gene).");
        log.info("results: " + results);
    }

    @Test
    void testQ1(){
        JSONArray result = fdaFunctions.query("?(Gene,Microbiota,Alteration_gene,Food):-relationship:has_expression_change_results_by_microbiotaQ1(<Foxp3>,Microbiota_gene_index,Microbiota)," +
        "relationship:has_expression_change_results_by_microbiotaQ1(Gene,Microbiota_gene_index,Microbiota)," +
        "attribute:gene_expression_alteration_caused_by_microbiotaQ1(Microbiota_gene_index,Alteration_gene)," +
        "relationship:changes_the_abundance_of_by_foodQ1(Food,Microbiota,<changes_the_abundance_of_by_food>).");
    }

    @Test
    void testQ2(){
        JSONArray result = fdaFunctions.query("?(Disorder,Alteration_microbio,Microbiota,Alteration_gene,Gene,Kegg_pathway):-relationship:has_abundance_change_results_by_disorder(Microbiota,Index,<colorectal_cancer>)," +
                "attribute:Disorder(X,Disorder)," +
                "attribute:disorder_microbiota_host_type(Index,<human>)," +
                "attribute:microbiota_alteration_caused_by_disorder(Index,Alteration_microbio)," +
                "relationship:has_expression_change_results_by_microbiota(Gene,Index1,Microbiota)," +
                "attribute:gene_expression_alteration_caused_by_microbiota(Index1,Alteration_gene)," +
                "attribute:kegg(Gene,Kegg_pathway).");
    }

    @Test
    void testQ3(){
        JSONArray result = fdaFunctions.query("?(Food,Microbiota_name,Alteration,Metabolite_name):-relationship:has_abundance_change_results_by_foodQ3(Microbiota_name,Food_microbiota_index,<red_wine>)," +
                "relationship:has_abundance_change_results_by_foodQ3(Microbiota_name,Food_microbiota_index,Food)," +
                "attribute:microbiota_alteration_caused_by_foodQ3(Food_microbiota_index,Alteration)," +
                "attribute:food_microbiota_host_typeQ3(Food_microbiota_index, <human>)," +
                "relationship:generatesQ3(Microbiota_name,Metabolite_name,<generates>).");
    }

    @Test
    void testQ4(){
        JSONArray result = fdaFunctions.query("?(Disorder,Microbiota,Alteration_microbiota,Gene,Kegg_network):-relationship:has_abundance_change_results_by_disorderQ4(<Salmonella_enterica>,disorder_microbiota_index,Disorder)," +
                "relationship:has_abundance_change_results_by_disorderQ4(Microbiota,disorder_microbiota_index,Disorder)," +
                "attribute:microbiota_alteration_cuased_by_disorderQ4(disorder_microbiota_index,<increase>)," +
                "attribute:microbiota_alteration_cuased_by_disorderQ4(disorder_microbiota_index,Alteration_microbiota)," +
                "relationship:has_expression_change_results_by_microbiotaQ4(Gene,microbiota_gene_index,Microbiota)," +
                "attribute:kegg(Gene,Kegg_network).");
    }

    @Test
    void testQ5(){
        JSONArray result = fdaFunctions.query("?(Microbiota,Gene,Kegg_pathway):-relationship:changes_the_abundance_of_by_drug5(<Acetaminophen>,Microbiota)," +
                "relationship:changes_the_expression_of_by_microbiota5(Microbiota,Gene)," +
                "attribute:gene5(Gene)," +
                "relationship:has_kegg_characters5(Gene,Index)," +
                "attribute:gene_kegg_characters5(Index,Kegg_pathway).");
    }

    @Test
    void testQ6() {
        JSONArray result = fdaFunctions.query("?(Disorder,Microbiota,Alteration_Microbiota,Metabolite):-relationship:has_abundance_change_results_by_disorderQ6(Microbiota,Microbiota_index,<Helicobacter_pylori_infection>)," +
                "relationship:has_abundance_change_results_by_disorderQ6(Microbiota,Microbiota_index,Disorder)," +
                "attribute:microbiota_alteration_caused_by_disorderQ6(Microbiota_index,Alteration_Microbiota)," +
                "relationship:generatesQ6(Microbiota,Metabolite,<generates>).");
    }

    @Test
    void testQ7() {
        JSONArray result = fdaFunctions.query("?(Disorder,Microbiota,Alteration_microbiota,Metabolite):-relationship:has_abundance_change_results_by_disorderQ7(Microbiota,Microbiota_index,<Crohn_disease>)," +
                "relationship:has_abundance_change_results_by_disorderQ7(Microbiota,Microbiota_index,Disorder)," +
                "attribute:microbiota_alteration_caused_by_disorderQ7(Microbiota_index,Alteration_microbiota)," +
                "relationship:generatesQ7(Microbiota,Metabolite,<generates>).");
    }

    @Test
    void testQ8() {
        JSONArray result = fdaFunctions.query("?(Drug,Microbiota,Alteration_microbiota,Metabolite):-relationship:has_abundance_change_results_by_drugQ8(Microbiota,Drug_microbiota_index,<Opioid>)," +
                "relationship:has_abundance_change_results_by_drugQ8(Microbiota,Drug_microbiota_index,Drug)," +
                "attribute:drug_gut_microbiota_change_resultsQ8(Drug_microbiota_index,Alteration_microbiota)," +
                "relationship:generatesQ8(Microbiota,Metabolite,<generates>).");
    }

    @Test
    void testQ9() {
        JSONArray result = fdaFunctions.query("?(Disorder,Microbiota,Alteration_microbiota,Gene,Alteration_gene):-relationship:has_abundance_change_results_by_disorderQ9(Microbiota,Disorder_microbiota_index,<phenylketonuria>)," +
                "relationship:has_abundance_change_results_by_disorderQ9(Microbiota,Disorder_microbiota_index,Disorder)," +
                "attribute:microbiota_alteration_caused_by_disorderQ9(Disorder_microbiota_index,Alteration_microbiota)," +
                "relationship:has_expression_change_results_by_microbiotaQ9(Gene,Microbiota_gene_index,Microbiota)," +
                "attribute:gene_expression_alteration_caused_by_microbiotaQ9(Microbiota_gene_index,Alteration_gene).");
    }

}
