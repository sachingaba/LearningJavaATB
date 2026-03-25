package JavaPractise.AA_InterviewQuestions.RegexQuestions;

public class String_Remove_WhiteSpace {

    public static void main(String[] args) {
        String s1 = "J a v a";

        s1 = s1.replaceAll("[' ]","");
        System.out.println(s1);
    }
}
