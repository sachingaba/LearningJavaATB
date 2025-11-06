package Exercises;

import java.util.Scanner;

public class Task38_While_Loop_Table_of {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i=1;
        int table = readInt(scan,"Enter the number whose table you want to print");
        int x ;

        while(i<=10){
           x =  table*i;
            System.out.println(table + " * " + i + " = " + x);
            i++;
        }
    }static int readInt(Scanner scan, String prompt){
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
