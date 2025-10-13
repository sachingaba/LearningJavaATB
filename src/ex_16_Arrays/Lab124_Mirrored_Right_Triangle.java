package ex_16_Arrays;

import java.util.Scanner;
// Left triangle pattern
public class Lab124_Mirrored_Right_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num");
        int n = scanner.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int j = i; j <n-1 ; j++)
            {
                System.out.print("_");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
