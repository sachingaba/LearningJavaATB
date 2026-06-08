package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class String_Count_Numbers {
    public static int numDifferentIntegers(String word) {
        char[] ch = word.toCharArray();
        Set<Character> set = new HashSet<>();
        boolean isBo = false;
        int count = 0;
        for(char c : ch){
            if(Character.isLetter(c)){
                isBo = true;

            }
            if(isBo && Character.isDigit(c) && c!='0'){
                set.add(c);
                isBo = false;
            }
            count = set.size();

        }
        return count;
    }

    public static void main(String[] args) {
        String word = "a1b01c001";
        System.out.println(numDifferentIntegers(word));

        System.out.println(numIntegers("a1b01c001"));
    }
    public static int numIntegers(String word) {
String[] arr = word.split("[a-z]");
        System.out.println((Arrays.toString(arr)));

return arr.length;



    }
}
