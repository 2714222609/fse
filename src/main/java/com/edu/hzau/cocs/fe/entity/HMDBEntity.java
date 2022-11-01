package com.edu.hzau.cocs.fe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yue
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HMDBEntity {
    private String hmdbId;
    private String pathway;
    private String img;
}
