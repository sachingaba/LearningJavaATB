package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class String_Reverse {

    public static void main(String[] args) {
        String s1 = "Java is fun";

        int left = 0;
        int right = s1.split(" ").length-1;
        String[] arr = s1.split(" ");

            while(left<right){
                String temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        System.out.println(Arrays.toString(arr));

            int x = 121;
        String xy = String.valueOf(x);
        StringBuilder sb = new StringBuilder(xy);
        sb = sb.reverse();
        if(xy.contentEquals(sb)){
            System.out.println("true");
        }

    }
}

