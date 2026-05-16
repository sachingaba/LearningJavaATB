package JavaPractise.AA_InterviewQuestions.Java_Streams;

import java.util.stream.Stream;

public class String_Max_Length {
    public static void main(String[] args) {
        String s1 = "My name is sachin gabaaaaaaji";

        String max = Stream.of(s1.split(" ")).reduce("",(a,b)->a.length()>b.length()?a:b);

        System.out.println(max);
    }
}
