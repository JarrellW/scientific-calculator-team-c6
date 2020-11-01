package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.Console;

public class Calculator {

    public static Double add(Double i, Double j) {
        Double result = i + j;
        Console.println("%s + %s = %s", i, j, result);
        return result;
    }

    public static Double subtract(Double i, Double j) {
        Double result = i + j;
        Console.println("%s - %s = %s", i, j, result);
        return result;
    }

    public static void multiply() {
        Double i = Console.getDoubleInput("Enter first number");
        Double j = Console.getDoubleInput("Enter second number");
        Console.println("%s * %s = %s", i, j, i * j);
    }

    public static void divide() {
        Double i = Console.getDoubleInput("Enter first number");
        Double j = Console.getDoubleInput("Enter second number");
        if (j == 0 || i == 0) {
            Console.println("Err can't divide by zero");
            divide();
        } else {
            Console.println("%s / %s = %s", i, j, i / j);
        }


    }

    public static void square() {
        Double i = Console.getDoubleInput("Enter number");
        Console.println("%s ^ 2 = %s", i, Math.pow(i, 2));
    }

    public static void squareRoot() {
        Double i = Console.getDoubleInput("Enter number");
        Console.println("%s = %s", i, Math.sqrt(i));
    }

    public static void toThePowerOf() {
        Double i = Console.getDoubleInput("Enter base number");
        Double j = Console.getDoubleInput("Enter exponent number");
        Console.println("%s ^ %s = %s", i, j, Math.pow(i, j));
    }

    public static void inverse() {
        Double i = Console.getDoubleInput("Enter number");
        if (i == 0) {
            Console.println("Err can't divide by zero");
            inverse();
        } else {
            Console.println("Inverse of %s = %s", i, 1 / i);
        }
    }
}





