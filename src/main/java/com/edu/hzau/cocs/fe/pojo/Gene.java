package com.edu.hzau.cocs.fe.pojo;

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
public class Gene {
    private String GeneSymbol;
    private String ncbiGeneId;
}
