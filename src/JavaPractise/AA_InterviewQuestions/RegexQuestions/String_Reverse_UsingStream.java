package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import java.util.stream.Stream;

public class String_Reverse_UsingStream {
    public static void main(String[] args) {
        String s1 = "Hellos to the Worlduuu";

        String rev
                = Stream.of(s1.split(" ")).reduce("",(a,b)->b+" "+a);
        System.out.println(rev);

        String len = Stream.of(s1.split(" ")).reduce("",(a,b)->a.length()>b.length()?a:b);

        System.out.println("length: "+len);


        //Count words in a String

        System.out.println(s1.split(" ").length);
    }
}
