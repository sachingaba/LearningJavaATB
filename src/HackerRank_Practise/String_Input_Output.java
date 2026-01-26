package HackerRank_Practise;

import java.util.Scanner;

public class String_Input_Output {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        System.out.println("add:");
        long i = scan.nextLong();
        System.out.println("add:");

        double d = scan.nextDouble();
        System.out.println("add:");
        StringBuilder s1 = new StringBuilder();


        while(scan.hasNext()){


            String sr = scan.next();

            s1.append(sr);

        }


        // Write your code here.
        System.out.println("String: " + s1);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();



    }

}
