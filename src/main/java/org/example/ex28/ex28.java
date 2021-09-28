/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Radney
 */

package org.example.ex28;
import java.util.Scanner;

public class ex28 {
    public static void main( String[] args) {
        Scanner scnr = new Scanner(System.in);
        int [] ph = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            ph[i] = scnr.nextInt();
        }

        for (int j = 0; j < ph.length; j++) {
            sum += ph[j];
        }

        System.out.println("The total is " + sum + ".");
    }
}
