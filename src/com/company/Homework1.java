package com.company;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter count of numbers you want to enter:");
        int count = scanner.nextInt();
        int minNumber = 0;
        int maxNumber = 0;
        int tempNumber;
        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number: ");
            tempNumber = scanner.nextInt();
            if (tempNumber > maxNumber) {
                maxNumber = tempNumber;
            }
            if (tempNumber < minNumber) {
                minNumber = tempNumber;
            }
        }
        System.out.println("Your max number is: " + maxNumber);
        System.out.println("Your min number is: " + minNumber);

        scanner.close();
    }
}
