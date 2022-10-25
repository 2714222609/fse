package com.edu.hzau.ic.fe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yue
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HmdbEntity {
    private String hmdbId;
    private String pathway;
    private String img;
}
