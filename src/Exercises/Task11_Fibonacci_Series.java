package Exercises;

public class Task11_Fibonacci_Series {

    public static void main(String[] args) {
        int x= 0;
        int y= 1;
        System.out.print(x+ " " + y);
        int fib = 15;
int fibr = 0;
        for (int i = 0; i < fib; i++) {
            fibr = x+y;
            System.out.print(" " + fibr);
            x=y;
            y=fibr;

        }
    }
}
