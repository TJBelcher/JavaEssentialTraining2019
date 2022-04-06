package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

//        double d1 = new getaDouble(sc, "enter value #1: ");
        double d1 = new getaDouble("enter value #1: ");

//        double d2 = new getaDouble(sc, "enter value #2: ");
        double d2 = new getaDouble("enter value #2: ");

        double result = d1 / d2;

        System.out.println("The answer is " + result);
    }

//    private static double getaDouble(Scanner sc, String prompt) {
//        System.out.print(prompt);
//        var d1 = sc.nextDouble();
//        return d1;
//    }

}

