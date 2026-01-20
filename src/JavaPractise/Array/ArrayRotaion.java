package JavaPractise.Array;

import java.util.Arrays;

public class ArrayRotaion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        arrayRotateR(arr,2);


        System.out.println(Arrays.toString(arr));

        arrayRotateL(arr,2);
        System.out.println(Arrays.toString(arr));

    }


    static void arrayRotateR(int[] arr, int k) {


        int n = arr.length;

        k = k % n;

        reverseRight(arr, 0, n - k - 1);
        reverseRight(arr, n - k, n - 1);
        reverseRight(arr, 0, n - 1);


    }
    static void arrayRotateL(int[] arr, int k) {


        int n = arr.length;

        k = k % n;

        reverseLeft(arr, 0, n - k - 1);
        reverseLeft(arr, n - k, n - 1);
        reverseLeft(arr, 0, n - 1);


    }


    static void reverseRight(int[] arr, int start, int last) {

        while (start < last) {
            int temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;
            start++;
            last--;


        }

    }
    static void reverseLeft(int[] arr, int start, int last) {

        while (start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;


        }

    }


}