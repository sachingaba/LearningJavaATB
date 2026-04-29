package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class String_ConvertUpperCase_to_Lower {
    public static void main(String[] args) {
        String s1 = "ClaudeLLOOPPPlaudec";
StringBuilder sb = new StringBuilder();
        char[] ch = s1.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(Character.isUpperCase(ch[i])){
             ch[i]=  Character.toLowerCase(ch[i]);
             sb.append(ch[i]);
            }
          else{
                ch[i]=Character.toUpperCase(ch[i]);
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);
        System.out.println(Arrays.toString(ch));
    }
}
