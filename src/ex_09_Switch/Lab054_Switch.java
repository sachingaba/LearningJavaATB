package ex_09_Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab054_Switch {
    public static void main(String[] args) {

        System.out.println("Enter any no b/w 1 and 7");
        Scanner addNo = new Scanner(System.in);


        if(addNo.hasNextInt()) {
            int day = addNo.nextInt();
            switch (day){
                case 1 :
                    System.out.println("Mon");
                    break; // it will take you out of the loop
                case 2 :
                    System.out.println("Tue");
                    break;
                case 3 :
                    System.out.println("Wed");
                    break;
                case 4 :
                    System.out.println("Thu");
                    break;
                case 5 :
                    System.out.println("Fri");
                    break;
                case 6 :
                    System.out.println("Sat");
                    break;
                case 7 :
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter between 1 and 7 , you fool!");
                    break;

            }
        }else {
            System.out.println("enter no. You fool");
        }
    }
}
