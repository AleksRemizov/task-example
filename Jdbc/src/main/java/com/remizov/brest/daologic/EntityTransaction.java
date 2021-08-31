package com.remizov.brest.daologic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EntityTransaction {
    private Connection connection;
    public void begin(AbstractDao dao,AbstractDao ... daos){
        if(connection == null){
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/epamcourse",
                        "bond","agent007");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dao.setConnection(connection);
        for (AbstractDao daoElement : daos){
            daoElement.setConnection(connection);
        }
    }
    public void end (){
        if(connection != null){
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            connection = null;
        }
    }
    public void commit(){
        try {
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void rollback(){
        try {
            connection.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
