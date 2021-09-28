/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Radney
 */

package org.example.ex30;


public class ex30 {
    public static void main ( String[] args ) {
        int i, j, holdLast = 0;

        for (i = 1; i <= 12; i++) {
            System.out.format("%4d", i);

            for (j = 2; j <= 12; j++) {
                System.out.format("%4d", i * j);
                holdLast = i * j;
            }

            System.out.print("\n");
        }
    }
}

