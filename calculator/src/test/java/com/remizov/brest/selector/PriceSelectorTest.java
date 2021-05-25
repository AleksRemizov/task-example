package com.remizov.brest.selector;

import org.junit.Assert;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class PriceSelectorTest {

    @org.junit.Test
    public void selectPriceValue() {
        Map<Integer, BigDecimal> values = new HashMap<>();
        values.put(1, new BigDecimal(100));
        values.put(2, new BigDecimal(200));
        values.put(3, new BigDecimal(300));


     PriceSelector priceSelector = new PriceSelector();
     BigDecimal result = priceSelector.selectPriceValue(values,new BigInteger("2"));

        Assert.assertTrue("Result value is incorrect", result.equals(new BigDecimal(200)));
    }
}