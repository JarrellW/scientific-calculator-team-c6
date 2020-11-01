package com.zipcodewilmington.scientificcalculator;
import com.zipcodewilmington.scientificcalculator.Console;

public class SciFunctions {
    public static void sin() {
        double i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);
        Console.println("sin(%s) = %s", i, (Math.sin(i)));

    }

    public static void cos() {
        double i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);
        Console.println("cos(%s) = %s", i, (Math.cos(i)));
    }

    public static void tan() {
        double i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);
        Console.println("tan(%s) = %s", i, (Math.tan(i)));
    }

    public static void sec() {
        double i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);
        Console.println("sec(%s) = %s", i, 1 / (Math.cos(i)));
    }

    public static void csc() {
        double i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);
        Console.println("csc(%s) = %s", i, 1 / (Math.sin(i)));
    }

    public static void cot() {
        double i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);
        Console.println("cot(%s) = %s", i, 1 / (Math.tan(i)));
    }

    public static void log() {
        double i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);
        Console.println("log(%s) = %s", i, Math.log10(i));

    }

    public static void naturalLog() {
        double i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);
        Console.println("ln(%s) = %s", i, Math.log(i));

    }

    public static void inverseLog() {
        double i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);
        Console.println("inverse log(%s) = %s", i, (Math.exp(Math.log10(i))));

    }

    public static void inverseNaturalLog() {
        double i = Console.getIntegerInput("Enter an integer");
        Console.println("The user input %s as a integer", i);
        Console.println("inverse ln(%s) = %s", i, (Math.exp(Math.log(i))));
    }
}
    // Mode switching not sure how to use this yet understand changing the string formatting
//      public static void binary() {
//    ????
//        }
//      public static void octal() {
//    %o
//        }
//      public static void decimal() {
//    %d
//        }
//      public static void hexadecimal() {
//    %h
//        }
    // Again not sure with how to go about mode changes that change the calculator and how it returns values

//      public unitSwitch() {
//        case1 radian Math.toRadians(i)
//        case degree Math.toDegree(i)
//    }

//   public memory() {
//        case input  M+ adds the current displayed value in the memory and updates display
//        case input  MC reset the memory
//        case MRC recall the current value from memory to the display
//    }



