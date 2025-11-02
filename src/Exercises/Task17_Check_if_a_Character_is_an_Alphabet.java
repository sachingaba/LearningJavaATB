package Exercises;

import java.util.Scanner;

public class Task17_Check_if_a_Character_is_an_Alphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ss = readString(scan, "Enter char value");
       /* if (ss.length()>1)
        {
            System.out.println("add only 1 char");
        }
        else {*/
//char[] kk = ss.toCharArray();
        if ((ss >= 'A' && ss <= 'Z') || (ss >= 'a' && ss <= 'z')) {
            System.out.println("char");
        } else {
            System.out.println(ss + " is not a character");
        }

    }

    static char readString(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (scan.next().length() != 1) {
            System.out.println("Enter 1 char only"); // test

        }
        //System.out.println(scan.next().charAt(0));
        return scan.next().charAt(0);
    }

}


