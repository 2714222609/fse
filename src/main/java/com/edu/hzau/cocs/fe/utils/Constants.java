package com.edu.hzau.cocs.fe.utils;

/**
 * @Author yue
 */
public interface Constants {
    // dlp 文件路径
    String DATALOG_RULE_PATH = "./datalogrules/";
    String DATALOG_RULE_PATH_BIO = DATALOG_RULE_PATH + "gut_microbiota_ontology_v1.2_q4.dlp";
    String DATALOG_REULE_PATH_SWINE = DATALOG_RULE_PATH + "swine_microbiota_ontology.dlp";

    // 数据源
    String[] SWINE_SOURCE =  {"fsmm", "gene_info", "relationship_entity"};
    String[] BIO_SOURCE = {"gutmgene","kegg","relationship","gutmdisorder"};

    String MYSQL_SOURCE_TYPE = "MySQL";
}
