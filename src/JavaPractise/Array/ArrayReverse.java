package JavaPractise.Array;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size : ");
        while(!scan.hasNextInt()){
            System.out.println("Enter Num only");
            scan.nextInt();
        }
        int i = scan.nextInt();
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            System.out.println("Please Enter Array at position : " + j);
            arr[j]=readArray(scan);
        }
        System.out.println("Here is your array : ");
        for (int j = 0; j < i; j++) {

            System.out.print(" " + arr[j]);

        }
        System.out.println("");
        System.out.println("Here is the reverseRight : ");
        for (int j = i-1; j >=0 ; j--) {
            System.out.print(arr[j] + " ");

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
