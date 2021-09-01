package com.remizov.brest.pool;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {
    private static final String DATASOURCE_NAME ="jdbc/epamcouse";
    private static DataSource dataSource;

    static {
        try {
            Context initContext = new InitialContext();
            Context envContex = (Context) initContext.lookup("java:/comp/env");
            dataSource = (DataSource) envContex.lookup(DATASOURCE_NAME);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
    private ConnectionPool(){
    }
    public static Connection getConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        return connection;
    }
}
