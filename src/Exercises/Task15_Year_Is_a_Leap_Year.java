package Exercises;

import java.util.Scanner;

public class Task15_Year_Is_a_Leap_Year {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int year = readInt(scan , "Enter year XXXX");

        if(year%4==0 && year%100!=0||year%400==0){
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (!scan.hasNextInt()) {
            System.out.println("Enter Num Only");
        }
        return scan.nextInt();
    }
}
