package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Stream;

public class Array_Reverse_Methods {

    public static void main(String[] args) {
        String s1 = "123456789";
String[] s2 = s1.split("");
        System.out.println("String array: "+Arrays.toString(s2));
      //  char[] arr = s1.toCharArray();
        int[] array = new int[s2.length];
int j=0;
        for (int i = s2.length-1; i >=0; i--) {
            array[j]= Integer.parseInt(s2[i]);
            j++;
        }
        System.out.println(Arrays.toString(array));
        String rev = Stream.of(s1.split("")).reduce("",(a, b)-> b+a);
        System.out.println(rev);



    }
}
