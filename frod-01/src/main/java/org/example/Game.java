package org.example;

public class Game {

    private int randomnumber;
    private int attempts;

    public Game(int randomnumber) {
        this.randomnumber = randomnumber;
        this.attempts = 0;
    }

    public void setRandomnumber(int randomnumber) {
        this.randomnumber = randomnumber;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int getRandomnumber() {
        return randomnumber;
    }
    public int getAttempts() {
        return attempts;
    }


    public boolean checkguess(int guess) {

        attempts++;

        if (guess < randomnumber) {
            System.out.println("Your guess is too low");
        } else if(guess > randomnumber) {
            System.out.println("Your guess is too high");
        } else {
            return true;
        }

        return false;
    }
}


