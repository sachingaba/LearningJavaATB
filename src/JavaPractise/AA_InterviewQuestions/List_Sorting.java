package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class List_Sorting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,-4,-2,-1,0};

        List<Integer> list = Arrays.asList(1, 2, 3, 4,-4,-2,-1,0);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)<list.get(j)){
                    int temp = list.get(j);
                    list.set(j,list.get(i));
                    list.set(i,temp);
                }
            }


        }
        System.out.println(list);


    }
}
