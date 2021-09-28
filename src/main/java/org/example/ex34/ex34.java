/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Radney
 */

package org.example.ex34;
import java.util.Scanner;
import java.util.ArrayList;

public class ex34 {
    public static void main ( String[] args ) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> employees = new ArrayList<>();
        String remove;

        createList(employees);

        System.out.println("There are " + employees.size() + " employees: ");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.print("Enter an employee name to remove: ");
        remove = scnr.nextLine();

        employees.remove(remove);

        System.out.println("There are " + employees.size() + " employees: ");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }

    public static ArrayList<String> createList(ArrayList<String> employees) {
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        return employees;
    }
}
