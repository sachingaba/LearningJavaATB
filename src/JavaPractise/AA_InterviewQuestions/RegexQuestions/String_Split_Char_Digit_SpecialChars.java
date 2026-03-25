package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import com.sun.security.jgss.GSSUtil;

public class String_Split_Char_Digit_SpecialChars {
    public static void main(String[] args) {
        String s1 = "WelcometoInfosys@1234";

        String Characters = s1.replaceAll("[^a-zA-Z]","");
        String Digits = s1.replaceAll("[^0-9]","");
        String Spec = s1.replaceAll("[0-9a-zA-Z]","");

        System.out.println("Characters: " + Characters );
        System.out.println("Digits: " + Digits);
        System.out.println("Special Chars: " + Spec);
        System.out.println("===============================Round 2===========================");
        String s2 = "7192Welcome$$$$Infosys";
         Characters = s2.replaceAll("[^a-zA-Z]","");
         Digits = s2.replaceAll("[^0-9]","");
         Spec = s2.replaceAll("[0-9a-zA-Z]","");

        System.out.println("Characters: " + Characters );
        System.out.println("Digits: " + Digits);
        System.out.println("Special Chars: " + Spec);
    }
}
