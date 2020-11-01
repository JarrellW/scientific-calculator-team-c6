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
                case 0:
                    clear();
                    runMenu();
                    break;
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
                    //runMenu();
                    break;
                case 10:
                    //Calculator.factorial();
                    //runMenu();
                    break;
                case 11:
                    //our extra feature
                    //runMenu();
                    break;
                case 12:
                    //our second extra feature
                    //runMenu();
                    break;
                case 13:
                    Console.printTrigFunctionsMenuOptions();
                    Integer trigMenuOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (trigMenuOption) {
                        case 1:
                            SciFunctions.sin();
                            runMenu();
                            break;
                        case 2:
                             SciFunctions.cos();
                            runMenu();
                            break;
                        case 3:
                            SciFunctions.tan();
                            runMenu();
                            break;
                        case 4:
                              SciFunctions.sec();
                            runMenu();
                            break;
                        case 5:
                            SciFunctions.csc();
                            runMenu();
                            break;
                        case 6:
                            SciFunctions.cot();
                            runMenu();
                            break;
                        default:
                            Console.println("Invalid entry!");
                            runMenu();
                            break;
                    }

                    break;
                case 14:
                    Console.switchTrigUnitsMenu();
                    Integer trigUnitOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (trigUnitOption) {
                        case 1:
                            // SciFunctions.switchToDegrees();
                            //runMenu();
                            break;
                        case 2:
                            //SciFunctions.switchToRadians();
                            //runMenu();
                            break;
                        default:
                            Console.println("Invalid entry!");
                            //runMenu();
                            break;
                    }
                    break;
                case 15:
                    Console.logarithmicFunctionsMenu();
                    Integer logFuncOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (logFuncOption) {
                        case 1:
                             SciFunctions.log();
                            runMenu();
                            break;
                        case 2:
                             SciFunctions.naturalLog();
                            runMenu();
                            break;
                        case 3:
                            SciFunctions.inverseLog();
                            runMenu();
                            break;
                        case 4:
                            SciFunctions.inverseNaturalLog();
                            runMenu();
                            break;
                        default:
                            Console.println("Invalid entry!");
                            runMenu();
                            break;
                    }
                    break;
                case 16:
                    Console.switchDisplayModeMenu();
                    Integer switchDisplayOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (switchDisplayOption) {
                        case 1:
                            //binary()
                            //runMenu();
                            break;
                        case 2:
                            //Octal()
                            //runMenu();
                            break;
                        case 3:
                            //decimal()
                            //runMenu();
                            break;
                        case 4:
                            //hexidecimal()
                            //runMenu();
                            break;
                        default:
                            runMenu();
                            Console.println("Invalid entry!");
                            break;
                    }
                    break;
                case 17:
                    Console.memorySettingsMenu();
                    Integer memoryOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (memoryOption) {
                        case 1:
                            //addvalue();
                            //runMenu();
                            break;
                        case 2:
                            //clearmemory()
                            //runMenu();
                            break;
                        case 3:
                            //Recallmemory()
                            //runMenu();
                        default:
                            Console.println("Invalid entry!");
                            runMenu();
                            break;
                    }
                    break;
                case 18:
                break;

                default:
                    Console.println("Invalid entry!");
                    runMenu();
                    break;
            }

            quit = true;
        }

    }
    public static void clear() {
        String clearer = "";
        for (int i = 0; i < 50; i++) {
            clearer += "\n";
        }
        System.out.print(clearer);
    }

}

