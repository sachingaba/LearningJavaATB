package Exercises;

import java.util.Scanner;

public class Task04_check_even_or_not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        oeCheck(scan, "Enter Num");
    }

    static void oeCheck(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is Even No.");
            } else {
                System.out.println(num + " is ODD No.");
            }
        }
    }
}

