package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;

    }

   // public static Double getDoubleInput(String prompt) {
       // return null;
    //}
    public static void printMenuOptions() {
        Console.println("1:Add  2:Subtract  3:Multiply 4:Divide 5:Square 6:Square Root" +
                " 7:Exponent 8:Inverse 9:Switch Sign \n10:Factorial 11:Bonus Feature 12:Bonus Feature2 " +
                "13:Trig Functions Menu 14:Switch Trig Units Menu \n15:Logarithmic Functions Menu  " +
                "16:Switch Number Display Menu  17:Memory Settings Menu");
    }
    public static void printTrigFunctionsMenuOptions() {
        Console.println("Tri Functions Menu: \n 1:Sine 2:Cosine 3:Tangent " +
                "4:Inverse Sine \n5:Inverse Cosine 6:Inverse Tangent");
    }
    public static void switchTrigUnitsMenu() {
        Console.println("");
    }
}
