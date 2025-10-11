package Exercises;

import java.util.Scanner;

public class Task05_Max_In_2_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = maxin(scan,"Enter Num1");
        int num2 = maxin(scan,"Enter Num2");

        if(num1>num2){
            System.out.println("Num 7" + num1 + " is bigger");
        }else{
            System.out.println("Num 8" + num2 + " is bigger");
        }

    }
    static int  maxin(Scanner scan , String prompt){
        System.out.println(prompt);
        if(scan.hasNextInt()){
            return scan.nextInt();
        }else{
            System.out.println("Enter No. only");
            System.exit(0);
            return 0;

        }



    }
}
