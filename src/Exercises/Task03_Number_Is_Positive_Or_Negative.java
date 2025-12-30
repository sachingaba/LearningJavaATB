package Exercises;

import java.util.Scanner;

public class Task03_Number_Is_Positive_Or_Negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        while(scanner.hasNextInt()) {
            NumPN(scanner);
        }

            System.out.println("not a number , so cant help ");


    }

       static void  NumPN(Scanner scanner){


        while(scanner.hasNextInt()) {


            int num1 = scanner.nextInt();

            if (num1 >= 0) {
                System.out.println("Number is Positive");
            } else {
                System.out.println("Number is Negative");
            }
        }
            System.out.println("Please enter Num only");

    }
}
