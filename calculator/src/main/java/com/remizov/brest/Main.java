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

        BigDecimal [] enteredValue = new BigDecimal[2];
        Scanner scanner = new Scanner(System.in);
        String inputValue;
         int i = 0;
         do {
             if (i == 0) System.out.println("Please,enter distance:");
             else if (i == 1){
                 System.out.println("Please,enter weight:");
             }
             inputValue = scanner.next();
             if(inputValue.equalsIgnoreCase("Q")){
                 break;
             }else if (isCorrectDoubleValue(inputValue)){
                 enteredValue[i] = new BigDecimal(inputValue);
                 i++;
             }else {
                 System.out.println("Incorrect value " + inputValue);
             }

         }while (true);
    }
    private  static boolean isCorrectDoubleValue(String value){
        boolean checkResult;
        try{
            double enteredValue = Double.parseDouble(value);
            checkResult = enteredValue >= 0;
        }catch (NumberFormatException ex ){
            checkResult = false;
        }
        return checkResult;
    }
}
