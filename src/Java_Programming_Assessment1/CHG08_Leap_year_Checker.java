package Java_Programming_Assessment1;

import java.util.Scanner;

public class CHG08_Leap_year_Checker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = readInt(scan, " Enter year");
        if ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)) {
                System.out.println("leap Year");


            } else {
                System.out.println("not Leap year");
            }
        }



    static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (scan.hasNextInt()) {
            return scan.nextInt();
        } else {
            System.out.println("Enter Num Only");
            System.exit(0);
            return 0;
        }
    }
}


