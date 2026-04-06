package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import java.util.Arrays;
import java.util.stream.Stream;

public class Array_ReverseString {
    public static void main(String[] args) {
        String[] arr = {"Sachin","Gaba"};

        //Output = [nihcaS, abaG]

        for (int i = 0; i < arr.length; i++) {
            arr[i] =
            Stream.of(arr[i].split("")).reduce("",(a,b)->b+a);
        }
        System.out.println(Arrays.toString(arr));

        //2nd Way
        String[] array = {"hello", "World"};
        for (int i = 0; i < array.length; i++) {
           array[i]= reverse(array[i]);
        }
        System.out.println(Arrays
                .toString(array));
    }

    static String reverse(String str){
        StringBuilder strBuilder = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            strBuilder.append(str.charAt(i));
        }
    //    System.out.println(strBuilder);
     return    str = strBuilder.toString();
    }
}
