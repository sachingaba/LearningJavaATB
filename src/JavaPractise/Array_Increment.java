package JavaPractise;

import java.util.Scanner;

public class Array_Increment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = arraySize(scan, "Enter Size");

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]  = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                arr[i] = 0;
                if (i - 1 >= 0) {  // Make sure 'i-1' is within array bounds
                    arr[i - 1] = arr[i - 1] + 1;
                }
            }

        }
        System.out.println("Updated array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int arraySize(Scanner scan , String prompt){
        System.out.println(prompt);

      return scan.nextInt();

        }

    }