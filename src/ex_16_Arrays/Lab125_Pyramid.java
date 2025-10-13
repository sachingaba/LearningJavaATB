package ex_16_Arrays;

import java.util.Scanner;

public class Lab125_Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num");
        int n = scanner.nextInt();

        for (int i = 1; i < n ; i++) {
            for (int j = i; j <n ; j++)
            {
                System.out.print("_");
            }
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
