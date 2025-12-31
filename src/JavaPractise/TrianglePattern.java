package JavaPractise;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of triangle: ");
        int pyr = sc.nextInt();

        for (int i = 0; i < pyr; i++) {

            for (int j = i; j <pyr ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");


        }


    }
}
