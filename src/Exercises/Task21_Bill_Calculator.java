package Exercises;

import java.util.Scanner;

public class Task21_Bill_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int units = readInt(scan,"enter units");
        double bill = 0.0d;

        if (units<100){
            bill = bill + units*0.5;
            System.out.println("your bill " + units +" units " + bill);
        }else if (bill>100 && bill <=200){
            bill = (units-100)*0.75 + 50;
            System.out.println("your bill " + units +" units " + bill);
        }else if (units>200 && units <=300){
            bill = (units-200)*1.25 + 125;
            System.out.println("your bill " + units +" units " + bill);
        }else if (units>300) {
            bill = (units - 300) * 1.50 + 250;
            System.out.println("your bill " + units +" units " + bill);
        }else{
            System.out.println("enter valid");
        }


    }
    static int readInt(Scanner scan, String prompt){
        System.out.println(prompt);
        if(!scan.hasNextInt()){
            System.out.println("Enter valid Number");

        }else if(scan.nextInt()<1){
            System.out.println("Enter positive num");

        }
        return scan.nextInt();

    }
}
