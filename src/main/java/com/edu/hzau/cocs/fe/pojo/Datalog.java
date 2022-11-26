package com.edu.hzau.cocs.fe.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

/**
 * @Author yue
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Datalog {
    private List<String> header;
    private Map<String, String> relationship;
    private Map<String, Map<String, String>> attribute;
}
