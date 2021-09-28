/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Radney
 */

package org.example.ex26;
import java.util.Scanner;

/*
n = number of months
i = apr / 365
b = balance
p = monthly payment
 */
public class ex26 {
    public static void main( String [] args ) {
        Scanner scnr = new Scanner(System.in);
        double numMonth, i, b, p, apr;

        System.out.print("What is your balance? ");
        b = scnr.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        apr = scnr.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        p = scnr.nextDouble();

        i = apr / 36500;

        PaymentCalculator calc = new PaymentCalculator(i, b, p);
        calc.calculateMonthsUntilPaidOff();
    }

}
