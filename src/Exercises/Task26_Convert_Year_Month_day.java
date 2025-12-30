package Exercises;

import java.util.Scanner;

public class Task26_Convert_Year_Month_day {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = readInt(scan, "Enter No. of days");
        int year = 0;
        int month = 0;
        int day = 0;
        if (days<30) {
            day = days;
            System.out.println(year + " Year " + month + " month "+ day + " days ");
        }
        else if (days<365 && days>335){
            month = 11;
            day = days-335;
            System.out.println(year + " Year " + month + " month "+ day + " days ");
        }else if (days>365)
        {
            year = days/365;
            if ((days%365)>30) {
                month = (days % 365) / 30;
                day = (days % 365) % 30;
            }else{
                month = 0;
                day = (days % 365);
            }

            System.out.println(year + " Year " + month + " month " + day + " days ");
        }
    }static int readInt(Scanner scan, String prompt){
        System.out.println(prompt);
        if(!scan.hasNextInt()){
            System.out.println("Enter valid Number");

        }else if(scan.nextInt()<1){
            System.out.println("Enter positive num");

        }
        return scan.nextInt();
}
}