package com.remizov.brest.daologic;

import com.remizov.brest.entity.Subscriber;

import java.util.List;

public class SubscriberDao extends AbstractDao<Subscriber>{
    @Override
    public List<Subscriber> findAll() {
        return null;
    }

    @Override
    public Subscriber findEntityById(long id) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
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
}
