package Exercises;

import java.util.Scanner;

public class Task14_Find_Smallest_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Num1 = readInt(scan,"Enter Num 1 ");
        int Num2 = readInt(scan,"Enter Num 2 ");
      //  int Num3 = readInt(scan,"Enter Num 3 ");

        if(Num1<Num2)
        {
            System.out.println(Num1 + " Is smaller");
        }
        else {
            System.out.println(Num2 + " Is smaller");
        }


    }static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (!scan.hasNextInt()) {
            System.out.println("Enter Num Only");
        }
        return scan.nextInt();
}
}