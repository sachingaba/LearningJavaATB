package Exercises;

import java.util.Scanner;

public class Task15_Find_Smallest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Num1 = readInt(scan, "Enter Num 1 ");
        int Num2 = readInt(scan, "Enter Num 2 ");
        int Num3 = readInt(scan, "Enter Num 3 ");
        if (Num1 != Num2 && Num2 != Num3 && Num1 != Num3) {
            if (Num1 < Num2 && Num1 < Num3) {
                System.out.println(Num1 + " Is smaller1");
            } else if (Num2 < Num1 && Num2 < Num3) {
                System.out.println(Num2 + " Is smaller2");
            } else {
                System.out.println(Num3 + " Is smaller3");
            }
        } else {
            System.out.println("Please do not add same no.");

        }
    }
static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (!scan.hasNextInt()) {
            System.out.println("Enter Num Only");
        }
        return scan.nextInt();
    }
}

