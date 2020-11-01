package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    public void add() {
        Double num1 = 4.0;
        Double num2 = 6.0;
        Double expectedResult = 10.0;
        Double  actualResult = Calculator.add(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}