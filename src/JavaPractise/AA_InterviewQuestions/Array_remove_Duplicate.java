package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_remove_Duplicate {
    public static void main(String[] args) {


        int num = 12344321;

        String s1 = String.valueOf(num);
        char[] ch = s1.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                continue;
            }
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    ch[j] = ' ';
                }


            }

        }
        System.out.println(Arrays.toString(ch));
    }
}
