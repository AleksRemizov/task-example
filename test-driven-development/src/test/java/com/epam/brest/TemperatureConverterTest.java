package com.epam.brest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    @Test
    public void shouldConvertCelsiusToFahrenheitAboveZero(){
        Assertions.assertEquals(TemperatureConverter.asFahrenheit(37.0),98.6);
    }
    @Test
    public void shouldConvertCelsiusToFahrenheitBelowZero(){
        Assertions.assertEquals(TemperatureConverter.asFahrenheit(-12.2),10,0.1);
    }

    @Test
    public void shouldConvertFahrenheitToCelsiusAboveZero(){
        Assertions.assertEquals(TemperatureConverter.asCelsius(140.0),60);
    }

    @Test
    public void shouldConvertFahrenheitToCelsiusBelowZero(){
        Assertions.assertEquals(TemperatureConverter.asCelsius(-459.67),-273.15);
    }

}
