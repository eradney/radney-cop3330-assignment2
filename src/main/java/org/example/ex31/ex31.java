/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Radney
 */

package org.example.ex31;
import java.util.Scanner;

public class ex31 {
    public static void main ( String[] args ) {
        Scanner scnr = new Scanner(System.in);
        double age, heartRate;

        System.out.print("How old are you? ");
        age = scnr.nextDouble();
        System.out.print("What is your resting heart rate? ");
        heartRate = scnr.nextDouble();

        findTarget(age, heartRate);
    }

    public static double findTarget(double age, double rate) {
        double i, target, ph = 0;

        header(age, rate);

        for (i = .55; i < 1; i += .05) {
            target = ((220 - age) - rate) * i + rate;
            table(i, target);
            ph = target;
        }

        return ph;
    }

    public static void header(double age, double rate) {
        System.out.println("Resting Pulse: " + rate + "        Age: " + age + "\n");
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
    }

    public static void table(double i, double target) {
        double percent = i * 100;

        System.out.println(String.format("%.0f", percent) + "%          | " + String.format("%.0f", target) + " bpm");
    }
}
