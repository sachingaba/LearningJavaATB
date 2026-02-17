package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharinStringRemove {

    public static void main(String[] args) {

        String s1 = "ioioiooioisahcinfejkfjejkjkjfferie";

        char[] ch = s1.toCharArray();
        System.out.println("Way 1:");
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);

        }
        System.out.println(set);

        System.out.println("Way 2: ");
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='-'){
                continue;
            }
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]){
   ch[j]='-';
                }

            }
            sb.append(ch[i]);


        }
        System.out.println(sb);






    }
}
