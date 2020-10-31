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
}
