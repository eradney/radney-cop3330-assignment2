/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Radney
 */

package org.example.ex29;
import java.util.Scanner;


public class ex29 {
    public static void main( String[] args) {
        Scanner scnr = new Scanner(System.in);
        double rate, years;

        System.out.print("What is the rate of return? ");

        while (true) {
            if (scnr.hasNextDouble()) {
                rate = scnr.nextDouble();

                if (rate > 0.0) {
                    years = Math.ceil(72 / rate);
                    System.out.println("It will take " + String.format("%.0f",years) + " years to double your initial investment.");
                    break;
                }
            }

            System.out.println("Sorry, that is not a valid input.");
            scnr.nextLine();
            System.out.print("What is the rate of return? ");
        }
    }
}
