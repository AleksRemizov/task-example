package com.remizov.brest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.Callable;

public class Statement {
    public static void main(String[] args)  {
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

        try (
            Connection connection = DriverManager.getConnection(url,properties);
            Statement statement = connection.createStatement() ){

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
