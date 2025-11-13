package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab038_TO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = age(scan,"Enter your age");

        String AllowedtoDrink =  age>18 ? "Yes" : "No"; // condition and string because result is in string
        System.out.println(AllowedtoDrink);
    }
    static int age(Scanner scan,String prompt){
        System.out.println(prompt);
      // int input = scan.nextInt();
        if (!scan.hasNextInt()){
            System.out.println("Enter No. only");
            System.out.println("Enter again");
         scan.nextInt();
           // System.exit(0);
        }
        return scan.nextInt();

    }
}

