package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
 //     Question 1
//       Bob's and Gary's salary
        int bobAnnualSalary = 94000;
        int garyAnnualSalary = 84000;
        int highestAnnualSalary = Math.max(bobAnnualSalary, garyAnnualSalary);
        System.out.println("The highest salary is..." + highestAnnualSalary + "salary");

//       Question 2
//        Car and Truck price
        int carPrice = 28000;
        int truckPrice = 55000;
        int cheapestVehicle = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest car is..." + cheapestVehicle + "Car");

//     Question 3
//      Area of circle
        double circleRadius = 7.25;
        double radiusSquared = Math.pow(circleRadius, 2);
        double areaOfCircle = Math.PI * radiusSquared;
        System.out.println("The area of the circle is..." + areaOfCircle);

//        Question 4
//        Square root
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of" + number + "is..." + squareRoot);

//        Question 5
//        Distance between the points
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        int dx = x2 - x1;
        int dy = y2 - y1;
        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        System.out.println("The distance between the points is" + distance);

//        Question 6
//        Value of a variables
        double num = -3.8;
        double absoluteValue = Math.abs(num);
        System.out.println("The absolute value is..." + absoluteValue);

//        Question 7
//        Display a random number
        double randomNumber = Math.random();
        System.out.println("The random between 1 and 0 is..." + randomNumber);


        

    }
}
