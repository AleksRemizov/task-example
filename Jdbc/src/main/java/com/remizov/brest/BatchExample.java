package com.remizov.brest;

import java.sql.*;
import java.util.Arrays;
import java.util.Properties;


public class BatchExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url ="jdbc:mysql://localhost:3306/epamcourse";
        Properties properties = new Properties();
        properties.put("user","bond");
        properties.put("password","agent007");
        properties.put("autoReconnect","true");
        properties.put("characterEncoding","UTF-8");
        properties.put("useUnicode","true");
        properties.put("useSSL","true");
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url,properties);
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.addBatch("INSERT INTO products VALUES (4, 'Huawei', 500)");
            statement.addBatch("INSERT INTO products VALUES (5, 'LG', 1000)");
            statement.addBatch("INSERT INTO phonebook VALUES (6, 'Ivanov', 554433)");
            int[] updateCounts = statement.executeBatch();
            System.out.println(Arrays.toString(updateCounts));
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if(connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
