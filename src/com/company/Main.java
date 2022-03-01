package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();
        int n = 1;

        while (n <= number) {
            System.out.println("The number is: " + n++);
        }
        scanner.close();
    }
}
