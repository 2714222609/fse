package com.edu.hzau.ic.fe.mapper;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;

@Slf4j
public class SqlQuery {
    public static JSONArray excute(String sql) throws ClassNotFoundException, SQLException {
        //获取连接Connection对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useUnicode=true&characterEncoding=utf8", "root", "111111");
        //得到执行SQL语句的Statement对象
        Statement stmt = conn.createStatement();
        //执行SQL语句，这里是执行查询语句，得到一个虚拟表的结果对象
        ResultSet rs = stmt.executeQuery(sql);
        //对结果进行处理，这里是打印
        JSONArray jsonArray=extractJSONArray(rs);
        //关闭连接
        rs.close();
        stmt.close();
        conn.close();
        log.info("sql execute success, return --> " + jsonArray);
        return jsonArray;
    }

    public static JSONArray extractJSONArray(ResultSet rs) throws SQLException {
        ResultSetMetaData md = rs.getMetaData();
        int num = md.getColumnCount();
        JSONArray array = new JSONArray();
        while (rs.next()) {
            JSONObject mapOfColValues = new JSONObject();
            for (int i = 1; i <= num; i++) {
                mapOfColValues.put(md.getColumnLabel(i), rs.getObject(i));////getColumnName可能只能取到查询的数据库表的字段名称，而不是sql语句中用到的别名 getColumnLabel取到的是sql语句中指定的名称（字段名或别名）
            }
            array.add(mapOfColValues);
        }
        return array;
    }
}
