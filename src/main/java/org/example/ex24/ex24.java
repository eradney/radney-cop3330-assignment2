/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emily Radney
 */

package org.example.ex24;
import java.util.Scanner;
import java.util.Arrays;

public class ex24 {
    public static void main( String[] args ) {
        Scanner scnr = new Scanner(System.in);

        String str1, str2;

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        str1 = scnr.next();
        System.out.print("Enter the second string: ");
        str2 = scnr.next();

        if (isAnagram(str1,str2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        }
        else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }

    public static boolean isAnagram (String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();

        if (length1 != length2) {
            return false;
        }

        char str1Array[] = str1.toCharArray();
        char str2Array[] = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        for(int i = 0; i < length1; i++) {
            if(str1Array[i] != str2Array[i]) {
                return false;
            }
        }

        return true;
    }
}
