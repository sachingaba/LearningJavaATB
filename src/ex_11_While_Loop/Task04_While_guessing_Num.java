package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Task04_While_guessing_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int count = 0;
        int num = random.nextInt(101);
        System.out.println("num " + num);

        while(true) {
            if(!scan.hasNextInt())
            {
                System.out.println("Invalid Input , Enter again");
                scan.next();
                continue;

            }
            int guess = scan.nextInt();
            count++;
// edge case - check if no. is in range
            if (guess <0 || guess > 100){
                System.out.println("Enter between 1 to 100 only");
                continue;
            }

            if (num > guess) {
                System.out.println("your is low");

            } else if (num < guess){
                System.out.println(" you are too high");

            } else
             {
                System.out.println("Perfect in " + count + " attempts");

            }
        }

    }
}
