package com.edu.hzau.ic.fe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.simple.JSONObject;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Source {
    private String sourceName;
    private String description;
    private String sourceType;
    private JSONObject accessInfo;
    private JSONObject metadata;
}
