package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game game = new  Game();

        System.out.println("I have chosen a number from 1 to 100.");
        System.out.println("Try to guess it!");
        System.out.println();

        int guess;
        do {
            System.out.println("Guess the number: ");
            guess = scanner.nextInt();
            System.out.println();
        } while (!game.guessNumber(guess));

        scanner.close();

        System.out.println("You found the number '" + guess + "' in " + game.getAttempts() + " attempts.");
    }
}