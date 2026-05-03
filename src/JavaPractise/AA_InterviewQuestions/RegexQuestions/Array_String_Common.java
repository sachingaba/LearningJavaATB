package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import java.util.Arrays;

public class Array_String_Common {
    public static void main(String[] args) {
        String[] array = {"thick","thin","theses"};
StringBuilder sb = new StringBuilder();

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array[0].length());
char[] first = array[0].toCharArray();
char[] last = array[array.length-1].toCharArray();
        for (int i = 0; i < Math.min(first.length,last.length); i++) {
            if(first[i]==last[i]){
                sb.append(first[i]);
            }else{
                break;
            }

        }
        System.out.println(sb);
    }
}
