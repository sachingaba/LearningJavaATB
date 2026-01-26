package HackerRank_Practise;

import java.util.Scanner;

public class Hackerrank_JavaLoopsII {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        double q = scanner.nextDouble();
        for (int i = 0; i < q; i++) {


            int a = scanner.nextInt();
            double b = scanner.nextDouble();
            int n = scanner.nextInt();


            mathSeries(q, a, b, n);
        }
    }


    static void mathSeries(double q, int a, double b, int n) {
        for (int i = 0; i < n; i++) {
            int term = 0;
            for (int j = 0; j <= i; j++) {

                term = term + (int) Math.round(Math.pow(2, j) * b);

            }
            System.out.print(term + a + " ");




        }
    }
}

