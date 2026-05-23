package JavaPractise.AA_InterviewQuestions;

import java.util.*;

public class Array_Duplicate_Hashset {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3};

        Set<Integer> sh =new HashSet<>();
        for (int j : arr) {


                sh.add(j);
            }

        System.out.println(Arrays.toString(sh.toArray()));
        System.out.println(sh);
        System.out.println(sh.toString());

    }
}
