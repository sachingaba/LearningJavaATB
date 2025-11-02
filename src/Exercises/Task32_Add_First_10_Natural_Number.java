package Exercises;

import java.util.Scanner;

public class Task32_Add_First_10_Natural_Number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int val = readInt(scan, "Enter how many first natural no. you want to add");
        int x = val;
        int sum1 = (x*(x+1)/2) ;
        int sum = 0;
        for (int i = 1; i <= val; i++) {
            sum = sum + i;

        }


        System.out.println(sum);
        System.out.println("sum1 " + sum1);
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
