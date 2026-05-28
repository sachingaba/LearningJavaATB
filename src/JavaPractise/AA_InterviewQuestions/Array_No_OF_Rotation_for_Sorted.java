package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_No_OF_Rotation_for_Sorted {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(isSorted(arr));

        }
    static int isSorted(int[] arr){
int min = arr[0];
        for(int x = 0 ; x+1<arr.length;x++){
            int index = 0;

            if((arr[x]) < min){
                int temp = min;
                min = arr[x];
                arr[x] = temp;
                index = x;
                return index;
            }

        }

        return 0;
    }
    static void rotator(int[] arr , int start , int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}
