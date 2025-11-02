package Exercises;

import java.util.Scanner;

public class Task28_Person_Based_On_Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = readInt(scan, "Enter your age: ");

        if (age<=12){
            System.out.println("You are a Child");
        }else if(age >= 13 && age <= 19){
            System.out.println("You are a Teenager");
        }else if(age>=20 && age<64){
            System.out.println("You are an adult");
        }else {
            System.out.println("Senior Citizen");
        }

    }
    static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (!scan.hasNextInt()) {
            System.out.println("Enter valid Number");
            System.exit(0);

        } else if (scan.nextInt() < 1) {
            System.out.println("Enter positive num");

        }
        return scan.nextInt();
    }
}
