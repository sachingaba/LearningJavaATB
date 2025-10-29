package Exercises;

import java.util.Scanner;

public class Task13_Find_the_Largest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x= readInt(scan,"Enter Num 1");
        int x2= readInt(scan,"Enter Num 2");
        int x3= readInt(scan,"Enter Num 3");
// 25 40 30
        if(x>x2 && x>x3){
            System.out.println(x + " is greater");
        }else if (x3>x2 && x3>x){
            System.out.println(x3 + " is greater");
        }else
            System.out.println(x2 + " Is greater");
        }

    static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (!scan.hasNextInt()) {
            System.out.println("Enter Num Only");
        }
            return scan.nextInt();

    }
    }

