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
    void testQ1(){
        JSONArray result = fdaFunctions.query("?(Host_type,Food,Microbiota,Alteration_gene,Gene):-relationship:has_expression_change_results_by_microbiotaQ1(<TNF>,Microbiota_Gene_Index,Microbiota),relationship:has_expression_change_results_by_microbiotaQ1(Gene,Microbiota_Gene_Index,Microbiota),attribute:gene_expression_alteration_caused_by_microbiotaQ1(Microbiota_Gene_Index,Alteration_gene),attribute:gene_expression_host_typeQ1(Microbiota_Gene_Index,<human>),attribute:gene_expression_host_typeQ1(Microbiota_Gene_Index,Host_type),relationship:changes_the_abundance_of_by_foodQ1(Food,Microbiota,<changes_the_abundance_of_by_food>).");
    }

    @Test
    void testQ1WithClass(){
        JSONArray result = fdaFunctions.query("?(Host_type,Food,Microbiota,Alteration_gene,Gene):-class:gut_microbiota(Microbiota_Name),class:gut_microbiota_gene_change_results(Microbiota_Gene_Index),class:food(Food_Name),class:food_gut_microbiota_change_results(Food_Microbiota_Index),relationship:has_expression_change_results_by_microbiotaQ1(<TNF>,Microbiota_Gene_Index,Microbiota),relationship:has_expression_change_results_by_microbiotaQ1(Gene,Microbiota_Gene_Index,Microbiota),attribute:gene_expression_alteration_caused_by_microbiotaQ1(Microbiota_Gene_Index,Alteration_gene),attribute:gene_expression_host_typeQ1(Microbiota_Gene_Index,<human>),attribute:gene_expression_host_typeQ1(Microbiota_Gene_Index,Host_type),relationship:changes_the_abundance_of_by_foodQ1(Food,Microbiota,<changes_the_abundance_of_by_food>).");
    }

    @Test
    void testQ2(){
        JSONArray result = fdaFunctions.query("?(Host_type,Disorder,Alteration_microbiota,Microbiota,Alteration_gene,Gene,Kegg_pathway):-relationship:has_abundance_change_results_by_disorderQ2(Microbiota,Disorder_Microbiota_Index,Disorder),relationship:has_abundance_change_results_by_disorderQ2(Microbiota,Disorder_Microbiota_Index,<colorectal_carcinoma>),attribute:disorder_microbiota_host_typeQ2(Disorder_Microbiota_Index,<human>),attribute:microbiota_alteration_caused_by_disorderQ2(Disorder_Microbiota_Index,Alteration_microbiota),relationship:has_expression_change_results_by_microbiotaQ2(Gene,Microbiota_Gene_Index,Microbiota),attribute:gene_expression_alteration_caused_by_microbiotaQ2(Microbiota_Gene_Index,Alteration_gene),attribute:gene_expression_host_typeQ2(Microbiota_Gene_Index,<human>),attribute:gene_expression_host_typeQ2(Microbiota_Gene_Index,Host_type),relationship:has_kegg_charactersQ2(Gene,Gene_Character_Index,<has_kegg_characters>),attribute:gene_kegg_pathwayQ2(Gene_Character_Index,Kegg_pathway).");
    }

    @Test
    void testQ2WithClass() {
        JSONArray result = fdaFunctions.query("?(Disorder,Alteration_microbiota,Microbiota,Alteration_gene,Gene,Kegg_pathway):-class:disorder(Disorder),class:disorder_gut_microbiota_change_results(Disorder_Microbiota_Index),class:gut_microbiota(Microbiota),class:gut_microbiota_gene_change_results(Microbiota_Gene_Index),class:gene(Gene),class:gene_kegg_characters(Gene_Character_Index),relationship:has_abundance_change_results_by_disorderQ2(Microbiota,Disorder_Microbiota_Index,Disorder),relationship:has_abundance_change_results_by_disorderQ2(Microbiota,Disorder_Microbiota_Index,<colorectal_carcinoma>),attribute:disorder_microbiota_host_typeQ2(Disorder_Microbiota_Index,<human>),attribute:microbiota_alteration_caused_by_disorderQ2(Disorder_Microbiota_Index,Alteration_microbiota),relationship:has_expression_change_results_by_microbiotaQ2(Gene,Microbiota_Gene_Index,Microbiota),attribute:gene_expression_alteration_caused_by_microbiotaQ2(Microbiota_Gene_Index,Alteration_gene),relationship:has_kegg_charactersQ2(Gene,Gene_Character_Index,<has_kegg_characters>),attribute:gene_kegg_pathwayQ2(Gene_Character_Index,Kegg_pathway).");
    }

    @Test
    void testQ3(){
        JSONArray result = fdaFunctions.query("?(Host_type,Food,Alteration_microbiota,Microbiota,Metabolite):-relationship:has_abundance_change_results_by_foodQ3(Microbiota,Food_microbiota_index,<high-fat_diet>),relationship:has_abundance_change_results_by_foodQ3(Microbiota,Food_microbiota_index,Food),attribute:microbiota_alteration_caused_by_foodQ3(Food_microbiota_index,Alteration_microbiota),attribute:food_microbiota_host_typeQ3(Food_microbiota_index,<human>),attribute:food_microbiota_host_typeQ3(Food_microbiota_index,Host_type),relationship:generatesQ3(Microbiota,Metabolite,<generates>).");
    }
    @Test
    void testQ3WithClass(){
        JSONArray result = fdaFunctions.query("?(Food,Microbiota_name,Alteration,Metabolite_name):-\n" +
                "class:food(Food_name),\n" +
                "class:food_gut_microbiota_change_results(Food_Microbiota_Index),\n" +
                "class:gut_microbiota(Microbiota_Name),\n" +
                "class:gut_microbiota_metabolite_generation_results(Microbiota_Metabolite_Index),\n" +
                "relationship:has_abundance_change_results_by_foodQ3(Microbiota_name,Food_microbiota_index,<high-fat_diet>),\n" +
                "relationship:has_abundance_change_results_by_foodQ3(Microbiota_name,Food_microbiota_index,Food),\n" +
                "attribute:microbiota_alteration_caused_by_foodQ3(Food_microbiota_index,Alteration),\n" +
                "attribute:food_microbiota_host_typeQ3(Food_microbiota_index, <human>),\n" +
                "relationship:generatesQ3(Microbiota_name,Metabolite_name,<generates>).");
    }

    @Test
    void testQ4(){
        JSONArray result = fdaFunctions.query("?(Host_type,Microbiota,Gene,Alteration,Kegg_pathway):-relationship:has_expression_change_results_by_microbiota4(Gene,Microbiota_Gene_Index,<Faecalibacterium_prausnitzii>),relationship:has_expression_change_results_by_microbiota4(Gene,Microbiota_Gene_Index,Microbiota),attribute:gene_expression_alteration_caused_by_microbiotaQ4(Microbiota_Gene_Index,Alteration),attribute:gene_expression_alteration_caused_by_microbiotaQ4(Microbiota_Gene_Index,<decrease>),attribute:gene_expression_host_typeQ4(Microbiota_Gene_Index,<human>),attribute:gene_expression_host_typeQ4(Microbiota_Gene_Index,Host_type),relationship:has_kegg_charactersQ4(Gene,Kegg_Index,<has_kegg_characters>),attribute:gene_kegg_pathwayQ4(Kegg_Index,Kegg_pathway).");
    }

    @Test
    void testQ4WithClass(){
        JSONArray result = fdaFunctions.query("?(Microbiota,Gene,Alteration,Kegg_pathway):-class:gut_microbiota(Microbiota_name),class:gut_microbiota_gene_change_results(Microbiota_Gene_Index),class:gene(Gene_name),class:gene_kegg_characters(Gene_Character_Index),relationship:has_expression_change_results_by_microbiota4(Gene,Microbiota_Gene_Index,<Salmonella_enterica>),relationship:has_expression_change_results_by_microbiota4(Gene,Microbiota_Gene_Index,Microbiota),attribute:gene_expression_alteration_caused_by_microbiotaQ4(Microbiota_Gene_Index,Alteration),attribute:gene_expression_alteration_caused_by_microbiotaQ4(Microbiota_Gene_Index,<decrease>),relationship:has_kegg_charactersQ4(Gene,Gene_Character_Index,<has_kegg_characters>),attribute:gene_kegg_pathwayQ4(Gene_Character_Index,Kegg_pathway).");
    }

    @Test
    void testQ5(){
        JSONArray result = fdaFunctions.query("?(Drug,Microbiota,Alteration_microbiota,Gene,Alteration_gene,Kegg_pathway):-relationship:has_abundance_change_results_by_drugQ5(Microbiota,Drug_microbiot_index,<Infliximab>),relationship:has_abundance_change_results_by_drugQ5(Microbiota,Drug_microbiot_index,Drug),attribute:drug_gut_microbiota_change_resultsQ5(Drug_microbiot_index,Alteration_microbiota),relationship:has_expression_change_results_by_microbiotaQ5(Gene,Microbiota_gene_index,Microbiota),attribute:microbiota_gene_host_typeQ5(Microbiota_gene_index,<human>),attribute:microbiota_gene_alterationQ5(Microbiota_gene_index,Alteration_gene),relationship:has_kegg_charactersQ5(Gene,Kegg_Index,<has_kegg_characters>),attribute:gene_kegg_pathwayQ5(Kegg_Index,Kegg_pathway).");
    }

    @Test
    void testQ5WithClass(){
        JSONArray result = fdaFunctions.query("");
    }

    @Test
    void testQ6() {
        JSONArray result = fdaFunctions.query("?(Disorder,Microbiota,Alteration_Microbiota,Metabolite):-relationship:has_abundance_change_results_by_disorderQ6(Microbiota,Microbiota_index,<Helicobacter_pylori_infection>)," +
                "relationship:has_abundance_change_results_by_disorderQ6(Microbiota,Microbiota_index,Disorder)," +
                "attribute:microbiota_alteration_caused_by_disorderQ6(Microbiota_index,Alteration_Microbiota)," +
                "relationship:generatesQ6(Microbiota,Metabolite,<generates>).");
    }

    @Test
    void testQ6WithClass() {
        JSONArray result = fdaFunctions.query("?(Disorder,Microbiota,Alteration_Microbiota,Metabolite):-" +
                "class:disorder(Disorder_Name),class:disorder_gut_microbiota_change_results(Disorder_Microbiota_Index)," +
                "class:gut_microbiota(Gut_Microbiota_Name),class:gut_microbiota_metabolite_generation_results(Microbiota_Metabolite_Index)," +
                "relationship:has_abundance_change_results_by_disorderQ6(Microbiota,Microbiota_index,<Helicobacter_pylori_infection>)," +
                "relationship:has_abundance_change_results_by_disorderQ6(Microbiota,Microbiota_index,Disorder)," +
                "attribute:microbiota_alteration_caused_by_disorderQ6(Microbiota_index,Alteration_Microbiota)," +
                "relationship:generatesQ6(Microbiota,Metabolite,<generates>).");
    }

    @Test
    void testQ7() {
        JSONArray result = fdaFunctions.query("?(Host_type,Disorder,Alteration_microbiota,Microbiota,Metabolite):-relationship:has_abundance_change_results_by_disorderQ7(Microbiota,Microbiota_index,<Crohn_disease>),relationship:has_abundance_change_results_by_disorderQ7(Microbiota,Microbiota_index,Disorder),attribute:microbiota_alteration_caused_by_disorderQ7(Microbiota_index,Alteration_microbiota),attribute:microbiota_disorder_host_typeQ7(Microbiota_index,<human>),attribute:microbiota_disorder_host_typeQ7(Microbiota_index,Host_type),relationship:generatesQ7(Microbiota,Metabolite,<generates>).");
    }

    @Test
    void testQ7WithClass() {
        JSONArray result = fdaFunctions.query("?(Disorder,Microbiota,Alteration_microbiota,Metabolite):-class:disorder(Disorder_Name),class:disorder_gut_microbiota_change_results(Disorder_Microbiota_Index),class:gut_microbiota(Gut_Microbiota_Name),class:gut_microbiota_metabolite_generation_results(Microbiota_Metabolite_Index),relationship:has_abundance_change_results_by_disorderQ7(Microbiota,Microbiota_index,<Crohn_disease>),relationship:has_abundance_change_results_by_disorderQ7(Microbiota,Microbiota_index,Disorder),attribute:microbiota_alteration_caused_by_disorderQ7(Microbiota_index,Alteration_microbiota),relationship:generatesQ7(Microbiota,Metabolite,<generates>).");
    }

    @Test
    void testQ8() {
        JSONArray result = fdaFunctions.query("?(Host_type,Drug,Alteration_microbiota,Microbiota,Metabolite):-relationship:has_abundance_change_results_by_drugQ8(Microbiota,Drug_microbiota_index,<Metformin>),relationship:has_abundance_change_results_by_drugQ8(Microbiota,Drug_microbiota_index,Drug),attribute:drug_gut_microbiota_change_resultsQ8(Drug_microbiota_index,Alteration_microbiota),attribute:drug_gut_microbiota_host_typeQ8(Drug_microbiota_index,<human>),attribute:drug_gut_microbiota_host_typeQ8(Drug_microbiota_index,Host_type),relationship:generatesQ8(Microbiota,Metabolite,<generates>).");
    }

    @Test
    void testQ8WithClass() {
        JSONArray result = fdaFunctions.query("?(Drug,Microbiota,Alteration_microbiota,Metabolite):-class:drug(Drug_name),class:drug_gut_microbiota_change_results(Drug_Microbiota_Index),class:gut_microbiota(Gut_Microbiota_Name),class:gut_microbiota_metabolite_generation_results(Microbiota_Metabolite_Index),relationship:has_abundance_change_results_by_drugQ8(Microbiota,Drug_microbiota_index,<Opioid>),relationship:has_abundance_change_results_by_drugQ8(Microbiota,Drug_microbiota_index,Drug),attribute:drug_gut_microbiota_change_resultsQ8(Drug_microbiota_index,Alteration_microbiota),relationship:generatesQ8(Microbiota,Metabolite,<generates>).");
    }

    @Test
    void testQ9() {
        JSONArray result = fdaFunctions.query("?(Host_type,Disorder,Microbiota,Alteration_microbiota,Gene,Alteration_gene):-relationship:has_abundance_change_results_by_disorderQ9(Microbiota,Disorder_microbiota_index,<obesity>),relationship:has_abundance_change_results_by_disorderQ9(Microbiota,Disorder_microbiota_index,Disorder),attribute:microbiota_alteration_caused_by_disorderQ9(Disorder_microbiota_index,Alteration_microbiota),attribute:microbiota_disorder_host_typeQ9(Disorder_microbiota_index,<human>),attribute:microbiota_disorder_host_typeQ9(Disorder_microbiota_index,Host_type),relationship:has_expression_change_results_by_microbiotaQ9(Gene,Microbiota_gene_index,Microbiota),attribute:gene_expression_alteration_caused_by_microbiotaQ9(Microbiota_gene_index,Alteration_gene),attribute:gene_expression_microbiota_host_typeQ9(Microbiota_gene_index,<human>),attribute:gene_expression_microbiota_host_typeQ9(Microbiota_gene_index,Host_type).");
    }

    @Test
    void testQ9WithClass() {
        JSONArray result = fdaFunctions.query("?(Disorder,Microbiota,Alteration_microbiota,Gene,Alteration_gene):-class:disorder(Disorder_Name),class:disorder_gut_microbiota_change_results(Disorder_Microbiota_Index),class:gut_microbiota(Gut_Microbiota_Name),class:gut_microbiota_gene_change_results(Microbiota_Gene_Index),relationship:has_abundance_change_results_by_disorderQ9(Microbiota,Disorder_microbiota_index,<phenylketonuria>),relationship:has_abundance_change_results_by_disorderQ9(Microbiota,Disorder_microbiota_index,Disorder),attribute:microbiota_alteration_caused_by_disorderQ9(Disorder_microbiota_index,Alteration_microbiota),relationship:has_expression_change_results_by_microbiotaQ9(Gene,Microbiota_gene_index,Microbiota),attribute:gene_expression_alteration_caused_by_microbiotaQ9(Microbiota_gene_index,Alteration_gene).");
    }

    @Test
    void testQ101() {
        JSONArray result = fdaFunctions.query("?(Disorder,Microbiota,Alteration_microbiota,Gene):-relationship:has_abundance_change_results_by_disorderQ101(<Bacteroidetes>,Disorder_microbiota_index,Disorder),relationship:has_abundance_change_results_by_disorderQ101(Microbiota,Disorder_microbiota_index,Disorder),attribute:disorder_microbiota_alterationQ101(Disorder_microbiota_index,<decrease>),attribute:disorder_microbiota_alterationQ101(Disorder_microbiota_index,Alteration_microbiota),relationship:changes_the_expression_by_microbiotaQ101(Microbiota,Gene,<changes_the_expression_of_by_microbiota>).");
    }

    @Test
    void testQ101WithClass() {
        JSONArray result = fdaFunctions.query("?(Disorder,Microbiota,Alteration,Gene):-class:disorder(Disorder_Name),class:disorder_gut_microbiota_change_results(Disorder_Microbiota_Index),class:gut_microbiota(Gut_Microbiota_Name),class:gut_microbiota_gene_change_results(Microbiota_Gene_Index),relationship:has_abundance_change_results_by_disorderQ101(<Eubacterium>,Disorder_microbiota_index,Disorder),relationship:has_abundance_change_results_by_disorderQ101(Microbiota,Disorder_microbiota_index,Disorder),attribute:disorder_microbiota_host_typeQ101(Disorder_microbiota_index,<human>),attribute:disorder_microbiota_alterationQ101(Disorder_microbiota_index,<decrease>),attribute:disorder_microbiota_alterationQ101(Disorder_microbiota_index,Alteration),relationship:changes_the_expression_by_microbiotaQ101(Microbiota,Gene,<changes_the_expression_of_by_microbiota>).");
    }

    @Test
    void testQ102() {
        JSONArray result = fdaFunctions.query("?(Food,Microbiota,Alteration,Gene):-relationship:has_abundance_change_results_by_foodQ102(<Bacteroidetes>,Food_microbiota_index,Food),relationship:has_abundance_change_results_by_foodQ102(Microbiota,Food_microbiota_index,Food),attribute:food_microbiota_host_typeQ102(Food_microbiota_index,<human>),attribute:food_microbiota_alterationQ102(Food_microbiota_index,<decrease>),attribute:food_microbiota_alterationQ102(Food_microbiota_index,Alteration),relationship:changes_the_expression_by_microbiotaQ102(Microbiota,Gene,<changes_the_expression_of_by_microbiota>).");
    }

    @Test
    void testQ102WithClass() {
        JSONArray result = fdaFunctions.query("?(Food,Microbiota,Alteration,Gene):-class:food(Food_Name),class:food_gut_microbiota_change_results(Food_Microbiota_Index),class:gut_microbiota(Gut_Microbiota_Name),class:gut_microbiota_gene_change_results(Microbiota_Gene_Index),relationship:has_abundance_change_results_by_foodQ102(<Eubacterium>,Food_microbiota_index,Food),relationship:has_abundance_change_results_by_foodQ102(Microbiota,Food_microbiota_index,Food),attribute:food_microbiota_host_typeQ102(Food_microbiota_index,<human>),attribute:food_microbiota_alterationQ102(Food_microbiota_index,<decrease>),attribute:food_microbiota_alterationQ102(Food_microbiota_index,Alteration),relationship:changes_the_expression_by_microbiotaQ102(Microbiota,Gene,<changes_the_expression_of_by_microbiota>).");
    }

    @Test
    void testQ103() {
        JSONArray result = fdaFunctions.query("?(Drug,Microbiota,Alteration,Gene):-relationship:has_abundance_change_results_by_drugQ103(<Bacteroidetes>,Drug_microbiota_index,Drug),relationship:has_abundance_change_results_by_drugQ103(Microbiota,Drug_microbiota_index,Drug),attribute:drug_microbiota_host_typeQ103(Drug_microbiota_index,<human>),attribute:drug_microbiota_alterationQ103(Drug_microbiota_index,<decrease>),attribute:drug_microbiota_alterationQ103(Drug_microbiota_index,Alteration),relationship:changes_the_expression_by_microbiotaQ103(Microbiota,Gene,<changes_the_expression_of_by_microbiota>).");
    }

    @Test
    void testQ103WithClass() {
        JSONArray result = fdaFunctions.query("?(Drug,Microbiota,Alteration,Gene):-class:drug(Drug_Name),class:drug_gut_microbiota_change_results(Drug_Microbiota_Index),class:gut_microbiota(Gut_Microbiota_Name),class:gut_microbiota_gene_change_results(Microbiota_Gene_Index),relationship:has_abundance_change_results_by_drugQ103(<Eubacterium>,Drug_microbiota_index,Drug),relationship:has_abundance_change_results_by_drugQ103(Microbiota,Drug_microbiota_index,Drug),attribute:drug_microbiota_host_typeQ103(Drug_microbiota_index,<human>),attribute:drug_microbiota_alterationQ103(Drug_microbiota_index,<decrease>),attribute:drug_microbiota_alterationQ103(Drug_microbiota_index,Alteration),relationship:changes_the_expression_by_microbiotaQ103(Microbiota,Gene,<changes_the_expression_of_by_microbiota>).");
    }
}
