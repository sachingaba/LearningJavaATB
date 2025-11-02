package Exercises;

import java.util.Scanner;

public class Task23_Travel_Visa_Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = readInt(scan,"Enter your age");
        System.out.println("Enter your visa status");
        String visa = scan.next();

        if(age>=18){
            if(visa.equalsIgnoreCase("valid")){
                System.out.println("You can travel");
            }else{
                System.out.println("Not valid visa for travel");
            }
        }else{
            System.out.println("age is less than 18 so can't travel");
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
