package Java_Programming_Assessment1;

import java.util.Scanner;

public class CHG04_Increment_Decrement_Operator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = readInt(scan , "Enter Num");
        int num1 = readInt(scan , "Enter Num1");
        int num2 = readInt(scan , "Enter Num2");
        int num3 = readInt(scan , "Enter Num3");
        int num4 = readInt(scan , "Enter Num4");


        System.out.println("Original: " +  num);
        System.out.println("Pre-increment: " +  ++num1);
        System.out.println("Post-increment: "+  num2++);
        System.out.println("Pre-decrement: "+  --num3);
        System.out.println("Post-decrement: "+  num4--);


     //   5 6 Post-increment: 6 (returned 6)  5 Post-decrement: 5 (returned 5)

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
