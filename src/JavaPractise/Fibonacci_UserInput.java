package JavaPractise;

import java.util.Scanner;

public class Fibonacci_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = fibsize(scanner,"enter your number");
        int x = 0;
        int y=1;
        int fib = 0;
        System.out.print("Fibonacci series : " + x + " " + y + " ");
        for (int i = 0; i < size; i++) {
            fib = x+y;
            System.out.print(fib + " ");
            x=y;
            y=fib;

        }

    }
    public static int fibsize(Scanner scan, String prompt){
        System.out.println(prompt);

        if(!scan.hasNextInt()){
            System.out.println("enter num only");
            scan.nextInt();

        }
        return scan.nextInt();
    }
}
