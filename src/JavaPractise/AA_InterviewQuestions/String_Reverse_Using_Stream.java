package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class String_Reverse_Using_Stream {
    public static void main(String[] args) {
        String str = "Hello world I am here";

       String rev =  Stream.of(str.split(" ")).reduce("",(a,b)->b+" "+a).trim();
        System.out.println(rev);

        String s3 = "Hello my name  is sachin";
        String shortw = Arrays.stream(s3.split(" +")).min(Comparator.comparingInt(String::length)).orElse("");

        System.out.println(shortw);
    }
}
