/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Radney
 */

package org.example.ex32;
import java.util.Scanner;


public class ex32 {
    public static void main ( String[] args ) {
        Scanner scnr = new Scanner(System.in);
        int level;

        while (true) {
            System.out.println("Let's play Guess the Number!\n");
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            level = scnr.nextInt();

            game(level);

            System.out.print("Do you wish to play again (Y/N)? ");
            char replay = scnr.next().charAt(0);

            if (replay == 'N' || replay == 'n') {
                break;
            }
        }
    }

    public static void game(int level) {
        double base = Math.random(), goal = 0;

        if (level == 1) {
            goal = Math.floor(base * 10) + 1;
        }
        else if (level == 2) {
            goal = Math.floor(base * 100) + 1;
        }
        else {
            goal = Math.floor(base * 1000) + 1;
        }

        gameLoop(goal);

    }

    public static void gameLoop(double goal) {
        Scanner scnrLoop = new Scanner(System.in);
        double guess;
        int i = 1;

        System.out.print("I have my number. What's your guess? ");

        while(true) {
            if (scnrLoop.hasNextDouble()) {

                guess = scnrLoop.nextDouble();

                if (guess == goal) {
                    break;
                }

                if (goal > guess) {
                    System.out.print("Too low. Guess again: ");
                }
                else {
                    System.out.print("Too high. Guess again: ");
                }
            }
            else {
                System.out.print("The value entered was not a number. Guess again: ");
            }

            scnrLoop.nextLine();
            i++;
        }

        if (i == 1) {
            System.out.println("You got it in 1 guess!");
        }
        else {
            System.out.println("You got it in " + i + " guesses!");
        }
    }
}
