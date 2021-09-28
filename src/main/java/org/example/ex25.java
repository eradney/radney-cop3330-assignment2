/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class ex25 {
    public static void main( String[] args ) {
        Scanner scnr = new Scanner(System.in);
        String password;

        System.out.print("Enter your password: ");
        password = scnr.next();

        passwordValidator(password);

    }

    public static void passwordValidator(String password) {
        int pw, digNum = 0, letNum = 0, specNum = 0;
        String str;

        pw = password.length();

        for(int i = 0; i < pw; i++) {
            char x = password.charAt(i);

            if(x > 47 && x < 58) {
                digNum++;
            }
            else if((x > 64 && x < 91) || (x > 96 && x < 123)) {
                letNum++;
            }
            else{
                specNum++;
            }
        }

        if(letNum > 0 && digNum > 0 && specNum > 0 && pw > 7) {
            System.out.println("The password is a very strong password.");
        }
        else if(letNum > 0 && digNum > 0 && pw > 7) {
            System.out.println("The password is a strong password.");
        }
        else if(letNum > 0 && digNum == 0 && specNum == 0 && pw < 8) {
            System.out.println("The password is a weak password.");
        }
        else if(letNum == 0 && digNum > 0 && specNum == 0 && pw < 8) {
            System.out.println("The password is a very weak password.");
        }
        else {
            System.out.println("Error: This password is not valid.");
        }
    }
}
