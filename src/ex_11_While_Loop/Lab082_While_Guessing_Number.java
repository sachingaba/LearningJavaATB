package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab082_While_Guessing_Number {
    public static void main(String[] args) {


       //Step 1 : Create random Number
        Random random = new Random();

        int NumbertoGuess = random.nextInt(101);
       System.out.println(NumbertoGuess);

        // Create User's no. which will be matched with random number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int guess;
        int attempts=0;

        //
        while(true){
            // Check if no. is typed by user
            if(!scanner.hasNextInt())
            {
                System.out.println("Invalid Input , Enter again");
                scanner.next();
                continue;

            }
            // guess is assigned the number entered by user
            guess = scanner.nextInt();
            attempts++;
// edge case - check if no. is in range
            if (guess <1 || guess > 100){
                System.out.println("Enter between 1 to 100 only");
                continue;
            }
// if correct no. is entered , then check conditions
            if (guess<NumbertoGuess){
                System.out.println("too low");
            } else if (guess>NumbertoGuess){
                    System.out.println("too high");}
            else {
                System.out.println("Right Num in " + attempts + " attempts ");
                break;
                
            }
        }



    }
}
