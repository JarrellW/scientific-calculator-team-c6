package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.Console;

public class Calculator {
    public static void add() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);
        Integer j = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", j);
        Console.println("%s + %s = %s", i,j, i + j);

    }

    public static void subtract() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);
        Integer j = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", j);
        Console.println("%s - %s = %s", i,j, i -j);
    }

    public static void multiply() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);
        Integer j = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", j);
        Console.println("%s * %s = %s", i,j);
    }

//    public static void divide() {
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Console.println("The user input %s as a integer", i);
//        Integer j = Console.getIntegerInput("Enter an integer");
//        Console.println("The user input %s as a integer", j);
//        Console.println("%s / %s = %s", i, j, i / j);
//
//    }
//    public static void square() {
//        double i = Console.getIntegerInput("Enter an integer");
//        Console.println("The user input %s as a integer", i);
//        Console.println("%s ^ 2 = %s", i,Math.pow(i,2));
//    }
//    public static void squareRt() {
//        double i = Console.getIntegerInput("Enter an integer");
//        Console.println("The user input %s as a integer", i);
//        Console.println("%s = %s", i,Math.sqrt(i));
//    }
//    public static void toThePowerOf() {
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Console.println("The user input %s as a integer", i);
//        Integer j = Console.getIntegerInput("Enter an integer");
//        Console.println("The user input %s as a integer", j);
//        Console.println("%s ^ %s = %s", i,j, Math.pow(i,j));
//    }
}





