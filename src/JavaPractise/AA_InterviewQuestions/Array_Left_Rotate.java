package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_Left_Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int k = 2;


        rotator(arr,k);

        System.out.println(Arrays.toString(arr));

    }
    public static void reverseHelper(int[] arr, int start ,int end){

        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void rotator(int[] arr, int k){
        int n= arr.length;
        k=k%n;

        reverseHelper(arr,0,n-k-1);
        reverseHelper(arr,n-k,n-1);
        reverseHelper(arr,0,n-1);

    }
}
