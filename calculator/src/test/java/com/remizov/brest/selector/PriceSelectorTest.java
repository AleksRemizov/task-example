package com.remizov.brest.selector;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public class PriceSelectorTest {
    Map<Integer,BigDecimal> values = Map.of(
            1,new BigDecimal(100),
            2,new BigDecimal(200),
            3,new BigDecimal(300));
    PriceSelector priceSelector = new PriceSelector();

    @Test
    public void selectPriceMediumValue() {

     BigDecimal result = priceSelector.selectPriceValue(values,new BigInteger("2"));
        Assertions.assertEquals(result, new BigDecimal(200), "Result value is incorrect");
    }

    @Test
    public void selectPriceZeroValue() {

        BigDecimal result = priceSelector.selectPriceValue(values,new BigInteger("0"));
        Assert.assertTrue("Result value is incorrect", result.equals(new BigDecimal(100)));
    }

    @Test
    public void selectPriceMaxValue() {

        BigDecimal result = priceSelector.selectPriceValue(values,new BigInteger("4"));
        Assert.assertTrue("Result value is incorrect", result.equals(new BigDecimal(300)));
    }
    @Test
    public void selectPriceIncorrectValue() {

        BigDecimal result = priceSelector.selectPriceValue(values,new BigInteger("-1"));
        Assert.assertTrue("Result value is incorrect", result.equals(new BigDecimal(100)));
    }
}