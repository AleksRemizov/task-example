package com.remizov.brest.dao;

import com.remizov.brest.dao.impl.DaoException;
import com.remizov.brest.entity.Subscriber;

import java.util.List;

public interface SubscriberDao extends BaseDao<Long, Subscriber> {
    List<Subscriber> findSubscriberByLastName(String patternName) throws DaoException;
}
