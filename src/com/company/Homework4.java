package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerWins = 0;
        int pcWins = 0;

        System.out.println("Enter 1 for Rock, 2 for Paper or 3 for Scissors: ");
        int playerInput = scanner.nextInt();

        while (playerInput != 0) {

            int pcInput = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            if (playerInput < 0 || playerInput > 3) {
                System.out.println("Invalid number!");
                System.out.println("Enter a number between 1 and 3");
                playerInput = scanner.nextInt();
                continue;
            }
            System.out.println("Player - " + playerInput);
            System.out.println("Pc - " + pcInput);
            if (playerInput == 1 && pcInput == 1 || playerInput == 2 && pcInput == 2 || playerInput == 3 && pcInput == 3) {
                System.out.println("Nobody wins");
            }
            if (playerInput == 1 && pcInput == 2) {
                System.out.println("PC win");
                pcWins += 1;
            }
            if (playerInput == 1 && pcInput == 3) {
                System.out.println("Player win");
                playerWins += 1;
            }
            if (playerInput == 2 && pcInput == 1) {
                System.out.println("Player win");
                playerWins += 1;
            }
            if (playerInput == 2 && pcInput == 3) {
                System.out.println("PC win");
                pcWins += 1;
            }
            if (playerInput == 3 && pcInput == 1) {
                System.out.println("PC win");
                pcWins += 1;
            }
            if (playerInput == 3 && pcInput == 2) {
                System.out.println("Player win");
                playerWins += 1;
            }

            System.out.println("Enter 1 for Rock, 2 for Paper or 3 for Scissors: ");
            playerInput = scanner.nextInt();

        }
        System.out.println("Player wins: " + playerWins);
        System.out.println("Pc wins: " + pcWins);

        scanner.close();
    }
}
