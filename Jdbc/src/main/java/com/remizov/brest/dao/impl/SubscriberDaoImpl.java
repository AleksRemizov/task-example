package com.remizov.brest.dao.impl;

import com.remizov.brest.dao.SubscriberDao;
import com.remizov.brest.entity.Subscriber;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SubscriberDaoImpl implements SubscriberDao {
    private static final String  SQL_SELECT_ALL_SUBSCRIBERS =
            "SELECT IDphonebook, lastname, phone FROM phonebook";
    private static final String  SQL_SELECT_SUBSCRIBER_BY_LASTNAME =
            "SELECT IDphonebook, phone FROM phonebook WHERE lastname =?";

    @Override
    public List<Subscriber> findAll() {
        List<Subscriber>subscribers =new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/epamcourse");
            statement = connection.createStatement();
            ResultSet resultSet =statement.executeQuery(SQL_SELECT_ALL_SUBSCRIBERS);
            while (resultSet.next()){
                Subscriber subscriber = new Subscriber();
                subscriber.setSubscriberId(resultSet.getInt("IDphonebook"));
                subscriber.setSubscriberPhone(resultSet.getInt("phone"));
                subscriber.setSubscriberLastname(resultSet.getString("lastname"));
                subscribers.add(subscriber);
            }
        } catch (SQLException e) {
            System.err.println("SQLException (request or table failed)" + e);;
        }finally {
            close(statement);
            close(connection);
        }
        return subscribers;
    }

    @Override
    public Subscriber findEntityById(Long id) {
        return null;
    }

    @Override
    public boolean delete(Subscriber subscriber) {
        return false;
    }

    @Override
    public boolean create(Subscriber subscriber) {
        return false;
    }

    @Override
    public Subscriber update(Subscriber subscriber) {
        return null;
    }

    @Override
    public List<Subscriber> findSubscriberByLastName(String patternName) throws DaoException {
        List<Subscriber>subscribers =new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/epamcourse");
            statement = connection.prepareStatement(SQL_SELECT_SUBSCRIBER_BY_LASTNAME);
            statement.setString(1,patternName);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Subscriber subscriber = new Subscriber();
                subscriber.setSubscriberId(resultSet.getInt("IDphonebook"));
                subscriber.setSubscriberPhone(resultSet.getInt("phone"));
                subscriber.setSubscriberLastname(resultSet.getString("lastname"));
                subscribers.add(subscriber);
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        }finally {
            close(statement);
            close(connection);
        }
        return subscribers;
    }
}
