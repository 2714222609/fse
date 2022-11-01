package com.edu.hzau.ic.fe.entity.datasource;

import com.alibaba.fastjson2.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
