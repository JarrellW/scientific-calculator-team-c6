package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Calculator Main Menu:");
        Console.printMenuOptions();
        Integer userInput = Console.getIntegerInput("Enter Option Number: ");
        switch(userInput) {
        case 1:
            Calculator.add();
            break;
        case 2:
            Calculator.subtract();
            break;
        case 3:
            Calculator.multiply();
            break;
       /* case 4:
            Calculator.divide();
            break;
        case 5:
            Calculator.square();
            break;
        case 6:
            Calculator.squareRoot();
            break;
        case 7:
            Calculator.inverse();
            break;
        case 8:
            Calculator.switchSign();
            break;
        case 9:
            Calculator.factorial();
            break;
        case 10:
            //our extra feature
            break;
        case 11:
            //our second extra feature
            break; */
        case 12:
            Console.printTrigFunctionsMenuOptions();
            Integer trigMenuOption = Console.getIntegerInput("Enter Option Number: ");
                           /*  switch(trigMenuOption){
                                 case 1:
                                     Calculator.sine();
                                     break;
                                 case 2:
                                     Calculator.cosine();
                                     break;
                                 case 3:
                                     Calculator.tangent();
                                     break;
                                 case 4:
                                     Calculator.inverseSine();
                                     break;
                                 case 5:
                                     Calculator.inverseCosine();
                                     break;
                                 case 6:
                                     Calculator.inverseTangent();
                                     break;
                                    default:
                                        Console.println("Invalid entry!");
                                        break;
                             }

                            */
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
