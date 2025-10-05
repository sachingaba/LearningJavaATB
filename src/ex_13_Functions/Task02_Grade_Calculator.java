package ex_13_Functions;

import java.util.Scanner;

/*Write a program that calculates and displays the letter grade for a given numerical score
 (e.g., A, B, C, D, or F) based on the following grading scale:

A: 90-100

B: 80-89

C: 70-79

D: 60-69

F: 0-59*/
public class Task02_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter Integer only");
        } else {
            int Num = scanner.nextInt();



            if (Num > 100) {
                System.out.println("Please enter b/w 1 to 100");
            } else if (Num >= 90 && Num <= 100) {
                System.out.println("Your score is " + Num + " ->Grade A ");
            } else if (Num >= 80 && Num <= 89) {
                System.out.println("Your score is " + Num + " ->Grade B");

            } else if (Num >= 70 && Num <= 79) {
                System.out.println("Your score is " + Num + " ->Grade C");
            } else if (Num >= 60 && Num <= 69) {
                System.out.println("Your score is " + Num + " ->Grade D");
            } else {
                System.out.println("Your score is " + Num + " ->Grade F");
            }
        }
    }

}