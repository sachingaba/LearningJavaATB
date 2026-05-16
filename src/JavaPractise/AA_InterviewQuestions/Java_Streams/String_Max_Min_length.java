package JavaPractise.AA_InterviewQuestions.Java_Streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class String_Max_Min_length {
    public static void main(String[] args) {
        String s1 = "Hello, you are a good person";

        String max = Stream.of(s1.split(" ")).max(Comparator.comparingInt(String::length)).toString();

        String min =  Stream.of(s1.split(" ")).min(Comparator.comparingInt(String::length)).toString();

        System.out.println(max);
        System.out.println(min);
    }
}
