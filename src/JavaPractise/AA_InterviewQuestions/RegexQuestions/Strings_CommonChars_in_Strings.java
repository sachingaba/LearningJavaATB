package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import java.util.HashSet;
import java.util.Set;

public class Strings_CommonChars_in_Strings {
    public static void main(String[] args) {
        String s1 = "Thick";
        String s2 = "Thin";
        String s3 = "thin";

        System.out.println(s3.toLowerCase().compareTo(s2.toLowerCase()));

        Set<Character> set = new HashSet<>();
        for(char c : s1.toCharArray()) {
            set.add(c);
        }
        for(char d : s2.toCharArray()){
            if(set.contains(d)){
                System.out.print(d + " ");
            }
        }
    }
}
