package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import java.util.stream.Stream;

public class String_Reverse_Without_Loop_Methods {

    public static void main(String[] args) {
        String s1 = "javakarlo";
        String rev = "";
while(!s1.isEmpty()) {
    rev= s1.charAt(0)+rev;
     s1 = s1.substring(1);

}
        System.out.println(rev);
    }
}
