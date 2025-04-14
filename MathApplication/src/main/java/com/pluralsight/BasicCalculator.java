package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        float num1 = myScanner.nextFloat();

        System.out.print("Enter second number:");
        float num2 = myScanner.nextFloat();

       System.out.println("Possible calculations");
       System.out.println("(A)dd");
       System.out.println("(S)ubtract");
       System.out.println("(M)ultiply");
       System.out.println("(D)vide");
       System.out.println("Please select one of the options");
       char option = myScanner.next().toUpperCase().charAt(0);

       float result = num1 * num2;
       System.out.printf("%.2f * %.2f = %.2f", num1, num2, result);

    }
}
