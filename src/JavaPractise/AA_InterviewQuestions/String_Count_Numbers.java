package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class String_Count_Numbers {


    public static void main(String[] args) {
        String word = "a123bc34d8ef34";


        System.out.println(numIntegers("a123bc34d8ef34"));
    }
    public static int numIntegers(String word) {
        String[] arr= word.split("\\D");
        System.out.println((Arrays.toString(arr)));

        Set<String> s = new HashSet<>();
        for(String str:arr){
            str=str.trim();
            if(!str.equals("")){
                str = str.replaceAll("^0*","");
                s.add(str);
            }
        }
        return s.size();



    }
}
