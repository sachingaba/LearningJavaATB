package Exercises;

import java.util.Scanner;

public class Task06_Check_vowel_consonants {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character from a to z");
        if (!scan.hasNextInt()) {
            String c = scan.next();
            if (c.length() == 1) {
               // System.out.println(c);
                c = c.toUpperCase();

                if (c.equals("A")) {
                    System.out.println(c + " is a vowel");
                } else if (c.equals("E")) {
                    System.out.println(c + " is a vowel");

                } else if (c.equals("I")) {
                    System.out.println(c + " is a vowel");

                } else if (c.equals("O")) {
                    System.out.println(c + " is a vowel");

                } else if (c.equals("U")) {
                    System.out.println(c + " is a vowel");

                } else {
                    System.out.println(c + " is a consonant");
                }

            } else {
                System.out.println("Please enter single character");
            }
        }else {
            System.out.println("Only character is allowed");

        }
        }
    }
