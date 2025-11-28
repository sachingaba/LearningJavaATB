package JavaPractise.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2d_Iterate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size at i: ");
        int i = sc.nextInt();
        System.out.println("Enter Array size at j: ");
        int j = sc.nextInt();

        int[][] arr = new int[i][j];

        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.println("Enter array at position: "+k+l);
                arr[k][l] = sc.nextInt();

            }

        }
        System.out.println("Thankyou  and here is your array: ");

        for (int k = 0; k < i; k++) {
            for (int l = 0; l <j ; l++) {
                System.out.print(arr[k][l]+ " ");

            }
            System.out.println(" ");
        }
        int max = arr[0][0];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                if(arr[k][l]>max){
                    max = arr[k][l];

                }

            }


        }System.out.println("Max of all : " + max);
    }
}
