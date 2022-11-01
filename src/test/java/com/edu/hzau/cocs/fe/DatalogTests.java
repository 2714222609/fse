package com.edu.hzau.cocs.fe;

import com.edu.hzau.cocs.fe.entity.datalog.Datalog;
import com.edu.hzau.cocs.fe.utils.KEGGUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description
 * @Author yue
 * @Date 2022/9/28 14:40
 */
@SpringBootTest
public class DatalogTests {
    @Autowired
    private KEGGUtils keggUtils;

    @Test
    public void test() {
        String datalogStr = "?(Host_type,Disorder,Alteration_microbiota,Microbiota,Alteration_gene,Gene,Kegg_pathway):-" +
                "class:disorder(Disorder)," +
                "class:disorder_gut_microbiota_change_results(Disorder_Microbiota_Index)," +
                "class:gut_microbiota(Microbiota)," +
                "class:gut_microbiota_gene_change_results(Microbiota_Gene_Index)," +
                "class:gene(Gene)," +
                "class:gene_kegg_characters(Gene_Character_Index)," +
                "relationship:has_abundance_change_results_by_disorderQ2(Microbiota,Disorder_Microbiota_Index,Disorder)," +
                "relationship:has_abundance_change_results_by_disorderQ2(Microbiota,Disorder_Microbiota_Index,<colorectal_carcinoma>)," +
                "attribute:disorder_microbiota_host_typeQ2(Disorder_Microbiota_Index,<human>)," +
                "attribute:microbiota_alteration_caused_by_disorderQ2(Disorder_Microbiota_Index,Alteration_microbiota)," +
                "relationship:has_expression_change_results_by_microbiotaQ2(Gene,Microbiota_Gene_Index,Microbiota)," +
                "attribute:gene_expression_alteration_caused_by_microbiotaQ2(Microbiota_Gene_Index,Alteration_gene)," +
                "attribute:gene_expression_host_typeQ2(Microbiota_Gene_Index,<human>)," +
                "attribute:gene_expression_host_typeQ2(Microbiota_Gene_Index,Host_type)," +
                "relationship:has_kegg_charactersQ2(Gene,Gene_Character_Index,<has_kegg_characters>)," +
                "attribute:gene_kegg_pathwayQ2(Gene_Character_Index,Kegg_pathway).";
        Datalog datalog = new Datalog(datalogStr);
        System.out.println("datalog解析 --> " + datalog);
        System.out.println("\ndatalog反解析 --> " + datalog.getDatalogString());

    }
}
