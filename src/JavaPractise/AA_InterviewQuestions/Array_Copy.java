package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_Copy {
    public static void main(String[] args) {


        int[] arr = {1,3,458,67,90,0,4};

        int[] narr = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        System.arraycopy(arr,1,narr,0,arr.length-1);
        System.out.println(Arrays.toString(narr));
    }
}
