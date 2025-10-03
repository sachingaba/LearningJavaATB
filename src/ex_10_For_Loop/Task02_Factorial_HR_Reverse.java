package ex_10_For_Loop;

import java.util.Scanner;

public class Task02_Factorial_HR_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scanner.nextInt();
        int fact = 1;
        if (n==0){
            fact = 1;
        }
        for (int i = n ; i >= 1 ; i--) {
            fact = fact*i; // 5*4*3*2*1

        }
        System.out.println("factorial of " + n + " is " + fact);
    }
}
