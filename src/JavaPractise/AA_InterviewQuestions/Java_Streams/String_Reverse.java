package JavaPractise.AA_InterviewQuestions.Java_Streams;

import java.util.stream.Stream;

public class String_Reverse {
    public static void main(String[] args) {
        String s1 = "My Name is Sachin Gaba";

        String rev = Stream.of(s1.split(" ")).reduce("",(a,b)->b+" "+a);

        System.out.println(rev);
    }
}
