package Exercises;

import java.util.Scanner;

public class Task19_Armstrong_Num {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = readInt(scan, "Enter NUum1");


        if (Armstrong(num)) {
            System.out.println("True Armstrong");
        } else {
            System.out.println("not Armstrong");
        }


    }static int readInt(Scanner scan, String prompt){
        System.out.println(prompt);
        if (!scan.hasNextInt()) {
            System.out.println("Enter Num only");
        }

        return scan.nextInt();
    }


    static boolean Armstrong(int num) {
        int ognum = num;
        int reversedNumber = 0;
        while (num != 0) {
            int r = num % 10;
            reversedNumber = reversedNumber + r*r*r;
            num /= 10;


        }
        System.out.println(reversedNumber);
        return ognum == reversedNumber;

    }

}
