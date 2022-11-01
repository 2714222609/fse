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
public class Clazz {
    private String clazz;
    private List<String> fields;
    public String getClazzString() {
        StringBuilder sb = new StringBuilder(String.format("class:%s(", clazz));
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
