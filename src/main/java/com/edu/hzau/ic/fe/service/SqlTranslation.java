package com.edu.hzau.ic.fe.service;

import java.sql.*;
import java.util.*;

public class SqlTranslation {
        public static String translate(String d) throws SQLException, ClassNotFoundException {

            StringBuilder select= new StringBuilder("select distinct");
            HashMap<String, List<String>> map =new HashMap<>();//用来存储where条件中相等的两个量
            Map<String,List<String>> map1=new HashMap<>();//存储where中带<>的已知量，如<SalmonellaEnterica>，<human>
            ArrayList<String> Table=new ArrayList<>();//存储数据库表名
            String[] ss = d.split(" :-");

            String query=ss[0].substring(2,ss[0].length()-1);
            String[] querys =query.split(",");

            String datalog=ss[1];//去除？那段后剩下的部分
            String[] datalogs =datalog.split("\\),");//把每一行分割出来

            for(String str:datalogs){
                String TableName=str.split("\\(")[0];
                Table.add(TableName);
                String ColumnName=str.split("\\(")[1];
                String[] ColumnNames =ColumnName.split(", ");
                LinkedHashMap<Integer, String> linkedHashMap = findsql(TableName);  //存储列名
                for(int i=0;i<ColumnNames.length;i++){
                    if(!ColumnNames[i].contains("VAR") && !ColumnNames[i].contains("<")){
                        if(map.get(ColumnNames[i]) != null){
                            List<String> arrayList = map.get(ColumnNames[i]);
                            arrayList.add(TableName + "." + linkedHashMap.get(i+1));
                        }
                        if(map.get(ColumnNames[i]) == null){
                            ArrayList<String> arrayList = new ArrayList<>();
                            arrayList.add(TableName + "." + linkedHashMap.get(i + 1));
                            map.put(ColumnNames[i],arrayList);
                        }
                    }
                    if(ColumnNames[i].contains("<")){
                        if(map1.get(ColumnNames[i])==null){
                            ArrayList<String> arrayList = new ArrayList<>();
                            arrayList.add(TableName + "." + linkedHashMap.get(i+1));
                            if(ColumnNames[i].contains(".")){
                                map1.put(ColumnNames[i].substring(1,ColumnNames[i].length()-4),arrayList);
                            }else{
                            map1.put(ColumnNames[i].substring(1,ColumnNames[i].length()-1),arrayList);
                            }
                        }
                        if(map.get(ColumnNames[i].substring(1,ColumnNames[i].length()-1))!=null){
                            ArrayList<String> arrayList = new ArrayList<>();
                            arrayList.add(TableName + "." + linkedHashMap.get(i+1));
                        }
                    }
                }
                //findsql(TableName);
            }
//      -----------开始select的拼接-------
            for(int m=0;m<querys.length-1;m++){
                List<String> que = map.get(querys[m]);
                select.append(que.get(0)).append(" as ").append(querys[m]).append(",");
            }
            List<String> que = map.get(querys[querys.length-1]);
            select.append(que.get(0)).append(" as ").append(querys[querys.length - 1]).append(" from ");
//      ------------完成select的拼接-------


//      -----------开始from的拼接-------
            List<String> newTable = remove(Table);
            for(int i=0;i<newTable.size()-1;i++){
                select.append(newTable.get(i)).append(",");
            }
            select.append(Table.get(newTable.size() - 1)).append(" where ");
//      -----------完成from的拼接-------


//      -----------开始where的拼接-------
            for (Map.Entry<String, List<String>> entry : map1.entrySet()){
                List<String> arrayList = entry.getValue();
                String value = arrayList.get(0);
                select.append(value).append(" = ").append("'").append(entry.getKey()).append("'").append(" and ");
            }

            for (List<String> value : map.values()) {
                for(int i = 0; i < value.size()-1; i++){
                    select.append(value.get(i)).append(" = ").append(value.get(i + 1)).append(" and ");
                }
            }
//      -----------完成where的拼接-------

            return select.substring(0,select.length()-5);
        }

        public static LinkedHashMap<Integer, String> findsql(String TableName) throws SQLException, ClassNotFoundException {
            //2、用户信息和url
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useUnicode=true&characterEncoding=utf8", "root", "111111");

            //4、执行sql的对象
            Statement statement = conn.createStatement();
            //5、执行sql的对象去执行sql，可能存在结果，查看返回结果
            String sql = "select * from " + TableName;
            ResultSet resultSet = statement.executeQuery(sql);
            ResultSetMetaData data = resultSet.getMetaData();
            LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
            for (int i = 1; i <= data.getColumnCount(); i++) {
                map.put(i,data.getColumnName(i));
            }

            //6、释放连接
            resultSet.close();
            statement.close();
            conn.close();
            return map;
        }

        public static ArrayList<String> remove(ArrayList<String> arrayList){
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
