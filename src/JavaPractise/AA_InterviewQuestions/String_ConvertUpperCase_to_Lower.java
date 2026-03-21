package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class String_ConvertUpperCase_to_Lower {
    public static void main(String[] args) {
        String s1 = "ClaudeLLOOPPPlaudec";

        char[] ch = s1.toCharArray();
StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(Character.isUpperCase(ch[i])){
             ch[i]=  Character.toLowerCase(ch[i]);
            }
          else{
                ch[i]=Character.toUpperCase(ch[i]);
            }
        }

        System.out.println(Arrays.toString(ch));
    }
}
