package com.edu.hzau.cocs.fe.service;

/**
 * @Author yue
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
?(Microbiota_taxonomy_name,Gene_symbol,Microbiota_kegg_info_index) :-
        fsmm.swine(Swine_id, VAR_1, VAR_2, VAR_3, VAR_4, VAR_5, VAR_6),
        fsmm.swine(Swine_id, VAR_1, VAR_2, VAR_3, <100>, VAR_5, VAR_6),
        fsmm.microbe(VAR_0, VAR_1, Microbiota_taxonomy_name, VAR_3, VAR_4, VAR_5, VAR_6, VAR_7),
        fsmm.microbe(VAR_0, VAR_1, Microbiota_taxonomy_name, VAR_3, VAR_4, VAR_5, <1>, VAR_7),
        gene_info.gene(VAR_0, Gene_symbol, VAR_2),
        gene_info.gene(Gene_symbol, Gene_symbol, VAR_2),
        gene_info.gene_kegg_info(Microbiota_kegg_info_index, VAR_1, VAR_2),
        gene_info.gene_kegg_info(Microbiota_kegg_info_index, Gene_kegg_pathway, VAR_2).
        relationship_entity.is_host_of(Swine_id, Microbiota_taxonomy_name, <100>),
        relationship_entity.change_the_expression_by_microbiota(Gene_symbol, Microbiota_taxonomy_name, <changes_the_expression_by_microbiota>),
        relationship_entity.has_gene_kegg_info(Gene_symbol, Microbiota_kegg_info_index, <has_gene_kegg_info>),
 **/
@Slf4j
@Service
public class DatalogTranslator {
    public String datalog2sql(String datalog) {
        if (datalog == null) {
            log.error("datalog is null");
            return null;
        }
        // todo
        return null;
    }

}
