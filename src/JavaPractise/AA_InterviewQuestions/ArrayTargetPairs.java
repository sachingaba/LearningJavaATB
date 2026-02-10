package JavaPractise.AA_InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class ArrayTargetPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 5;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+ arr[j]==5){
                    count++;
                }
            }

        }
        System.out.println("count of pairs: " + count);

        System.out.println("Second way: Hashset ");
        Set<Integer> set = new HashSet<>();
         count=0;

        for(int num:arr){
            if(set.contains(target-num)){
                count++;
            }
            set.add(num);
        }
        System.out.println("count of pairs: " + count);
    }
}
