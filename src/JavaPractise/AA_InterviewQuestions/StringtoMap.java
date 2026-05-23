package JavaPractise.AA_InterviewQuestions;

import java.nio.file.LinkPermission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringtoMap {
    public static void main(String[] args) {

        String Inputs = "aaabcdedddcbdbe";
        String Output = "abcde";

        char[] Input = Inputs.toCharArray();

        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < Input.length; i++) {
set.add(Input[i]);
            map.put(Input[i], map.getOrDefault(Input[i], 0) + 1);
        }
        System.out.println(map);
        System.out.println(set);
    }
}
