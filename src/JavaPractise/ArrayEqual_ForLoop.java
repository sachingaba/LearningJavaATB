package JavaPractise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqual_ForLoop {
    public static void main(String[] args) {


        int[] arr = arrRead(new Scanner(System.in),"Enter your array 1");
        int[] arr1 = arrRead(new Scanner(System.in),"Enter your array 2");
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if (arr.length == arr1.length) {
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] != arr1[i])) {
                    System.out.println("not equal");
                    System.exit(0);
                }
            }
            System.out.println("Equal array");

        }else{
            System.out.println("Length not Equal");
        }
        System.out.println(Arrays.equals(arr,arr1));
    }
    static int[] arrRead(Scanner scanner, String prompt){
        System.out.println(prompt);
        System.out.println("enter the length of array");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("enter value at position: " + i);
            arr[i] = scanner.nextInt();

        }
        return arr;
    }
}