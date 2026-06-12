package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class String_Num_to_Text {
    public static void main(String[] args) {


        int input = 58697;
        int len = String.valueOf(input).length();


        char[] ch = String.valueOf(input).toCharArray();
        System.out.println(Arrays.toString(ch));
        for (int i = 0; i < ch.length; i++) {
            int pow = (int) (Math.pow(10, len - 1));
            int value = Integer.parseInt(String.valueOf(ch[i])) * pow;

            System.out.print(value + " ");
            len--;

        }
    }
}
