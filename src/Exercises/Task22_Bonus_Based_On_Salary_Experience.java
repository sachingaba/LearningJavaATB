package Exercises;

import java.util.Scanner;

public class Task22_Bonus_Based_On_Salary_Experience {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float yoe = readInt(scan,"Enter Year of Exp");
        double sal = readInt(scan,"Enter your Salary");

        if(yoe<1){

            System.out.println("No Bonus so your sal. is " + sal );
        }else if (yoe>=1 && yoe<=3){
            sal = (sal+ sal*0.05);
            System.out.println("5% Bonus so your sal. is " + sal);
        }else if (yoe>=4 && yoe<=6) {
            sal =  (sal + sal * 0.10);
            System.out.println("10% Bonus so your sal. is " + sal);
        }else if (yoe>=6){
            sal =  (sal+ sal*0.15);
            System.out.println("15% Bonus so your sal. is " + sal);
}
    }
    static float readInt(Scanner scan , String prompt){
        System.out.println(prompt);
        if(!scan.hasNextFloat()){
            System.out.println("Enter valid Number");

        }
        return scan.nextFloat();
    }
}

