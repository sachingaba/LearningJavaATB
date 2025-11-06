package Exercises;

import java.util.Scanner;

public class Task37_Calculate_Sum_First_10_Natural_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = readInt(scan,"Enter your num");
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum = sum + i;
            i++;

        }
        System.out.println(sum);

    }
    static int readInt(Scanner scan, String prompt){
        System.out.println(prompt);
        if(!scan.hasNextInt()){
            System.out.println("Enter valid Number");
            System.exit(0);
        }else if(scan.nextInt()<=0){
            System.out.println("Enter positive num from 1");
        }
        return scan.nextInt();
    }
}
