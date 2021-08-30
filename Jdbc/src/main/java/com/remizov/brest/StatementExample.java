package com.remizov.brest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class StatementExample {
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
        /*properties.put("cacheDefaultTimeZone","true");
        properties.put("continueBatchOnError","true");
        properties.put("dontTrackOpenResources","false");
        properties.put("queryTimeoutKillsConnection","false");*/

        try (Connection connection = DriverManager.getConnection(url,properties);
             Statement statement =  connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                                ResultSet.CONCUR_UPDATABLE)){
            String sql = "SELECT IDphonebook, lastname, phone FROM phonebook";
            ResultSet resultSet = statement.executeQuery(sql);
            List<Subscriber> subscribers = new ArrayList<>();
            //insert row
            resultSet.moveToInsertRow();
            resultSet.updateInt(1,22);
            resultSet.updateString(2,"Petrov");
            resultSet.updateInt(3,101);
            resultSet.insertRow();
            resultSet.moveToCurrentRow();

            while (resultSet.next()){
                // update row
                int id = resultSet.getInt(1);
                if(id == 1){
                    resultSet.updateInt("phone",777777);
                    resultSet.updateRow();
                }
                String name = resultSet.getString(2);
                int phone = resultSet.getInt("phone");
                subscribers.add(new Subscriber(id,name,phone));
            }
            System.out.println(subscribers);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
