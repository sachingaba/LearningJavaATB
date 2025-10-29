package JavaPractise;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number");
        if (!scan.hasNextInt()) {
            System.out.print("Enter Number Only");
        } else {
            int x = scan.nextInt();


        long fact = 1;

        for(int i=x;i>0;i--){
            fact = fact*i;
        }
        System.out.print(fact);
    }
}
}