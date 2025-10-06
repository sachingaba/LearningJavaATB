package ex_13_Functions;

import java.util.Scanner;

public class Lab094_Function_Arth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Num1 = readInt(scan, "Enter NUm1");
        int Num2 = readInt(scan, "Enter NUm2");

        int Sum1 = Sum1(Num1, Num2);
        System.out.println("Sum of 2 is " + Sum1);

        int Sub1 = Sub(Num1, Num2);
        System.out.println("Substraction of 2 is " + Sub1);

        int Mul1 = Mul(Num1, Num2);
        System.out.println("Multiply of 2 is " + Mul1);

        int Div1 = Div(Num1, Num2);
        System.out.println("Division of 2 is " + Div1);

        int Mod1 = Mod(Num1, Num2);
        System.out.println("Modulus of 2 is " + Mod1);

    }

    static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (scan.hasNextInt()) {
            return scan.nextInt();

        } else {
            System.out.println("Enter Num only");
            System.exit(0);
            return 0;
        }

    }

    static int Sum1(int Num1, int Num2) {
        return Num1 + Num2;
    }

    static int Sub(int Num1, int Num2) {
        return Num1 - Num2;
    }

    static int Mul(int Num1, int Num2) {
        return Num1 * Num2;
    }

    static int Div(int Num1, int Num2) {
        if (Num2 == 0) {
            throw new ArithmeticException("Division by 0 is not allowed");
        } else {
            return Num1 / Num2;
        }

    }

    static int Mod(int Num1, int Num2) {
        return Num1 % Num2;

    }
}