/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Radney
 */

package org.example.ex35;
import java.util.Scanner;
import java.util.ArrayList;

public class ex35 {
    public static void main ( String[] args ) {
        String winner;
        ArrayList<String> names = new ArrayList<>();

        nameStorage(names);

        winner = hungerGames(names);

        System.out.println("The winner is... " + winner + ".");
    }

    public static void nameStorage(ArrayList<String> names) {
        Scanner scnr = new Scanner(System.in);
        prompt();
        String name;

        while (true) {
            name = scnr.nextLine();

            if (name == "") {
                break;
            }

            names.add(name);
            prompt();
        }
    }

    public static void prompt() {
        System.out.print("Enter a name: ");
    }

    public static String hungerGames(ArrayList<String> tributes) {
        int rand = (int) Math.floor(Math.random() * tributes.size());

        return tributes.get(rand);
    }
}
