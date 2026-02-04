package JavaPractise.AA_InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class Array_Duplicate_Hashset {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2};

        Set<Integer> sh =new HashSet<>();
        for(int i=0;i<arr.length;i++){

            if(sh.contains(arr[i])){
                System.out.println("Duplicate:" + arr[i]);

            }else{
                sh.add(arr[i]);
            }
        }

    }
}
