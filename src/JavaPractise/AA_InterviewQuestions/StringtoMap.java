package JavaPractise.AA_InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class StringtoMap {
    public static void main(String[] args) {

        String Inputs = "aaabcdedddcbdbe";
        String Output = "abcde";

        char[] Input = Inputs.toCharArray();

        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < Input.length; i++) {

            map.put(Input[i], map.getOrDefault(Input[i], 0) + 1);
        }
        System.out.println(map);
    }
}
