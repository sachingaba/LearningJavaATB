package JavaPractise.AA_InterviewQuestions;

import java.util.stream.Stream;

public class String_Reverse_Using_Stream {
    public static void main(String[] args) {
        String str = "Hello world I am here";

       String rev =  Stream.of(str.split(" ")).reduce("",(a,b)->b+" "+a);
        System.out.println(rev);
    }
}
