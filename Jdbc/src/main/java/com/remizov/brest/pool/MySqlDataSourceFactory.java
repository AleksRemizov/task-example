package com.remizov.brest.pool;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MySqlDataSourceFactory {
    public static MysqlDataSource createMySqlDataSource(){
        MysqlDataSource dataSource = null;
        Properties properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream("prop\\database.properties");
            properties.load(inputStream);
            dataSource = new MysqlDataSource();
            dataSource.setURL(properties.getProperty("db.url"));
            dataSource.setUser(properties.getProperty("db.user"));
            dataSource.setPassword(properties.getProperty("db.pass"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
