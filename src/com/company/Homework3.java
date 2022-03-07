package com.company;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length of Fibonacci sequence: ");
        int length = scanner.nextInt();
        int prevNumber1 = 0;
        int prevNumber2 = 0;
        int fibNumber;

        for (int i = 0; i < length; i++) {
            fibNumber = prevNumber1 + prevNumber2;
            if (prevNumber1 == 0) {
                prevNumber2 = 1;
            }
            System.out.println(fibNumber);
            prevNumber1 = prevNumber2;
            prevNumber2 = fibNumber;
        }

        scanner.close();
    }
}
