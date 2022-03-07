package com.company;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of number you want to sum:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter a number you want to sum:");
            sum += scanner.nextInt();
        }
        System.out.println("Your sum is: " + sum);
        scanner.close();
    }
}
