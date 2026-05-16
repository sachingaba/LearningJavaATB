package JavaPractise.AA_InterviewQuestions.Java_Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Array_Min_Value {
    public static void main(String[] args) {
        int[] arr = {10,4,56,89,4,567,3,23,87,8,33};

        int min = Arrays.stream(arr).min().orElseThrow();
        System.out.println(min);
    }
}
