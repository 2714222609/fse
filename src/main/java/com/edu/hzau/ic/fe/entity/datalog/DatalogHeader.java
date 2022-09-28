package com.edu.hzau.ic.fe.entity.datalog;

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
public class DatalogHeader {
    private List<String> fields;
    public String getHeaderString() {
        StringBuilder sb = new StringBuilder("?(");
        for (int i = 0; i < fields.size(); i++) {
            sb.append(fields.get(i));
            if (i != fields.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("):-");
        return sb.toString();
    }
}
