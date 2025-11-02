package Exercises;

import java.util.Scanner;

public class Task25_Number_Divisible_by_5_n_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = readInt(scan , "Enter Number");

        if(num%5==0 && num%11==0)
        {
            System.out.println("YES , for both 5 and 11");
        }else {
            System.out.println("No means NO");
        }

    }static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (!scan.hasNextInt()) {
            System.out.println("Enter valid Number");
            System.exit(0);

        } else if (scan.nextInt() < 1) {
            System.out.println("Enter positive num from 1");

        }
        return scan.nextInt();
    }
}

