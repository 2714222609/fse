package com.edu.hzau.ic.fe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author yue
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class KeggEntity {
    private String ncbiGeneId;
    private String keggId;
    private String keggSymbol;
    private String keggName;
    private String keggOrthology;
    private String keggOrganism;
    private String keggPathway;
    private String keggNetWork;
    private String keggNetWorkElement;
    private String keggBrite;
    private String keggMotif;
}
