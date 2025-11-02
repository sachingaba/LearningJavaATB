package Exercises;

import java.util.Scanner;

import static java.lang.Integer.reverse;

public class Task18_To_check_If_a_Num_Is_Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = readInt(scan, "Enter NUum1");


        if (palidrome(num)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not");
        }


    }static int readInt(Scanner scan, String prompt){
        System.out.println(prompt);
        if (!scan.hasNextInt()) {
            System.out.println("Enter Num only");
        }

            return scan.nextInt();
    }


    static boolean palidrome(int num) {
        int ognum = num;
        int reversedNumber = 0;
            while (num != 0) {
                int remainder = num % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                num /= 10;


            }
        System.out.println(reversedNumber);
            return ognum == reversedNumber;

    }
    }
