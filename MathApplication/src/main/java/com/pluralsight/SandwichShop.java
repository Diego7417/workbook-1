package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basePrice = 0.00;
        double loadedPrice = 0.00;

        System.out.println("Select sandwich size off menu");
        System.out.println("1: Regular $5.45");
        System.out.println("2: Large $8:95");
        int size = scanner.nextInt();

        if (size == 1){
            basePrice = 5.45;
            loadedPrice = 1.00;
        } else if (size == 2){
            basePrice = 8.95;
            loadedPrice = 1.75;
        } else {
            System.out.println("Invalid sandwich size, Please select 1 or 2");
            return;
        }
        System.out.println("Would you like your sandwich loaded? (yes/no):");
        scanner.nextLine();
        String loadedOption = scanner.nextLine();

        if (loadedOption.equals("yes")){
            basePrice += loadedPrice;
        }

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        double discount = 0.00;
        if (age <= 17){
            discount =0.10;

        }else if (age >= 65);{
            discount = 0.20;
        }
        double finalPrice = basePrice * (1 - discount);
        System.out.println("Your total will be:$" + finalPrice);




    }
}
