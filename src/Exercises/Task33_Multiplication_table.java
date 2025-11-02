package Exercises;

import java.util.Scanner;

public class Task33_Multiplication_table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int table = readInt(scan, "table of");

        for (int i = 1; i <= 10; i++) {
            int mul = table * i;
            System.out.println(table + " x " + i + " = " + mul);

        }
    }

    static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (!scan.hasNextInt()) {
            System.out.println("Enter valid Number");

        } else if (scan.nextInt() < 1) {
            System.out.println("Enter positive num");

        }
        return scan.nextInt();
    }
}