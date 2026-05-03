package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import java.util.HashSet;
import java.util.Set;

public class Strings_CommonChars_in_Strings {
    public static void main(String[] args) {
        String s1 = "Thick".toLowerCase();
        String s2 = "Thin".toLowerCase();
        String s3 = "thin".toLowerCase();


int i = 0;
        String common ="";
while(i<s2.length() && s1.charAt(i)==s2.charAt(i) && s1.charAt(i)==s3.charAt(i)){
    i++;
    common = s2.substring(0,i);
}
        System.out.println(common);

        }
    }
