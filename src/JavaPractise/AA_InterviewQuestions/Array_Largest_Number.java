package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_Largest_Number {
    public static void main(String[] args) {
        int[] arr = {1,2,3,55,6,8,9,8,7,6,5,75,3,2,1};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max =arr[i];

            }

        }
        System.out.println(max);

    }
}
