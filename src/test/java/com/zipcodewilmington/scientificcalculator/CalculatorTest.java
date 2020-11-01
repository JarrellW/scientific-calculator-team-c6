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
    @Test
    public void subtract() {
        Double num1 = 4.0;
        Double num2 = 6.0;
        Double expectedResult = -2.0;
        Double  actualResult = Calculator.subtract(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void multiply() {
        Double num1 = 123.0;
        Double num2 = 2.0;
        Double expectedResult = 246.0;
        Double  actualResult = Calculator.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}