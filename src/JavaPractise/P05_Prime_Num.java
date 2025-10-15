package JavaPractise;

import java.util.Scanner;

public class P05_Prime_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = readInt(scan, "Enter Number");

        if (x == 0 || x == 1) {
            System.out.println("No prime");
        }
        if (x==3){
            System.out.println("prime No.");
        }

        for (int i = 2; i <= x / 2; ++i) {
            System.out.println( x / 2);
            if (x % i == 0) {
                System.out.println("No");
                break;
            } else {
                System.out.println("prime");
                break;
            }

        }
    }

    static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (scan.hasNextInt()) {
            return scan.nextInt();
        } else {
            System.out.println("Enter Num Only");
            System.exit(0);
            return 0;

        }
    }
}

