package JavaPractise.Array;

import java.util.Scanner;

public class Array_UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int i = scan.nextInt();
        int[] arr = new int[i];


        for (int j = 0; j < i; j++) {
            System.out.println("Enter array at position : " + j);

            arr[j] = readArray(scan);

        }
        System.out.println("Array as following");
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j] + "  ");

        }
    }
    static int readArray(Scanner scan){
     //   System.out.println();

        while(!scan.hasNextInt()){
            System.out.println("Enter Num only");
            scan.nextInt();
        }
        return  scan.nextInt();
    }
}
