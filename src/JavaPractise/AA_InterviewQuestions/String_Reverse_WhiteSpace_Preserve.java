package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class String_Reverse_WhiteSpace_Preserve {
    public static void main(String[] args) {
        String s1 = "I am a Good Student";
        System.out.println(s1.length());
String s2 = "";
        String[] arr = s1.split(" ");

        for (int i = arr.length-1; i >=0; i--) {
           s2 = s2.concat(arr[i]+" ");

        }
        System.out.println(s2);
    }

}
