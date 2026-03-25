package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_longest_Element {

    public static void main(String[] args) {
        String s1 = "My name is sachin gaba and I am a developer";
        String[] arr = s1.split(" ");
        String res = Arrays.stream(arr).reduce("",(a, b)->a.length()>b.length()?a:b);
        System.out.println(res);


        int maxLen = Arrays.stream(arr)
                .reduce(0,
                        (acc, name) -> Math.max(acc, name.length()),
                        Integer::max);

        int maxLen1 = Arrays.stream(arr).reduce(0,(a,b)->Math.max(a,b.length()),Integer::max);

        int maplen = Arrays.stream(arr).mapToInt(String::length).max().orElse(0);


        System.out.println(maplen);
    }
}
