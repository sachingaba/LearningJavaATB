package ex_16_Arrays;

import java.util.Arrays;

public class Lab118_Array_Reverse {
    public static void main(String[] args) {
        int[] arr = {12,13,14,15,16};
int[] newArr = new int[arr.length];
int j=0;

//Printing array in reverse
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(" arr at " + i + "-> " + arr[i]);

//Storing reverse of an array
            newArr[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
