package Exercises;

import java.util.Scanner;

public class Task07_Eligible_To_Vote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        agetest(scan, "Enter Your age");

    }

    static void agetest(Scanner scan, String prompt) {
        System.out.println(prompt);
        int age = scan.nextInt();
        if (age > 21) {
            System.out.println("Eligibe to vote");

        } else {
            System.out.println("Not eligible to vote");
        }
    }
}