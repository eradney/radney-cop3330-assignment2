/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Radney
 */

package org.example.ex27;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ex27 {

    static String outputState = "";

    public static void main( String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName, lastName, zipCode, employeeID;

        System.out.print("Enter the first name: ");
        firstName = scnr.next();
        System.out.print("Enter the last name: ");
        lastName = scnr.next();
        System.out.print("Enter the ZIP code: ");
        zipCode = scnr.next();
        System.out.print("Enter the employee ID: ");
        employeeID = scnr.next();

        validateInput(firstName, lastName, zipCode, employeeID);
    }

    public static String validateInput(String first, String last, String zip, String eID) {
        String ph1, ph2, ph3, ph4;

        ph1 = checkFirst(first);
        ph2 = checkLast(last);
        ph3 = checkZip(zip);
        ph4 = checkID(eID);

        if (ph1.equalsIgnoreCase("Good") && ph2.equals("Good") && ph3.equals("Good") && ph4.equals("Good")) {
            return printAllGood();
        }
        else {
            return printAllErrors();
        }
    }

    public static String printAllErrors() {
        System.out.println(outputState);
        return outputState;
    }

    public static String printAllGood() {
        String output = "There were no errors found.";
        System.out.println(output);
        return output;
    }

    public static String checkFirst(String name) {
        if (name.length() == 0) {
            return noFirst();
        }
        else if (name.length() < 2) {
            return shortFirst();
        }
        return "Good";
    }

    public static String noFirst() {
        String output = "The first name must be at least 2 characters long.\nThe first name must be filled in.\n";
        outputState = outputState + output;
        return output;
    }

    public static String shortFirst() {
        String output = "The first name must be at least 2 characters long.\n";
        outputState = outputState + output;
        return output;
    }

    public static String checkLast(String name) {
        if (name.length() == 0) {
            return noLast();
        }
        if (name.length() < 2) {
            return shortLast();
        }
        return "Good";
    }

    public static String noLast() {
        String output = "The lsat name must be at least 2 characters long.\nThe last name must be filled in.\n";
        outputState = outputState + output;
        return output;
    }

    public static String shortLast() {
        String output = "The last name must be at least 2 characters long.\n";
        outputState = outputState + output;
        return output;
    }

    public static String checkZip(String zip) {
        char [] zipCheck = zip.toCharArray();
        boolean letters = false;
        int i;

        for (i = 0; i < zipCheck.length; i++) {
            if(Character.isAlphabetic(zipCheck[i])) {
                letters = true;
            }
        }

        if (letters || zip.length() != 5) {
            return zipError();
        }
        return "Good";
    }

    public static String zipError() {
        String output = "The ZIP code must be a 5 digit number.\n";
        outputState = outputState + output;
        return output;
    }

    public static String checkID(String ID) {
        String format = "[a-zA-Z]{2}[-][0-9]{4}";

        if(!Pattern.matches(format, ID)) {
            return IDError();
        }
        return "Good";
    }

    public static String IDError() {
        String output = "The employee ID must be in the format of AA-1234.\n";
        outputState = outputState + output;
        return output;
    }
}
