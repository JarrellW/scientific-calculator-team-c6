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

    public static String binary(Integer i) {
        String result = Integer.toBinaryString(i);
        return result;
    }

    public static String octal(Integer i) {
        String result = Integer.toOctalString(i);
        return result;
    }

    public static String decimal(Integer i) {
        String result = i.toString();
        return result;
    }

    public static String hexadecimal(Integer i) {
        String result = Integer.toHexString(i);
        return result;
    }

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
    public static Double multiplyByPi(Double i) {
        Double result = 3.1415926;
        Console.println(" %s",  3.1415926);
        return result;
    }
//    public static Double factorial(Double i) {
//        if (i <= 1)
//            return 1.0;
//        else
//            return i * factorial(i - 1);
//        Double result = Double i;
//        return result;
//    }

    public static Double celToFar(Double i){
        Double result = ((i/5.0)*9.0)+32.0;
        Console.println(result.toString());
        return result;
    }

}





