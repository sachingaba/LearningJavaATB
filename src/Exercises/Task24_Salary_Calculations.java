package Exercises;

import java.util.Scanner;

public class Task24_Salary_Calculations {
    public static void main(String[] args) {
        //Basic Pay, HRA, DA, Tax Deductions
        Scanner scan = new Scanner(System.in);
        double basicSalary = readInt(scan, "Enter Basic Salary");
        double hrA = basicSalary * 0.20;
        double dA = basicSalary * 0.1;
        double tax = 0;

        if(basicSalary>500000 && basicSalary<1000000){
            tax = tax + basicSalary*0.05;
        }else if(basicSalary>1000000 && basicSalary<1500000) {
            tax = tax + basicSalary * 0.10;
        }else if(basicSalary>1500000 && basicSalary<=2000000) {
            tax = tax + basicSalary * 0.20;
        }else if(basicSalary>2000000) {
            tax = tax + basicSalary * 0.30;
        }
        double sal = basicSalary + hrA + dA + tax;
        System.out.println(sal);



    }
    static double readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (!scan.hasNextInt()) {
            System.out.println("Enter valid Number");

        } else if (scan.nextInt() < 1) {
            System.out.println("Enter positive num");

        }
        return scan.nextInt();
    }
}
