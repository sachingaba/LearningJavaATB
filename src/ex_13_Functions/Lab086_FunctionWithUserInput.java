package ex_13_Functions;

import java.util.Scanner;

public class Lab086_FunctionWithUserInput {
    // Function with parameter but no return type
    public static void main(String[] args) {
        //Math function - with parameter and with return type
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();

        int max = Math.max(a1,a2);
        System.out.println(max);

    }
}
