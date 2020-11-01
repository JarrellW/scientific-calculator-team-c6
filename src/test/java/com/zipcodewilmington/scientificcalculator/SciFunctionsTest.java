package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SciFunctionsTest {
    @Test
    public void sin() {
        Double num1 = 4.0;
        Double expectedResult = -0.7568024953079282;
        Double  actualResult = SciFunctions.sin(num1);
        assertEquals(expectedResult, actualResult);
    }
    public void cos() {
        Double num1 = 98.8;
        Double expectedResult = -0.1594846391;
        Double  actualResult = SciFunctions.cos(num1);
        assertEquals(expectedResult, actualResult);
    }
    public void tan() {
        Double num1 = 98.8;
        Double expectedResult = -0.1594846391;
        Double  actualResult = SciFunctions.tan(num1);
        assertEquals(expectedResult, actualResult);
    }

}