package com.remizov.brest.service;

import com.remizov.brest.daologic.EntityTransaction;
import com.remizov.brest.daologic.OrderDao;
import com.remizov.brest.daologic.SubscriberDao;

import java.sql.SQLException;

public class StudyDoaService {
    public void doService(params){
        //1.init Dao
        SubscriberDao subscriberDao = new SubscriberDao();
        OrderDao paymentDao = new OrderDao();
        //2.init transaction
        EntityTransaction entityTransaction = new EntityTransaction();
        entityTransaction.begin(subscriberDao,paymentDao);
        //3.execute request
        try{
            subscriberDao.create(params1);
            paymentDao.update(params2);
            paymentDao.delete(params3);
            entityTransaction.commit();
        }catch (SQLException e){
            entityTransaction.rollback();
            //log or throw exception
        }finally {
            //4.transaction close
            entityTransaction.end();
        }
    }
}
