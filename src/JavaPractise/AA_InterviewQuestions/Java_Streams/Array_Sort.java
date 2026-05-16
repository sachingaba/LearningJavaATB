package JavaPractise.AA_InterviewQuestions.Java_Streams;

import java.util.Arrays;

public class Array_Sort {
    public static void main(String[] args) {
        int[] arr = {1,4,56,89,4,567,3,23,87,8,33};

        int[] array = Arrays.stream(arr).sorted().toArray();


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
    }
}
