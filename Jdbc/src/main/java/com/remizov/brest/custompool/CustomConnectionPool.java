package com.remizov.brest.custompool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public enum CustomConnectionPool {
    INSTANCE;
    private BlockingQueue<ProxyConnection> freeConnection ;
    private Queue<ProxyConnection> givenAwayConnection;
    private static final int DEFAULT_POOL_SIZE = 32;
    //other pool params
    CustomConnectionPool(){
        //register driver
        //init pool params
        freeConnection= new LinkedBlockingDeque<>(DEFAULT_POOL_SIZE);
        givenAwayConnection = new ArrayDeque<>();
        //init connection
    }
    public Connection getConnection(){
        Connection connection = null;
        try {
            connection = freeConnection.take();
            givenAwayConnection.offer((ProxyConnection) connection);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public void releaseConnection(Connection connection){
        if(connection.getClass().equals(ProxyConnection.class)){
        givenAwayConnection.remove(connection);
        freeConnection.offer((ProxyConnection) connection);
        }
        else throw (new ClassCastException("Outside connection")); {

        }
    }
    public void destroyPool(){
        for (int i = 0; i < DEFAULT_POOL_SIZE; i++) {
            try {
                freeConnection.take().reallyClose();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        registerDriver();
    }
    private void registerDriver(){
        DriverManager.getDrivers().asIterator().forEachRemaining(driver -> {
            try {
                DriverManager.deregisterDriver(driver);
            } catch (SQLException e) {
                //log
            }
        });

    }

}
