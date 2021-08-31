package com.remizov.brest.daologic;

import com.remizov.brest.entity.Entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class AbstractDao <T extends Entity> {
    protected Connection connection;

    public abstract List<T> findAll();
    public abstract T findEntityById(long id);
    public abstract boolean delete(long id);
    public abstract boolean delete(T t);
    public abstract boolean create(T t);
    public abstract T update(T t);

    public void close(Statement statement){
        try {
            if(statement != null){
                statement.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
     void setConnection(Connection connection){this.connection = connection;}
}
