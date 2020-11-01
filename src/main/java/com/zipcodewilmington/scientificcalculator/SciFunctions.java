package com.zipcodewilmington.scientificcalculator;
import com.zipcodewilmington.scientificcalculator.Console;

public class SciFunctions {
//    public static void sin() {
//        Double i = Math.sin(i), result;
//        Console.println("sin(%s) = %s", i, (Math.sin(i)));
//        return result;
//    }

    public static void cos() {
        Double i = Console.getDoubleInput("Enter a number");
        Console.println("cos(%s) = %s", i, (Math.cos(i)));
    }

    public static void tan() {
        Double i = Console.getDoubleInput("Enter a number");
        Console.println("tan(%s) = %s", i, (Math.tan(i)));
    }

    public static void sec() {
        Double i = Console.getDoubleInput("Enter a number");
        Console.println("sec(%s) = %s", i, 1 / (Math.cos(i)));
    }

    public static void csc() {
        Double i = Console.getDoubleInput("Enter a number");
        Console.println("csc(%s) = %s", i, 1 / (Math.sin(i)));
    }

    public static void cot() {
        Double i = Console.getDoubleInput("Enter a number");
        Console.println("cot(%s) = %s", i, 1 / (Math.tan(i)));
    }

    public static void log() {
        Double i = Console.getDoubleInput("Enter a number");
        Console.println("log(%s) = %s", i, Math.log10(i));

    }

    public static void naturalLog() {
        Double i = Console.getDoubleInput("Enter a number");
        Console.println("ln(%s) = %s", i, Math.log(i));

    }

    public static void inverseLog() {
        Double i = Console.getDoubleInput("Enter a number");
        Console.println("inverse log(%s) = %s", i, (Math.exp(Math.log10(i))));

    }

    public static void inverseNaturalLog() {
        Double i = Console.getDoubleInput("Enter a number");
        Console.println("inverse ln(%s) = %s", i, (Math.exp(Math.log(i))));
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

    public static void radians() {
        Integer i = Console.getIntegerInput("Enter a number");
        Console.println("Initial double value is " + i);
        Console.println("%s", i, Math.toRadians(i));
    }
    public static void degrees() {
        Integer i = Console.getIntegerInput("Enter a number");
        Console.println("Initial double value is " + i);
        Console.println("%s", i, Math.toDegrees(i));
    }
}





