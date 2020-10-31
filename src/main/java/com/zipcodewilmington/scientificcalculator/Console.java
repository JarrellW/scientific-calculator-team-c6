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

    public static Double getDoubleInput(String prompt) {
        return null;
    }
    public static void printMenuOptions() {
        Console.println("1:Add  2:Subtract  3:Multiply 4:Divide 5:Square 6:Square Root" +
                " 7:Inverse 8:Switch Sign \n9:Factorial 10:Bonus Feature 11:Bonus Feature2 " +
                "12:Trig Functions Menu \n13:Logarithmic Functions Menu  " +
                "14:Switch Number Display Menu  15:Memory Settings Menu");

        /*Console.println("4: Divide");
        Console.println("5: Square");
        Console.println("6: Square root");
        Console.println("7: Inverse");
        Console.println("8: Switch Sign");
        Console.println("9: Factorial");
        Console.println("10: future bonus feature!");
        Console.println("11: other bonus feature!");*/

    }
}
