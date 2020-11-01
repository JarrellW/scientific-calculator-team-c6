package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.Console;

public class Calculator {

    public static Double add(Double i, Double j) {
        Double result = i + j;
        Console.println("%s + %s = %s", i, j, result);
        return result;
    }

    public static Double subtract(Double i, Double j) {
        Double result = i - j;
        Console.println("%s - %s = %s", i, j, result);
        return result;
    }

    public static Double multiply(Double i, Double j) {
        Double result = i * j;
        Console.println("%s * %s = %s", i, j, result);
        return result;
    }

    public static Double divide(Double i, Double j) {
        if (j == 0 || i == 0) {
            Console.println("Err can't divide by zero");
            return 0.0;
        } else {
            Double result = i / j;
            Console.println("%s / %s = %s", i, j, result);
            return result;
        }
    }

    public static Double square(Double i) {
        Double result = Math.pow(i, 2);
        Console.println("%s ^ 2 = %s", i, Math.pow(i, 2));
        return result;
    }

    public static Double squareRoot(Double i) {
        Double result = Math.sqrt(i);
        Console.println("%s = %s", i, Math.sqrt(i));
        return result;
    }

    public static Double toThePowerOf(Double i, Double j) {
        Double result = Math.pow(i, j);
        Console.println("%s ^ %s = %s", i, j, Math.pow(i, j));
        return result;
    }

    public static Double inverse(Double i) {
        if (i == 0) {
            Console.println("Err can't divide by zero");
            return 0.0;
        } else {
            Double result = 1 / i;
            Console.println("Inverse of %s = %s", i, 1 / i);
            return result;
        }

    }
}





