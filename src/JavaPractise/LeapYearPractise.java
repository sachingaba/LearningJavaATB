package JavaPractise;

import java.util.Scanner;

public class LeapYearPractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        while (sc.hasNextInt()) {
            int year = sc.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("not a leap year");
            }
        }
    }
}