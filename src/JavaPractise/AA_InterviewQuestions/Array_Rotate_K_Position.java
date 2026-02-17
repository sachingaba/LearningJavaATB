package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_Rotate_K_Position {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        //full rotate
k = k%arr.length;
        rotateHelper(arr,  arr.length-k, arr.length-1);

        rotateHelper(arr, 0, arr.length-k-1);
        rotateHelper(arr,0,arr.length-1);






        System.out.println(Arrays.toString(arr));


    }

    public static void rotateHelper(int[] arr, int start, int end) {

        while (start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;

        }


    }
}