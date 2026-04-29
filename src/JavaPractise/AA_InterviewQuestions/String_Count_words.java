package JavaPractise.AA_InterviewQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class String_Count_words {
    public static void main(String[] args) {
        String s1 = "My name is sachin and here is my version of program";
        Map<String,Integer> map = new LinkedHashMap<>();

        for(String s : s1.toLowerCase().split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println(map);
    }
}
