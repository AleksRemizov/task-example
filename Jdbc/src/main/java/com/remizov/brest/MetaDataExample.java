package com.remizov.brest;

import com.remizov.brest.entity.Subscriber;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class MetaDataExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/epamcourse";
        Properties properties = new Properties();
        properties.put("user","bond");
        properties.put("password","agent007");
        properties.put("autoReconnect","true");
        properties.put("characterEncoding","UTF-8");
        properties.put("useUnicode","true");
        properties.put("useSSL","true");
        try(Connection connection = DriverManager.getConnection(url,properties);
            Statement statement = connection.createStatement()) {
            String sql = "SELECT IDphonebook, lastname, phone FROM phonebook";
            ResultSet resultSet = statement.executeQuery(sql);
            List<Subscriber> subscribers = new ArrayList<>();
            while (resultSet.next()){
                int subscriberId = resultSet.getInt(1);
                String subscribeLastName = resultSet.getString("lastname");
                int subscriberPhone = resultSet.getInt("phone");
                subscribers.add(new Subscriber(subscriberId,subscribeLastName,subscriberPhone));
            }
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            System.out.println(resultSetMetaData.getColumnCount());
            System.out.println(resultSetMetaData.getColumnName(1));
            System.out.println(resultSetMetaData.getColumnTypeName(2));
            System.out.println(resultSetMetaData.getTableName(1));

            DatabaseMetaData databaseMetaData = connection.getMetaData();
            System.out.println(databaseMetaData.getDatabaseProductName());
            System.out.println(databaseMetaData.getDatabaseProductVersion());
            System.out.println(databaseMetaData.getUserName());
            System.out.println(databaseMetaData.getURL());
            System.out.println(databaseMetaData.getDriverName());
            System.out.println(databaseMetaData.getDriverVersion());

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
