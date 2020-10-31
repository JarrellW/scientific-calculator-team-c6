import com.zipcodewilmington.scientificcalculator.Console;

public class SciFunctions {

// These are not functional yet need to figure out the formatting
    public static void sin() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("%s ", i, Math.toRadians(Math.sin(i)));
    }
    public static void cos() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("%s ", i, Math.toRadians(Math.cos(i)));
    }
    public static void tan() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("%s ", i, Math.toRadians(Math.tan(i)));
    }
    public static void sec() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("%s ", i, 1/Math.toRadians(Math.sin(i)));
    }
    public static void csc() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("%s ", i, 1/Math.toRadians(Math.cos(i)));
    }
    public static void cot() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("%s ", i, 1/Math.toRadians(Math.tan(i)));
    }
    public static void log() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("%s ", Math.log10(i));
    }
    public static void naturalLog() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("%s ", Math.log(i));
    }
    public static void inverseLog() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("%s ", (Math.exp(Math.log10(i))));
    }
    public static void inverseNaturalLog() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("%s ", (Math.exp(Math.log(i))));
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
//        case radian Math.toRadians(num)
//        case degree Math.toDegree(num)
//    }

//   public memory() {
//        case input  M+ adds the current displayed value in the memory and updates display
//        case input  MC reset the memory
//        case MRC recall the current value from memory to the display
//    }


}
