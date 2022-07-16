package com.edu.hzau.ic.fe.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SqlTranslation {

//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        String datalog="?(Microbiota_name,Alteration,Metabolite_name) :- relationship.change_the_abundance_of_by_disorder(<Crohn_disease>, Microbiota_name, <change_the_abundance_of_by_disorder>), relationship.has_abundance_change_results_by_disorder(Microbiota_name, Disorder_microbiota_index, <Crohn_disease>), gutmdisorder.disorder_gut_microbiota_change_results(Microbiota_index, VAR_1, Alteration, VAR_3, VAR_4), relationship.generates(Microbiota_name, Metabolite_name, <generates>).";
//
////        String datalog="?(GeneName,Pathway) :- relationship.has_kegg_characters(KeggIndex, GeneName, has_kegg_characters), \n" +
////                "gutmgene.gut_microbiota_gene_interaction_results(Index,VAR_1,<decrease>,VAR_3,VAR_4,VAR_5,VAR_6,VAR_7), \n" +
////                "gutmgene.gut_microbiota_gene_interaction_results(Index,<human>,VAR_2,VAR_3,VAR_4, VAR_5, VAR_6,VAR_7), \n" +
////                "relationship.has_directly_change_results(Index,GeneName,<SalmonellaEnterica>), \n" +
////                "kegg.gene_kegg_characters(KeggIndex, Pathway, VAR_2, VAR_3).";
//
//        System.out.println(translate(datalog));
//    }
        public static String translate(String d) throws SQLException, ClassNotFoundException {
            String s=d;//这是之前的系统那个沙门氏菌问题的语句生产的查询重写后的语句

            String select="select distinct";
            HashMap map =new HashMap();//用来存储where条件中相等的两个量
            Map<String,ArrayList> map1=new HashMap();//存储where中带<>的已知量，如<SalmonellaEnterica>，<human>
            ArrayList<String> Table=new ArrayList<>();//存储数据库表名
            String ss[]=s.split(" :-");

            String query=ss[0].substring(2,ss[0].length()-1);
            String querys[]=query.split(",");

            String datalog=ss[1];//去除？那段后剩下的部分
            String datalogs[]=datalog.split("\\),");//把每一行分割出来

            for(String str:datalogs){
                String TableName=str.split("\\(")[0];
                Table.add(TableName);
                String ColumnName=str.split("\\(")[1];
                String ColumnNames[]=ColumnName.split(", ");
                LinkedHashMap linkedHashMap=findsql(TableName);  //存储列名
                for(int i=0;i<ColumnNames.length;i++){
                    if(!ColumnNames[i].contains("VAR")&&!ColumnNames[i].contains("<")){
                        if(map.get(ColumnNames[i])!=null){
                            ArrayList arrayList =(ArrayList) map.get(ColumnNames[i]);
                            arrayList.add(TableName + "." + linkedHashMap.get(i+1));
                        }
                        if(map.get(ColumnNames[i])==null){
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(TableName + "." + linkedHashMap.get(i + 1));
                            map.put(ColumnNames[i],arrayList);

                        }
                    }
                    if(ColumnNames[i].contains("<")){
                        if(map1.get(ColumnNames[i])==null){
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(TableName + "." + linkedHashMap.get(i+1));
                            if(ColumnNames[i].contains(".")){
                                map1.put(ColumnNames[i].substring(1,ColumnNames[i].length()-4),arrayList);
                            }else{
                            map1.put(ColumnNames[i].substring(1,ColumnNames[i].length()-1),arrayList);
                            }
                        }
                        if(map.get(ColumnNames[i].substring(1,ColumnNames[i].length()-1))!=null){
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(TableName + "." + linkedHashMap.get(i+1));
                        }
                    }
                }
                //findsql(TableName);
            }
//      -----------开始select的拼接-------
            for(int m=0;m<querys.length-1;m++){
                ArrayList que=(ArrayList) map.get(querys[m]);
                select+=que.get(0) + " as " + querys[m] + ",";
            }
            ArrayList que=(ArrayList) map.get(querys[querys.length-1]);
            select+=que.get(0) + " as " + querys[querys.length-1] + " from ";
//      ------------完成select的拼接-------


//      -----------开始from的拼接-------
            ArrayList newTable=remove(Table);
            for(int i=0;i<newTable.size()-1;i++){
                select+=newTable.get(i)+",";
            }
            select+=Table.get(newTable.size()-1) + " where ";
//      -----------完成from的拼接-------


//      -----------开始where的拼接-------
            for (Map.Entry<String, ArrayList> entry : map1.entrySet()){
                ArrayList arrayList=entry.getValue();
                String value=(String) arrayList.get(0);
                select+=value + " = " + "'" +entry.getKey() + "'" + " and ";
            }

            for (Object value : map.values()) {
                ArrayList arrayList=(ArrayList) value;
                for(int i=0;i<arrayList.size()-1;i++){
                    select+=(String) arrayList.get(i) + " = " + (String) arrayList.get(i+1) + " and ";
                }
            }
//      -----------完成where的拼接-------

            return select.substring(0,select.length()-5);
//        System.out.println(map);
//        System.out.println("---------------");


        }

        public static LinkedHashMap findsql(String TableName) throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.jdbc.Driver");
            //2、用户信息和url
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useUnicode=true&characterEncoding=utf8", "root", "111111");

            //4、执行sql的对象
            Statement statement = conn.createStatement();
            //5、执行sql的对象去执行sql，可能存在结果，查看返回结果
            String sql = "select * from " + TableName;
            ResultSet resultSet = statement.executeQuery(sql);
            ResultSetMetaData data = resultSet.getMetaData();
            LinkedHashMap map = new LinkedHashMap();
            for (int i = 1; i <= data.getColumnCount(); i++) {
                map.put(i,data.getColumnName(i));
            }

            //6、释放连接
            resultSet.close();
            statement.close();
            conn.close();
            return map;
        }

        public static ArrayList remove(ArrayList arrayList){
            for(int i=0;i<arrayList.size();i++)
            {
                for (int j=i+1;j<arrayList.size();j++){
                    if(arrayList.get(i).equals(arrayList.get(j))){
                        arrayList.remove(j);
                    }
                }
            }
            return arrayList;
        }
}
