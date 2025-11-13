package ex_10_For_Loop;

import java.util.Scanner;

public class Factorial_practise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = num(scan, "Enter your number");
int factorial = 1;

if(n==0){
    System.out.println("0 not allowed or fact is 1");
}
        for (int i = n; i > 0; i--) {
factorial = factorial *i;
        }
        System.out.println(factorial);

    }

    static int num(Scanner scan, String prompt) {
        System.out.println(prompt);
        // int input = scan.nextInt();
        if (!scan.hasNextInt()) {
            System.out.println("Enter No. only");
            System.out.println("Enter again");
            scan.nextInt();
            // System.exit(0);
        }
        return scan.nextInt();
    }
}
