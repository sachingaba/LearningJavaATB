package Exercises;

import java.util.Scanner;

public class Task20_Loan_Eligibility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = readInt(scan, "Enter age");

        if ((age >= 18) && (age <= 80)) {
            double salary = readSal(scan, "Enter salary");

            if (salary >= 30000)

            {
                int CS = readInt(scan, "Enter Credit Score");
                if (CS >= 650 && CS <= 850) {
                    System.out.println("Eligible");
                } else if(CS>850){
                    System.out.println(" CS high threshold");
                } else {
                    System.out.println("low CS");
                }
            } else {
                System.out.println("Not Enough Salary");
            }
        } else {
            System.out.println("Age out of limit");

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


static double readSal(Scanner scan, String prompt){
    System.out.println(prompt);
    if(!scan.hasNextDouble()){
        System.out.println("Enter valid Number");

    }
    return scan.nextDouble();

}
}
