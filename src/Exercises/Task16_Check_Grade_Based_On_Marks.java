package Exercises;

import java.util.Scanner;

public class Task16_Check_Grade_Based_On_Marks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int marks = readInt(scan,"Enter Marks");
        if (!(marks>=0 && marks<=100)){

            System.out.println("Enter valid no. between 1 to 100");
        }else {


            if(marks>90){
                System.out.println("A+ Grade");
            }else if(marks>=80 && marks<90){
                System.out.println("A Grade");
            }else if(marks>=70 && marks<80){
                System.out.println("B Grade");
            }else if(marks>=60 && marks<70){
                System.out.println("C Grade");
            }else if(marks>=50 && marks<60){
                System.out.println("D Grade");
            }else if(marks>=40 && marks<50){
                System.out.println("E Grade");
            }else {//if(marks<40)
                System.out.println("Fail");
            }



        }


    }
    static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (!scan.hasNextInt()) {
            System.out.println("Enter Num Only");
        }
        return scan.nextInt();
    }
}
