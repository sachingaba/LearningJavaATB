package JavaPractise.AA_InterviewQuestions.RegexQuestions;

public class String_Remove_LowerCase {
    public static void main(String[] args) {
        String s1 = "WelcometoAccentureIntterview";

        s1 = s1.replaceAll("[a-z]","");
        System.out.println(s1);
    }
}
