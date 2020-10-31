package com.zipcodewilmington.scientificcalculator;

import jdk.nashorn.internal.runtime.ScriptFunction;

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
        case 4:
            Calculator.divide();
            break;
        case 5:
            Calculator.square();
            break;
        case 6:
            Calculator.squareRoot();
            break;
        case 7:
                Calculator.toThePowerOf();
        case 8:
            Calculator.inverse();
            break;
       /* case 9:
            Calculator.switchSign();
            break;
        case 10:
            Calculator.factorial();
            break;
        case 11:
            //our extra feature
            break;
        case 12:
            //our second extra feature
            break; */
        case 13:
            Console.printTrigFunctionsMenuOptions();
            Integer trigMenuOption = Console.getIntegerInput("Enter Option Number: ");
                           /* switch(trigMenuOption){
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
        case 14:
            Console.switchTrigUnitsMenu();
            Integer trigUnitOption = Console.getIntegerInput("Enter Option Number: ");
                           /* switch(trigUnitOption){
                                case 1:
                                    switchToDegrees();
                                    break;
                                case 2:
                                    switchToRadians();
                                    break;
                                default:
                                    Console.println("Invalid entry!");
                                    break;
                            }*/
        case 15:
                Console.logarithmicFunctionsMenu();
                Integer logFuncOption = Console.getIntegerInput("Enter Option Number: ");
                            switch(logFuncOption){
                                case 1:
                                   // log()
                                    break;
                                case 2:
                                    // inverse log()
                                    break;
                                case 3:
                                    //naturallog()
                                    break;
                                case 4:
                                    //inverse natural log()

                            }
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
