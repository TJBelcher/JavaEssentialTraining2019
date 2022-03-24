package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("*** Welcome to YOUR 4-FUNCTION CALCULATOR (Y4FC) ***");
        System.out.println(" ");

        var scanner = new Scanner(System.in);

        String inputPrompt = "y";
        String inputFunc = " ";
        var nOne = 0.00;
        Double number1 = 0.00;
        Double number2 = 0.00;
        boolean inputChk = false;

        while ((inputPrompt.substring(0, 1).equalsIgnoreCase("y"))) {
            System.out.print("Enter number 1: ");
            while (!inputChk) {
                if (scanner.hasNextDouble()) {
                    number1 = scanner.nextDouble();
                    inputChk = true;
                }
                else {
                    var stringValue = scanner.next();
                    System.out.println(stringValue + " is invalid - input must be a numeric value");
                    System.out.print("Reenter number 1: ");
                }
            }
            inputChk = false;
            System.out.println(" ");
            System.out.print("Enter number 2: ");
            while (!inputChk) {
                if (scanner.hasNextDouble()) {
                    number2 = scanner.nextDouble();
                    inputChk = true;
                }
                else {
                    String stringValue = scanner.next();
                    System.out.println(stringValue + " is invalid - input must be a numeric value");
                    System.out.print("Reenter number 2: ");
                }
            }
            boolean mathOpNeeded = true;
            scanner.nextLine(); // This is needed in order to dispose of the '\n' character
                                // so it isn't recorded by the next line as input
            while (mathOpNeeded) {
                System.out.println(" ");
                System.out.print("Please enter a math operation: + - * /  ");

                inputFunc = scanner.nextLine();
                if ((inputFunc.equals("+")) | (inputFunc.equals("-")) |
                        (inputFunc.equals("/")) | (inputFunc.equals("\\")) |
                        (inputFunc.equals("*")) | (inputFunc.equals("x"))) {
                    System.out.println(" ");
                    mathOpNeeded = false;
                }
                else {
                    System.out.println(inputFunc + " is invalid!");
                }
            }

            if (inputFunc.equals("+")) {
                nOne = number1 + number2;
            }
            if (inputFunc.equals("-")) {
                nOne = number1 - number2;
            }
            if (inputFunc.equals("*") | inputFunc.equals("x")) {
                nOne = number1 * number2;
            }
            if ((inputFunc.equals("/")) | (inputFunc.equals("\\"))) {
                nOne = number1 / number2;
            }
            System.out.println(number1 + " " + inputFunc + " " + number2 + " = " + nOne);
            boolean continuationNeeded = true;
            while (continuationNeeded) {
                System.out.print("Would you like to perform another math operation (y/n)? ");
                inputPrompt = scanner.nextLine();
                if ((inputPrompt.equalsIgnoreCase("y")) |
                        (inputPrompt.equalsIgnoreCase("yes")) |
                        (inputPrompt.equalsIgnoreCase("n")) |
                        (inputPrompt.equalsIgnoreCase("no"))) {
                    continuationNeeded = false;
                    inputChk = false;
                } else {
                    System.out.println(inputPrompt + " is an invalid response!");
                }
              }
            }
        System.out.println(" ");
        System.out.println("Thank you for choosing the Y4FC calculator!");
        System.out.println("Have a great day! ");
    }
}
