package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array_Sort_Asc_Order {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,32,6,1,3,2};
        int[] xr = {2,4,6,8,9,32,6,1,3,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
