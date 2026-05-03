package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Stream;

public class String_Reverse_Recursion {
    public static void main(String[] args) {
        String s1  = "Hello";
        System.out.println(reverseStr(s1));

        System.out.println(revStream(s1));
    }
    static String reverseStr(String s1){
        if(s1.length()<=1 || s1 == null){
            return s1;
        }
       // String x = (s1.substring(1)) + s1.charAt(0);
       // System.out.println(x);
return
       reverseStr(s1.substring(1)) + s1.charAt(0);
    }
    static String revStream(String str){
        String rev = Stream.of(str.split("")).reduce("",(a, b)->b+a);
        return rev;
    }
}
