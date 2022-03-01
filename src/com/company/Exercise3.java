package com.company;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int reverseNumber = 0;

        while (number > 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;

        }
        System.out.println(reverseNumber);
        scanner.close();
    }
}
