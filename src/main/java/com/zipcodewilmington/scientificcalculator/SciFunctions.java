import com.zipcodewilmington.scientificcalculator.Console;

public class SciFunctions {

    public static void sin() {
        Integer i = Console.getIntegerInput("Enter an integer");
        Console.println("%s ", Math.toRadians(Math.sin(i)));
    }
//    public static void cos() {
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Console.println("%s ", Math.toRadians(Math.cos(i)));
//    }
//    public static void tan() {
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Console.println("%s ", Math.toRadians(Math.tan(i)));
//    }
//    public static void sec() {
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Console.println("%s ", 1/Math.toRadians(Math.sin(i)));
//    }
//    public static void csc() {
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Console.println("%s ", 1/Math.toRadians(Math.cos(i)));
//    }
//    public static void cot() {
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Console.println("%s ", 1/Math.toRadians(Math.tan(i)));
//    }

//        Integer i = Console.getIntegerInput("Enter an integer");
//        Console.println("%s ", 1/Math.toRadians(Math.tan(i)));
//    }
//
//
////
////
////    public static void binary() {
//////     /*
//////        int bi = Integer.valueOf(a, 2);
//////        int oct = Integer.valueOf(a, 8);
//////        int dec = Integer.valueOf(a, 10);
//////        int Hex = Integer.valueOf(a, 16);
//////      */
//
//////    public memory() {
//////        /*
//////        case input  M+ adds the current displayed value in the memory and updates display
//////        case input  MC reset the memory
//////        case MRC recall the current value from memory to the display
//////         */
//////    }
////      public unitSwitch() {
////////        /*
////////        case radian Math.toRadians(num)
////////        case degree Math.toDegree(num)
////////         */
////////    }
////////    public logFunctions() {
////////        /*
////////        case log = Math.log10(number),number
////////        case natural log = Math.log(number)
////////        case inverse log = Math.exp(Math.log10())
////////        case inverse natural log = Math.exp(Math.log())
////////         */
////////    }
}
