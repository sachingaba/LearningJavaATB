package JavaPractise.AA_InterviewQuestions;

import java.util.*;
import java.util.stream.Stream;

public class String_Duplicate_Chars{
    public static void main(String[] args) {
        String word = "HelloWorld";

       char[] ch = word.toCharArray();

       int i =0;
       while(i<word.length()){

           if((word.indexOf(word.charAt(i)))!= word.lastIndexOf(word.charAt(i))){
               System.out.println("Duplicate: " + word.charAt(i));
           }


           i++;
       }

    }
}
