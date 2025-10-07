package ex_15_StringBuffer_StringBuilder_StringFunctions;

import java.util.Scanner;

public class Lab109_Reverse_Program {
    public static void main(String[] args) {
        // Write a program to reverse a string with using inbuilt function

        Scanner scan = new Scanner(System.in);
         String user_input = scan.next();


        StringBuilder name = new StringBuilder(user_input);
        System.out.println(name.reverse());
    }
}
