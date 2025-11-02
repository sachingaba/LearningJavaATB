package Exercises;

import java.util.Scanner;

public class Task36_While_Loop_print_java {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int val = readInt(scan,"Enter the value");

        int i = 1;
        while (i <= val) {
            System.out.println(i + ". Java");
            i++;
        }
    }static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (!scan.hasNextInt()) {
            System.out.println("Enter valid Number");

        } else if (scan.nextInt() < 1) {
            System.out.println("Enter positive num");

        }
        return scan.nextInt();
    }
}