package Exercises;

import java.util.Scanner;

public class Task31_Print_hello_5_Times {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int val = readInt(scan , "Tell me how many times you want to print ");
        System.out.println("Enter what you want to print");
        String sach = scan.next();
        for (int i = 1; i <=val; i++) {
            System.out.println(i + ". " + sach.toUpperCase());
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
