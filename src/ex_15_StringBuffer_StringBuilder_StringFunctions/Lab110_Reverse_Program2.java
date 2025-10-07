package ex_15_StringBuffer_StringBuilder_StringFunctions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab110_Reverse_Program2 {
    public static void main(String[] args) {
        // Write a program to reverse a string WITHOUT using inbuilt function

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string and I will reverse it");
        String user_input = scan.next();


       StringBuilder name = new StringBuilder(user_input);
        System.out.println(name.length());

        String reverse = "";
        for (int i = user_input.length()-1; i >=0; i--) {
            reverse = reverse + user_input.charAt(i);

        }
        System.out.println(reverse);
    }
}
