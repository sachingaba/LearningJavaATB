package ex_09_Switch;

import java.util.Scanner;

public class Lab055_Without_break {
    public static void main(String[] args) {
        System.out.println("Enter any no b/w 1 and 7");
        Scanner addNo = new Scanner(System.in);


        if(addNo.hasNextInt()) {
            int day = addNo.nextInt();
            switch (day){
                case 1 :
                    System.out.println("Mon");

                case 2 :
                    System.out.println("Tue");

                case 3 :
                    System.out.println("Wed");

                case 4 :
                    System.out.println("Thu");

                case 5 :
                    System.out.println("Fri");

                case 6 :
                    System.out.println("Sat");

                case 7 :
                    System.out.println("Sun");

                default:
                    System.out.println("Enter between 1 and 7 , you fool!");


            }
        }else {
            System.out.println("enter no. You fool");
        }
    }
    }

