package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = myScanner.nextInt();

        System.out.print("Enter second number:");
        int num2 = myScanner.nextInt();

       System.out.println("Possible calculations");
       System.out.println("(A)dd");
       System.out.println("(S)ubtract");
       System.out.println("(M)ultiply");
       System.out.println("(D)vide");
       System.out.println("Please select one of the options");
       char option = myScanner.next().toUpperCase().charAt(0);

       int result = num1 * num2;
       System.out.printf("The result is" + result);

    }
}
