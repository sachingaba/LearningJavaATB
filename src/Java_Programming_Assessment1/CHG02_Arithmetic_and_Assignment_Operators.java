package Java_Programming_Assessment1;

import java.util.Scanner;

public class CHG02_Arithmetic_and_Assignment_Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = readInt(scan, "Enter Num1");
        int num2 = readInt(scan, "Enter num2");

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: "+mod);


    }


    static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (scan.hasNextInt()) {
            return scan.nextInt();
        } else {
            System.out.println("Enter Num Only");
            System.exit(0);
            return 0;

        }


    }

}
