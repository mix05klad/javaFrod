package org.example;

import java.util.Random;

public class Game {

    private final int number;
    private int attempts;

    public Game() {
        Random random = new Random();
        this.number = random.nextInt(100) + 1;
        this.attempts = 0;
    }

    public int getAttempts() {
        return attempts;
    }

    public boolean guessNumber(int guess) {
        attempts++;

        if (guess < number) {
            System.out.println("Your guess is too low");
            return false;
        }

        if(guess > number) {
            System.out.println("Your guess is too high");
            return false;
        }

        System.out.println("Your guess is correct!");
        return true;
    }
}


