package com.remizov.brest.dao;

import com.remizov.brest.entity.Entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public interface BaseDao <K ,T extends Entity> {
    List<T> findAll();
    T findEntityById( K id);
    boolean delete(T t);
    boolean create(T t);
    T update(T t);
    default void close(Statement statement){
        try {
        if(statement != null){
            statement.close();
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    default void close(Connection connection){
        try {
            if(connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
