package com.edu.hzau.cocs.fe;

import com.alibaba.fastjson2.JSONArray;
import com.edu.hzau.cocs.fe.mapper.SubQueryMapper;
import com.edu.hzau.cocs.fe.pojo.DisDrugTarGenePath;
import com.edu.hzau.cocs.fe.pojo.SwineMicrobeGeneKeggRes;
import com.edu.hzau.cocs.fe.pojo.datalog.Datalog;
import com.edu.hzau.cocs.fe.service.DatalogParser;
import com.edu.hzau.cocs.fe.service.SubQueryService;
import com.edu.hzau.cocs.fe.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author yue
 */
@SpringBootTest
@Slf4j
public class SwineTests {

    @Autowired
    SubQueryService subQueryService;
    @Autowired
    DatalogParser datalogParser;
    @Autowired
    SubQueryMapper subQueryMapper;

    @Test
    public void testQ1(){
        DatalogParser datalogParser = new DatalogParser();
        SubQueryService subQueryService = new SubQueryService();
       // SubQueryMapper subQueryMapper = new SubQueryMapper();
        String datalog5 = "?(ORPHAN_name,Drug_name,Target_name,Gene_name,Pathway_name,Pathway_graph_url):-\n" +
                "relationship:cures_of(ORPHAN_id,Drug_id,<cures_of>),\n" +
                "attribute:ORPHAN_name(ORPHAN_id,<Benign adult familial myoclonic epilepsy>),\n" +
                "attribute:drug_name(Drug_id,Drug_name),\n" +
                // "attribute:drug_type(Drug_id,<Protein>),\n" +
                "relationship:has_functions_in(Drug_id,Target_id,<has_functions_in>),\n" +
                "attribute:target_name(Target_id,Target_name),\n" +
                "relationship:is_encoded_by_gene(Target_id,Gene_id),\n" +
                "attribute:gene_symbol(Gene_id,Gene_symbol),\n" +
                "relationship:takes_part_in(Gene_id,Pathway_id,takes_part_in),\n" +
                "attribute:pathway_name(Pathway_id,Pathway_name),\n" +
                "attribute:pathway_graph(Pathway_id,Pathway_graph_url).";
        Datalog datalog = datalogParser.parseDatalog(datalog5);
        System.out.println(datalog);
        String sql = Constants.IS_HOST_OF;
        System.out.println(sql);
        subQueryMapper.getDrugByRareDis(sql);
        //subQueryService.curesOf(datalog);
        //List<DisDrugTarGenePath> disDrugTarGenePathList2 = subQueryService.hasFunctionsIn(datalog,disDrugTarGenePathList1);
        //List<DisDrugTarGenePath> disDrugTarGenePathList3 = subQueryService.isEncodedByGene(datalog,disDrugTarGenePathList2);
        //List<DisDrugTarGenePath> disDrugTarGenePathList4 = subQueryService.takesPartIn(datalog,disDrugTarGenePathList3);
    }

//    GraalService graalService;
//
//    @Test
//    public void testQ1(){
//        JSONArray res = graalService.query("?(Microbe_name,Gene_symbol,Gene_kegg_pathway):-\n" +
////                "class:Swine(Swine_index),\n" +
////                "class:Microbiota(Microbe_id),\n" +
//                "relationship:is_host_ofQ1(Swine_index,Microbe_id,<100>),\n" +
//                "attribute:swine_id(Swine_index,<999001808060218>),\n" +
//                "attribute:p_value_dpf_tpf_difference(Microbe_id,<1>),\n" +
//                "attribute:microbe_name(Microbe_id,Microbe_name),\n" +
//                "attribute:microbe_time(Microbe_id,<100>),\n" +
////                "class:Microbiota(Microbe_id),\n" +
////                "class:Gene(Ncbi_gene_id),\n" +
//                "relationship:changes_the_expression_by_microbiotaQ1(Microbe_id,Ncbi_gene_id,<change_the_expression_by_microbiota>),\n" +
//                "attribute:gene_symbol(Ncbi_gene_id,Gene_symbol),\n" +
////                "class:Gene(Ncbi_gene_id),\n" +
////                "class:Gene_KEGG_Info(Gene_kegg_id),\n" +
//                "relationship:has_gene_kegg_infoQ1(Ncbi_gene_id,Gene_kegg_id,<has_gene_kegg_info>),\n" +
//                "attribute:gene_kegg_pathway(Gene_kegg_id,Gene_kegg_pathway).");
//    }
//
//    @Test
//    public void testQ2(){
//        JSONArray res = graalService.query("?(Microbe_name,Gene_symbol,Gene_kegg_pathway):-\n" +
////                "class:Swine(Swine_id),\n" +
////                "class:Microbiota(Microbe_id),\n" +
//                "relationship:is_host_ofQ2(Swine_id,Microbe_id,<80>),\n" +
//                "attribute:group(Microbe_id,<A1>),\n" +
//                "attribute:p_age_difference(Microbe_id,<1>),\n" +
//                "attribute:microbe_name(Microbe_id,Microbe_name),\n" +
//                "attribute:microbe_time(Microbe_id,<80>),\n" +
////                "class:Microbiota(Microbe_id),\n" +
////                "class:Gene(Ncbi_gene_id),\n" +
//                "relationship:changes_the_expression_by_microbiotaQ2(Microbe_id,Ncbi_gene_id,<change_the_expression_by_microbiota>),\n" +
//                "attribute:gene_symbol(Ncbi_gene_id,Gene_symbol),\n" +
////                "class:Gene(Ncbi_gene_id),\n" +
////                "class:Gene_KEGG_Info(Gene_kegg_id),\n" +
//                "relationship:has_gene_kegg_infoQ2(Ncbi_gene_id,Gene_kegg_id,<has_gene_kegg_info>),\n" +
//                "attribute:gene_kegg_pathway(Gene_kegg_id,Gene_kegg_pathway).");
//    }
//
//    @Test
//    public void testQ3(){
//        JSONArray res = graalService.query("?(Microbe_name,Gene_symbol,Gene_kegg_pathway):-\n" +
////                "class:Swine(Swine_id),\n" +
////                "class:Microbiota(Microbe_id),\n" +
//                "relationship:is_host_ofQ3(Swine_id,Microbe_id,<131>),\n" +
//                "attribute:group(Microbe_id,<A1>),\n" +
//                "attribute:p_age_difference(Microbe_id,<1>),\n" +
//                "attribute:microbe_name(Microbe_id,Microbe_name),\n" +
//                "attribute:microbe_time(Microbe_id,<131>),\n" +
////                "class:Microbiota(Microbe_id),\n" +
////                "class:Gene(Ncbi_gene_id),\n" +
//                "relationship:changes_the_expression_by_microbiotaQ3(Microbe_id,Ncbi_gene_id,<change_the_expression_by_microbiota>),\n" +
//                "attribute:gene_symbol(Ncbi_gene_id,Gene_symbol),\n" +
////                "class:Gene(Ncbi_gene_id),\n" +
////                "class:Gene_KEGG_Info(Gene_kegg_id),\n" +
//                "relationship:has_gene_kegg_infoQ3(Ncbi_gene_id,Gene_kegg_id,<has_gene_kegg_info>),\n" +
//                "attribute:gene_kegg_pathway(Gene_kegg_id,Gene_kegg_pathway).");
//    }
//
//    @Test
//    public void testQ4(){
//        JSONArray res = graalService.query("?(Metabolome_name,Metabolome_pathway,Metabolome_pathway_url):-\n" +
////                "class:Swine(Swine_index),\n" +
////                "class:Metabolome(Metabolome_index),\n" +
//                "relationship:generatesQ4(Swine_index,Metabolome_index,<generates>),\n" +
//                "attribute:metabolome_difference(Metabolome_index,<1>),\n" +
//                "attribute:metabolism_name(Metabolome_index,Metabolome_name),\n" +
//                "attribute:metabolism_time(Metabolome_index,<100>),\n" +
////                "class:Metabolome(Metabolome_index),\n" +
////                "class:Metabolome_HMDB_info(Hmdb_info_index),\n" +
//                "relationship:has_hmdb_infoQ4(Hmdb_info_index,Metabolome_index,<has_hmdb_info>),\n" +
//                "attribute:metabolome_pathway_url(Hmdb_info_index,Metabolome_pathway_url),\n" +
//                "attribute:metabolome_pathway(Hmdb_info_index,Metabolome_pathway).");
//    }
  //  @Test
//    public void test() throws IOException {
//        Document document = Jsoup.parse(new URL("https://www.kegg.jp/kegg-bin/search_pathway_text?keyword=Il12b"), 20000);
//        System.out.println(document);
//    }
//
}
