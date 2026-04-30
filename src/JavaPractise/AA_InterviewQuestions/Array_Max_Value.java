package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_Max_Value {
    public static void main(String[] args) {

        int[] arr = {2,45,7,78,345,323,68,9,343,2};
        int n = 3;
        int max= arr[0];
        for (int j : arr) {

            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);

        Arrays.sort(arr);
        int nthMax = arr[arr.length-n];
        System.out.println(nthMax);
    }
}
