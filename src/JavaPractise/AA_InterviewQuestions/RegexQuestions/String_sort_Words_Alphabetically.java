package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import java.util.Arrays;

public class String_sort_Words_Alphabetically {
    public static void main(String[] args) {
        String s1 = "Mango, Apple, Banana";

        String[] arr = s1.split(", ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

            String s2 = "sortcharacters";
            char[] ch = s2.toCharArray();
    Arrays.sort(ch);
            System.out.println(ch);
    }
}
