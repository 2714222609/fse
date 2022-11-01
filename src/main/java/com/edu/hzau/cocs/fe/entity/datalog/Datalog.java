package com.edu.hzau.cocs.fe.entity.datalog;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Header header;
    private List<Clazz> clazzes;
    private List<Relationship> relationship;
    private List<Attribute> attribute;

    /**
     * 将Datalog String拆解并组合，构造Datalog对象
     */
    public Datalog(String datalogString) {
        List<String> header = Arrays.asList(datalogString.substring(2, datalogString.indexOf(":-") - 1).split(","));
        String datalogBody = datalogString.substring(datalogString.indexOf(":-") + 2, datalogString.length() - 2);
        List<Clazz> clazzList = new ArrayList<>();
        List<Relationship> relationshipList = new ArrayList<>();
        List<Attribute> attributeList = new ArrayList<>();
        String[] datalogBodyArray = datalogBody.split("\\),");
        for (String line : datalogBodyArray) {
            String prefix = line.substring(line.indexOf(":") + 1, line.indexOf("("));
            if (line.startsWith("class")) {
                List<String> clazzFields = new ArrayList<>();
                clazzFields.add(line.substring(line.indexOf("(") + 1));
                clazzList.add(new Clazz(prefix, clazzFields));
            } else {
                String[] suffix = line.substring(line.indexOf("(") + 1).split(",");
                if (line.startsWith("relationship")) {
                    List<String> relationshipFields = Arrays.asList(suffix);
                    relationshipList.add(new Relationship(prefix, relationshipFields));
                } else {
                    List<String> attributeFields = Arrays.asList(suffix);
                    attributeList.add(new Attribute(prefix, attributeFields));
                }
            }
        }
        this.header = new Header(header);
        this.clazzes = clazzList;
        this.relationship = relationshipList;
        this.attribute = attributeList;
    }

    /**
     * 重写String()
     */
    @Override
    public String toString() {
        return "Datalog{" +
                "\ndatalogHeader = " + header +
                ", \ndatalogClazz = " + clazzes +
                ", \ndatalogRelationship = " + relationship +
                ", \ndatalogAttribute = " + attribute +
                "\n}";
    }

    /**
     * 将Datalog对象转换为String表示形式
     */
    public StringBuilder getDatalogString() {
        StringBuilder res = new StringBuilder();
        res.append(header.getHeaderString());
        for (Clazz clazz : clazzes) {
            res.append(clazz.getClazzString());
        }
        for (Relationship relationship : relationship) {
            res.append(relationship.getRelationshipString());
        }
        for (Attribute attribute : attribute) {
            res.append(attribute.getAttributeString());
        }
        res.replace(res.lastIndexOf(","), res.length(), ".");
        return res;
    }

}
