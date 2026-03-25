package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import java.util.Arrays;

public class String_Remove_Duplicates {
    public static void main(String[] args) {
        String s1 = "Programming";

        for (char c : s1.toCharArray()) {
            if (s1.indexOf(c) != s1.lastIndexOf(c)) {
                s1 = s1.replace(c, ' ');
                s1 = s1.replaceAll("[' ]", "");
            }
        }
        System.out.println(s1);

        //For Output : Programin
        String s2 = "Programming";
        char[] ch = s2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==' '){
                continue;
            }
            for (int j = i + 1; j < ch.length; j++) {


                if (ch[i] == ch[j]) {
                    ch[j] = ' ';
                    // s2 = s2.replaceAll("[' ]","");
                }

            }
            sb.append(ch[i]);


        }
        System.out.println(Arrays.toString(ch));
        System.out.println(sb);
    }

}