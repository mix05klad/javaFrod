package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Guess the number ===");

        int randomnumber = random.nextInt(100) + 1;
        Game game = new  Game(randomnumber);

        System.out.println("I have choosen a number from 1 to 100!!");
        System.out.println("Try to guess it!!");

        while (true) {
            System.out.println("Guess the number: ");
            int guess = scanner.nextInt();

            boolean result = game.checkguess(guess);

            if (result) {
                System.out.println("You guessed it!");
                System.out.println("You found the number in " + game.getAttempts() + " attempts!");
                break;
            }
        }

        scanner.close();
    }
}