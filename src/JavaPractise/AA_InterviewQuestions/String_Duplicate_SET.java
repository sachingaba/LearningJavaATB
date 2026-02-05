package JavaPractise.AA_InterviewQuestions;


import java.util.HashSet;
import java.util.Set;

public class String_Duplicate_SET {

    public static void main() {
        String p1 = "programming";

        char[] ch = p1.toCharArray();
        Set<Character> set1 = new HashSet<>();

        for (char c : ch) {
            set1.add(c);

        }

        System.out.println(set1);
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='1'){
                continue;
            }
            int count = 0;
            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) {
                    ch[j]='1';
                    count++;
                }

            }
            if (count == 0) {
                System.out.println("No Duplicate found: " + ch[i]);
            }
        }
    }
}

