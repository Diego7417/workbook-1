package com.pluralsight;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hours worked ");
        double hoursWorked = scanner.nextDouble();
        
        System.out.print("Enter pay rate ");
        double payRate = scanner.nextDouble();
        double grossPay = hoursWorked * payRate;
        
        System.out.println("\nPayroll Summary: ");
        System.out.println("Employee's Name" + " " + name);
        System.out.printf("Gross Pay: $%.2f\n ", grossPay);
        }

    }

