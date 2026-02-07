package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_movetoEND {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,0,3,1,0};

        int p = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=1){
                arr[p]=arr[i];
                p++;
            }

        }

        while(p < arr.length){
            arr[p]=1;
            p++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
