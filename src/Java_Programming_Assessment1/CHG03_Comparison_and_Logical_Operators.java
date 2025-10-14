package Java_Programming_Assessment1;

import java.util.Scanner;

public class CHG03_Comparison_and_Logical_Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = readInt(scan, "Enter Num1");
        int num2 = readInt(scan, "Enter num2");

        boolean isEqual = (num1==num2);
        boolean isGreater = (num1>num2);
        boolean isLesser = (num1<num2);
        boolean ig1 = (num1>num2) && (num1>0);
        boolean ig2 = (num1<num2) || (num1>0);
        boolean ig3 = !(num1>num2);

        System.out.println("a == b: " + isEqual);
        System.out.println("a > b: " + isGreater);
        System.out.println("a < b:" + isLesser);
        System.out.println("(a > b) && (a > 0) " + ig1);
        System.out.println("(a < b) || (a > 0): " + ig2);
        System.out.println("!(a > b): " + ig3);


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
