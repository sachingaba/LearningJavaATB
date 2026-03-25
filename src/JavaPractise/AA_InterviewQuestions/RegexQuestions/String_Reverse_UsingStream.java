package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import java.util.stream.Stream;

public class String_Reverse_UsingStream {
    public static void main(String[] args) {
        String s1 = "Hello to the World";

        String rev
                = Stream.of(s1.split(" ")).reduce("",(a,b)->b+" "+a);
        System.out.println(rev);


        //Count words in a String

        System.out.println(s1.split(" ").length);
    }
}
