package com.edu.hzau.ic.fe.entity.datalog;


import com.edu.hzau.ic.fe.entity.datalog.DatalogAttribute;
import com.edu.hzau.ic.fe.entity.datalog.DatalogClazz;
import com.edu.hzau.ic.fe.entity.datalog.DatalogHeader;
import com.edu.hzau.ic.fe.entity.datalog.DatalogRelationship;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author yue
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Datalog {
    private DatalogHeader datalogHeader;
    private List<DatalogClazz> datalogClazz;
    private List<DatalogRelationship> datalogRelationship;
    private List<DatalogAttribute> datalogAttribute;

    /**
     * 将Datalog String拆解并组合，构造Datalog对象
     */
    public Datalog(String datalogString) {
        List<String> header = Arrays.asList(datalogString.substring(2, datalogString.indexOf(":-") - 1).split(","));
        String datalogBody = datalogString.substring(datalogString.indexOf(":-") + 2, datalogString.length() - 2);
        List<DatalogClazz> datalogClazzList = new ArrayList<>();
        List<DatalogRelationship> datalogRelationshipList = new ArrayList<>();
        List<DatalogAttribute> datalogAttributeList = new ArrayList<>();
        String[] datalogBodyArray = datalogBody.split("\\),");
        for (String line : datalogBodyArray) {
            String prefix = line.substring(line.indexOf(":") + 1, line.indexOf("("));
            if (line.startsWith("class")) {
                List<String> clazzFields = new ArrayList<>();
                clazzFields.add(line.substring(line.indexOf("(") + 1));
                datalogClazzList.add(new DatalogClazz(prefix, clazzFields));
            } else {
                String[] suffix = line.substring(line.indexOf("(") + 1).split(",");
                if (line.startsWith("relationship")) {
                    List<String> relationshipFields = Arrays.asList(suffix);
                    datalogRelationshipList.add(new DatalogRelationship(prefix, relationshipFields));
                } else {
                    List<String> attributeFields = Arrays.asList(suffix);
                    datalogAttributeList.add(new DatalogAttribute(prefix, attributeFields));
                }
            }
        }
        this.datalogHeader = new DatalogHeader(header);
        this.datalogClazz = datalogClazzList;
        this.datalogRelationship = datalogRelationshipList;
        this.datalogAttribute = datalogAttributeList;
    }

    /**
     * 重写String()
     */
    @Override
    public String toString() {
        return "Datalog{" +
                "\ndatalogHeader = " + datalogHeader +
                ", \ndatalogClazz = " + datalogClazz +
                ", \ndatalogRelationship = " + datalogRelationship +
                ", \ndatalogAttribute = " + datalogAttribute +
                "\n}";
    }

    /**
     * 将Datalog对象转换为String表示形式
     */
    public StringBuilder getDatalogString() {
        StringBuilder res = new StringBuilder();
        res.append(datalogHeader.getHeaderString());
        for (DatalogClazz clazz : datalogClazz) {
            res.append(clazz.getClazzString());
        }
        for (DatalogRelationship relationship : datalogRelationship) {
            res.append(relationship.getRelationshipString());
        }
        for (DatalogAttribute attribute : datalogAttribute) {
            res.append(attribute.getAttributeString());
        }
        res.replace(res.lastIndexOf(","), res.length(), ".");
        return res;
    }

}
