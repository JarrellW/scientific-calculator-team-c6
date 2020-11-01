package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Menu {
    public static void runMenu() {
      boolean quit = false;


        while (quit == false ) {

            Console.println("Calculator Main Menu:");
            Console.printMenuOptions();
            Integer userInput = Console.getIntegerInput("Enter Option Number: ");
            switch (userInput) {
                case 1:
                    Calculator.add();
                    runMenu();
                    break;
                case 2:
                    Calculator.subtract();
                    runMenu();
                    break;
                case 3:
                    Calculator.multiply();
                    runMenu();
                    break;
                case 4:
                    Calculator.divide();
                    runMenu();
                    break;
                case 5:
                    Calculator.square();
                    runMenu();
                    break;
                case 6:
                    Calculator.squareRoot();
                    runMenu();
                    break;
                case 7:
                    Calculator.toThePowerOf();
                    runMenu();
                    break;
                case 8:
                    Calculator.inverse();
                    runMenu();
                    break;
                case 9:
                    //Calculator.switchSign();
                    break;
                case 10:
                    //Calculator.factorial();
                    break;
                case 11:
                    //our extra feature
                    break;
                case 12:
                    //our second extra feature
                    break;
                case 13:
                    Console.printTrigFunctionsMenuOptions();
                    Integer trigMenuOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (trigMenuOption) {
                        case 1:
                            // SciFunctions.sin();
                            break;
                        case 2:
                            // SciFunctions.cos();
                            break;
                        case 3:
                            //SciFunctions.tan();
                            break;
                        case 4:
                            //  SciFunctions.sec();
                            break;
                        case 5:
                            //SciFunctions.csc();
                            break;
                        case 6:
                            //SciFunctions.cot();
                            break;
                        default:
                            Console.println("Invalid entry!");
                            break;
                    }

                    break;
                case 14:
                    Console.switchTrigUnitsMenu();
                    Integer trigUnitOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (trigUnitOption) {
                        case 1:
                            // SciFunctions.switchToDegrees();
                            break;
                        case 2:
                            //SciFunctions.switchToRadians();
                            break;
                        default:
                            Console.println("Invalid entry!");
                            break;
                    }
                case 15:
                    Console.logarithmicFunctionsMenu();
                    Integer logFuncOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (logFuncOption) {
                        case 1:
                            // SciFunctions.log()
                            break;
                        case 2:
                            // SciFunctions.naturalLog()
                            break;
                        case 3:
                            //SciFunctions.inverseLog()
                            break;
                        case 4:
                            //SciFunctions.SciFunctions.inverseNaturalLog()
                        default:
                            Console.println("Invalid entry!");
                            break;
                    }
                case 16:
                    Console.switchDisplayModeMenu();
                    Integer switchDisplayOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (switchDisplayOption) {
                        case 1:
                            //binary()
                            break;
                        case 2:
                            //Octal()
                            break;
                        case 3:
                            //decimal()
                            break;
                        case 4:
                            //hexidecimal()
                            break;
                        default:
                            Console.println("Invalid entry!");
                            break;
                    }
                case 17:
                    Console.memorySettingsMenu();
                    Integer memoryOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (memoryOption) {
                        case 1:
                            //addvalue();
                            break;
                        case 2:
                            //clear memory()
                            break;
                        case 3:
                            //Recall memory()
                        default:
                            Console.println("Invalid entry!");
                            break;
                    }
                case 18:
                break;

                default:
                    Console.println("Invalid entry!");
                    break;
            }

            quit = true;
        }

    }

}

