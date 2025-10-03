package ex_10_For_Loop;

import java.util.Scanner;

public class Task01_Factorial_HR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scanner.nextInt();
        int fact = 1;
        if (n==0){
            fact = 1;
        }
        for (int i = 1 ; i <= n ; i++) {
            fact = fact*i; // 1*2*3*4*5

        }
        System.out.println("factorial of " + n + " is " + fact);
    }



}
