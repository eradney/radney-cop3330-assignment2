/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Radney
 */

package org.example.ex33;
import java.util.Scanner;


public class ex33 {
    public static void main ( String[] args ) {
        Scanner scnr = new Scanner(System.in);
        int rand = (int) Math.floor(Math.random() * 3);
        String [] answers = {"Yes", "No", "Maybe", "Ask again later"};

        System.out.print("*-* Welcome to the Magic 8 Ball! *-*\nWhat's your question?\n> ");
        scnr.nextLine();
        System.out.println(answers[rand]);
    }
}
