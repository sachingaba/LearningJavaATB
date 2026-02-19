package JavaPractise;

import java.util.Scanner;

public class P05_Prime_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  long x = readInt(scan, "Enter Number");
      if(isprime(scan, "enter the number")){
          System.out.println("Prime Number");

      }else {
          System.out.println("Not Prime Number !!");
      }

    }

    static long readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (scan.hasNextInt()) {
            return scan.nextInt();
        } else {
            System.out.println("Enter Num Only");
            System.exit(0);
            return 0;

        }
    }

    static boolean isprime(Scanner scan, String prompt) {
        System.out.println(prompt);
        int x = scan.nextInt();
        if (x == 0 || x == 1)
            //  System.out.println("No prime");
            return false;



        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                System.out.println("No");
                System.out.println("Divisible by : " + i);
                return false;
            }
            }


        return true;
    }
}


