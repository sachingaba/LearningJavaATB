package JavaPractise.AA_InterviewQuestions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Count_Vowels_Using_Map {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Line: ");

        String s1 = scanner.next();

        char[] arr = s1.toLowerCase().toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        List<Character> vowels = List.of('a','e','i','o','u');
        int total =0;
        for(char c:arr){
            if(vowels.contains(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }

        }
        System.out.println(map);

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            total += entry.getValue();

        }
        System.out.println(total);






    }


}
