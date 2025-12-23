package JavaPractise.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_userInput_Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int i = scan.nextInt();
        int[] arr = new int[i];


        for (int j = 0; j < i; j++) {
            System.out.println("Enter arr value at position: "+ j);
            arr[j] = scan.nextInt();

        }
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j] + " ,");
        }
        System.out.println("\nReverse here :  ");
        for (int j = i-1; j >=0; j--) {
            System.out.print(arr[j]
            + " " );
        }
        System.out.println("\nAfter Sorting : ");
        Arrays.sort(arr);
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j] + " ");

        }

        int[] arr1 = {33,4354,23,2,5,57,78,43,0};
int free ;
        for (int j = 0; j <= arr1.length-1; j++) {
            for (int k = 0; k < arr1.length-1 ; k++) {
                if(arr1[k]>arr1[k+1]){
                    free = arr1[k];
                    arr1[k] = arr1[k+1];
                    arr1[k+1] = free;
                }
            }


        }
        System.out.println("\n   for loop try");
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + " ");
        }

    }
    }
