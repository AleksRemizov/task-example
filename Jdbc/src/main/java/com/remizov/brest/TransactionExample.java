package com.remizov.brest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.concurrent.Callable;

public class TransactionExample {
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
        Statement statement = null;
        try{
            connection = DriverManager.getConnection(url,properties);
            connection.setAutoCommit(false);
             statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO products VALUES (6,'Samsung A1', 300)" );
            statement.executeUpdate("INSERT INTO phonebook VALUES (12,'Sidorov', 667788)");
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            try{
                if(connection != null){
                    connection.setAutoCommit(true);
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
