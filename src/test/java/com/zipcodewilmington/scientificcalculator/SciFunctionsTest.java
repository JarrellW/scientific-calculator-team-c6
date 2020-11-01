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
    public void sec() {
        Double num1 = 98.8;
        Double expectedResult =-6.270196337668454;
        Double  actualResult = SciFunctions.sec(num1);
        assertEquals(expectedResult, actualResult);
    }
    public void csc() {
        Double num1 = 98.8;
        Double expectedResult = -1.0129655434416642;
        Double  actualResult = SciFunctions.csc(num1);
        assertEquals(expectedResult, actualResult);
    }
    public void cot() {
        Double num1 = 98.8;
        Double expectedResult = 0.16155244411665923;
        Double  actualResult = SciFunctions.cot(num1);
        assertEquals(expectedResult, actualResult);
    }
    public void log() {
        Double num1 = 98.8;
        Double expectedResult = 1.994756944587628 ;
        Double  actualResult = SciFunctions.log(num1);
        assertEquals(expectedResult, actualResult);
    }
    public void inverseLog() {
        Double num1 = 98.8;
        Double expectedResult = 4.593097604753822 ;
        Double  actualResult = SciFunctions.inverseLog(num1);
        assertEquals(expectedResult, actualResult);
    }
    public void naturalLog() {
        Double num1 = 98.8;
        Double expectedResult = 7.350416252303545 ;
        Double  actualResult = SciFunctions.naturalLog(num1);
        assertEquals(expectedResult, actualResult);
    }
    public void inverseNaturalLog() {
        Double num1 = 98.8;
        Double expectedResult = 98.80000000000003 ;
        Double  actualResult = SciFunctions.inverseNaturalLog(num1);
        assertEquals(expectedResult, actualResult);
    }




}