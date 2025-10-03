package ex_11_While_Loop;

import java.util.Scanner;

public class Task01_While_Loop_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No.");
        if (!scan.hasNextInt()) {
            System.out.println("Please enter integer");
        } else {
            int n = scan.nextInt();
            int fact = 1;

            if (n == 0) {
                System.out.println("1");
            }
            if(n<0 || n>Integer.MAX_VALUE) {
                System.out.println("Out of bound");
        }else{

            while (n >= 1) {    // i=1 ; while(i<=n)
                fact = fact * n; // fact = fact*i
                n--;                // i++

            }
            System.out.println(fact);
        }
    }
}}