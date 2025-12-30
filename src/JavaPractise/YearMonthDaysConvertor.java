package JavaPractise;

import java.util.Scanner;

public class YearMonthDaysConvertor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = readInt(scan, "Enter No. of days");
        int year = 0;

        int day = 0;

        for (int i = 0; i < days/365 ; i++) {
            year++;
        }
        int remainingdays = days - (year*365);

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
int months =0;
        for (int i = 0; i < 12 && remainingdays>0; i++) {
            if(remainingdays>month[i]){
                remainingdays = remainingdays-month[i];
                months++;
            }

        }
        day = remainingdays;
    
            System.out.println(year + " Year " + months + " month " + day + " days ");
        
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
