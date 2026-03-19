package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array_Sort_Using_Stream {

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,32,6,1,3,2};

        int[] rev = IntStream.of(arr).sorted().toArray();

        System.out.println(Arrays.toString(rev));
    }
}
