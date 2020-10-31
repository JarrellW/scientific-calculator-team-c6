package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.printMenuOptions();
        Integer userInput = Console.getIntegerInput("Enter an integer");
        switch(userInput) {
        case 1:
            Calculator.add();
            break;
        case 2:
            Calculator.subtract();
            break;
            default:
                Console.println("Invalid entry!");
}

        // String s = Console.getStringInput("Enter a string");1
//       // Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);

//        Console.println("The user input %s as a d", d);
    }
}
