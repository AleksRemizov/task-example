package com.remizov.brest;

import com.remizov.brest.files.CSVFileReader;
import com.remizov.brest.files.FileReader;
import com.remizov.brest.selector.PriceSelector;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader distancePriceFileReader = new CSVFileReader();
        Map<Integer, BigDecimal>distancePriceMap = distancePriceFileReader.readDate("price_distance.csv");

        FileReader weightPriceFileReader = new CSVFileReader();
        Map<Integer, BigDecimal>weightPriceMap = distancePriceFileReader.readDate("price_weight.csv");

        PriceSelector priceSelector = new PriceSelector();

        Double [] enteredValue = new Double[4];
        Scanner scanner = new Scanner(System.in);
        String inputValue;
    }
}
