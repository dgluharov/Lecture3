package com.company;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number:");
        int n = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }

        System.out.println(result);
        scanner.close();
    }
}
