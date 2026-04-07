package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Stream;

public class String_reverse_till_SpecialChar {
    public static void main(String[] args) {
        String s1=  "Sachin@gaba#year";
        String[] chars = s1.split("[^a-zA-Z]");
        String spec = s1.replaceAll("[a-zA-Z]","");
        System.out.println(spec);
        StringBuilder sb = new StringBuilder();
                for (int i = 0; i < chars.length; i++) {
            String rev = Stream.of(chars[i].split("")).reduce("", (a, b) -> b + a);
            sb.append(rev);
            if (i < spec.length()) {
                sb.append(spec.charAt(i));
            }
        }
        System.out.println(sb);





    }
}
