package Exercises;

import java.util.Scanner;

public class Task03_Number_Is_Positive_Or_Negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumPN(scanner, "Enter Num 1 : ");
    }

       static void  NumPN(Scanner scanner, String prompt){
           System.out.println(prompt);

        if (scanner.hasNextInt()) {


            int num1 = scanner.nextInt();

            if (num1 >= 0) {
                System.out.println("Number is Positive");
            } else {
                System.out.println("Number is Negative");
            }
        }else {
            System.out.println("Please enter Num only");
        }
    }
}
