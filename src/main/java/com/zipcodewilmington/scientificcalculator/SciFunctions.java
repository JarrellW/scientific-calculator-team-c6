package com.zipcodewilmington.scientificcalculator;
import com.zipcodewilmington.scientificcalculator.Console;

public class SciFunctions {
    public static Double sin(Double i) {
        Double result = Math.sin(i);
        Console.println("sin(%s) = %s", i, (Math.sin(i)));
        return result;
    }

    public static Double cos(Double i) {
        Double result = Math.cos(i);
        Console.println("cos(%s) = %s", i, (Math.cos(i)));
        return result;
    }

    public static Double tan(Double i) {
        Double result = Math.tan(i);
        Console.println("tan(%s) = %s", i, (Math.tan(i)));
        return result;
    }

    public static Double sec(Double i) {
        Double result = (1 / Math.cos(i));
        Console.println("sec(%s) = %s", i, 1 / (Math.cos(i)));
        return result;
    }

    public static Double csc(Double i) {
        Double result = (1 / Math.sin(i));
        Console.println("csc(%s) = %s", i, 1 / (Math.sin(i)));
        return result;
    }

    public static Double cot(Double i) {
        Double result = (1 / Math.tan(i));
        Console.println("cot(%s) = %s", i, 1 / (Math.tan(i)));
        return result;
    }

    public static Double log(Double i) {
        Double result = Math.log10(i);
        Console.println("log(%s) = %s", Math.log10(i));
        return result;
    }

    public static Double naturalLog(Double i) {
        Double result = Math.log(i);
        Console.println("l(%s) = %s", Math.log(i));
        return result;
    }

    public static Double inverseLog(Double i) {
        Double result = (Math.exp(Math.log10(i)));
        Console.println("log(%s) = %s", (Math.exp(Math.log10(i))));
        return result;
    }

    public static Double inverseNaturalLog(Double i) {
        Double result = (Math.exp(Math.log(i)));
        Console.println("log(%s) = %s", (Math.exp(Math.log(i))));
        return result;
    }

    public static void binary() {
        Integer i = Console.getIntegerInput("Enter a number");
        Console.println("Initial double value is " + i);
        Console.println(Integer.toBinaryString(i));
    }

    public static void octal() {
        Integer i = Console.getIntegerInput("Enter a number");
        Console.println("Initial double value is " + i);
        Console.println(Integer.toOctalString(i));
    }

    public static void decimal() {
        Integer i = Console.getIntegerInput("Enter a number");
        Console.println("Initial double value is " + i);
        Console.println("%s", i);
    }

    public static void hexadecimal() {
        Integer i = Console.getIntegerInput("Enter a number");
        Console.println("Initial double value is " + i);
        Console.println(Integer.toHexString(i));
    }
//    public static Integer hexadecimal(Integer i) {
//        Integer i = (Integer.toHexString(i);
//        Console.println(Integer.toHexString(i));
//        return result;
//    }

    public static Double radians(Double i) {
        Double result = Math.toRadians(i);
        Console.println("%s", Math.toRadians(i));
        return result;
    }
    public static Double degrees(Double i) {
        Double result = Math.toDegrees(i);
        Console.println("%s",  Math.toDegrees(i));
        return result;
    }
}





