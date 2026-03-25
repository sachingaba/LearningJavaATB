package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class String_LongestSubstring {

    public static void main(String[] args) {
        String s1 = "mynameissachingaba";
StringBuilder sb = null;
        int len = 0;

        for (int i = 0; i <s1.length() ; i++) {
            Set<Character> set = new LinkedHashSet<>();
            for (int j = i; j < s1.length(); j++) {
                if (set.contains(s1.charAt(j))) {
                    break;
                } else {
                    set.add(s1.charAt(j));
                }
            }

            if (set.size() > len) {
                len = set.size();
                sb = new StringBuilder();
                sb.append(set);
            }
        }

        System.out.println(sb);
    }
}
