package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import java.util.HashSet;
import java.util.Set;

public class String_Find_DuplicateCharacters {
    public static void main(String[] args) {

        String s1 = "Helloo";

        for(char c: s1.toCharArray()){
            if(s1.indexOf(c)!=s1.lastIndexOf(c)){
                System.out.println("duplicate: " + c);

            }
        }

        Set<Character> set = new HashSet<>();
        for(char c: s1.toCharArray()){
            if(set.contains(c)){
                System.out.println("Duplicate: " + c);
            }else{
                set.add(c);
            }
        }
    }
}
