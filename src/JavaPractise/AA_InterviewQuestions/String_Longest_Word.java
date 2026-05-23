package JavaPractise.AA_InterviewQuestions;

import java.util.Comparator;
import java.util.stream.Stream;

public class String_Longest_Word {
    public static void main(String[] args) {

        String a1 = "I am good person in india and other countries word good";
        // find the largest word based on char. count

        // reverse only the repeated words

        String[] arr = a1.split(" ");
        int max = 0;
        String longest ="";
        for(int i=0;i<arr.length;i++){
            String s1= arr[i];

            if(s1.length()> max){
                max = s1.length();
                longest = s1;
            }


        }
        System.out.println(longest);
        System.out.println("  --- Next ---");

String long1 = Stream.of(a1.split(" ")).max(Comparator.comparingInt(String::length)).orElse(" ");
        System.out.println(long1);
String min = Stream.of(a1.split(" ")).min(Comparator.comparingInt(String::length)).orElse("");
        System.out.println(min);


    }
}
