package com.edu.hzau.cocs.fe.entity.datalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author yue
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attribute {
    private String attribute;
    private List<String> fields;
    public String getAttributeString() {
        StringBuilder sb = new StringBuilder(String.format("attribute:%s(", attribute));
        for (int i = 0; i < fields.size(); i++) {
            sb.append(fields.get(i));
            if (i != fields.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("),");
        return sb.toString();
    }

}
