package JavaPractise.AA_InterviewQuestions.RegexQuestions;

public class String_Remove_UpperCase {
    public static void main(String[] args) {

            String s1 = "WelcometoAccentureIntterview";

            s1 = s1.replaceAll("[A-Z]","");
            System.out.println(s1);
        }
    }

