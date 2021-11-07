package com.epam.brest;

public class TemperatureConverter {
    public static double asFahrenheit(double celsius){
        return (celsius * 9 / 5 ) + 32;
    }
    public static double asCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
}
