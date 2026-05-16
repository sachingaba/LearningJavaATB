package JavaPractise.AA_InterviewQuestions.Java_Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Array_Max_Value {
    public static void main(String[] args) {
        int[] arr = {1,4,56,89,4,567,3,23,87,8,33};

        int max = Arrays.stream(arr).max().orElseThrow();
        System.out.println(max);
    }
}
