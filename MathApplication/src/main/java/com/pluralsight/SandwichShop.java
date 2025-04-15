package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basePrice = 0.00;
        double discount = 0.00;

        System.out.println("Welcome to My Sandwich Shop");
        System.out.print("Enter sandwich siz (1 - Regular, 2 - Large):");
        int size = scanner.nextInt();

        if (size == 1){
            basePrice = 5.45;
        } else if (size == 2){
            basePrice = 8.95;
        } else {
            System.out.println("Invalid sandwich size, Please select 1 or 2");
        }

    }
}
