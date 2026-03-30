package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class String_Count_Word_in_String_Map {

    public static void main(String[] args) {
        String s1 = "My name is is sam sam and he is rahul";

        String[] arr = s1.split(" ");
        Map<String ,Integer> map = new HashMap<>();
String word = "sam";
        for(String s : arr) {
                map.put(s, map.getOrDefault(s, 0) + 1);
        }
       // for(Map.Entry<String , Integer> entry : map.entrySet()){
        System.out.println(map.get(word));
      //  }
    }
}
