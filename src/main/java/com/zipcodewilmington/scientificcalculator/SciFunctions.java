package com.zipcodewilmington.scientificcalculator;
import com.zipcodewilmington.scientificcalculator.Console;

public class SciFunctions {
    public static void sin() {
        Double i = Console.getDoubleInput("Enter number");
        Console.println("sin(%s) = %s", i, (Math.sin(i)));

    }

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

    // Mode switching not sure how to use this yet understand changing the string formatting
//      public static void binary() {
//    ????
//        }
    public static void octal() {
        Double i = Console.getDoubleInput("Enter a number");
        Console.println("%s = %o", i);
    }

    public static void decimal() {
        Double i = Console.getDoubleInput("Enter a number");
        Console.println("%s = %d", i);
    }

    public static void hexadecimal() {
        Double i = Console.getDoubleInput("Enter a number");
        Console.println("%s = %h", i);
    }
}
    // Again not sure with how to go about mode changes that change the calculator and how it returns values

//      public unitSwitch() {
//        case1 radian Math.toRadians(i)
//        case degree Math.toDegree(i)
//    }

   //public static void memory() {

//        case input  M+ adds the current displayed value in the memory and updates display

//        case input  MC reset the memory
       //case MRC recall the current value from memory to the display
  //}



