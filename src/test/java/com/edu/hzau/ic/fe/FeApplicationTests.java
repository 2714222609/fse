package com.edu.hzau.ic.fe;

import com.edu.hzau.ic.fe.service.FDAFunctions;
import net.sf.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Function;

@SpringBootTest
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
        System.out.println(results);
    }

    @Test
    void testQ1(){
        JSONArray result = fdaFunctions.query("?(Gene,Microbiota,Alteration_gene,Food):-relationship:has_expression_change_results_by_microbiotaQ1(<Foxp3>,Microbiota_gene_index,Microbiota)," +
        "relationship:has_expression_change_results_by_microbiotaQ1(Gene,Microbiota_gene_index,Microbiota)," +
        "attribute:gene_expression_alteration_caused_by_microbiotaQ1(Microbiota_gene_index,Alteration_gene)," +
        "relationship:changes_the_abundance_of_by_foodQ1(Food,Microbiota,<changes_the_abundance_of_by_food>).");
        System.out.println(result);
    }
}
