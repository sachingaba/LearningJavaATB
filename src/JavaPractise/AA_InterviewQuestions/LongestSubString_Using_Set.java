package JavaPractise.AA_InterviewQuestions;

import java.util.*;

public class LongestSubString_Using_Set {

    public static void main(String[] args) {
        String s1 = "sachingabaishereforyoutoteanchyouJava";
        int maxLength = 0;
        StringBuilder maxSubstring = new StringBuilder();
        char[] ch = s1.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            List<Character> list = new LinkedList<>();
            list.add(ch[i]);

            for (int j = i + 1; j < ch.length; j++) {
                if (list.contains(ch[j])) {
                    break;
                } else {
                    list.add(ch[j]);
                }
            }

            if (list.size() > maxLength) {
                maxLength = list.size();
                maxSubstring = new StringBuilder();
                for (char c : list) {
                    maxSubstring.append(c);
                }
            }
        }

        System.out.println(maxSubstring);
        System.out.println(maxSubstring.length());
    }
}
