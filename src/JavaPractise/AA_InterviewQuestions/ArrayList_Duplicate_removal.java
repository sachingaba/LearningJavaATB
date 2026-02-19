package JavaPractise.AA_InterviewQuestions;

import java.util.*;

public class ArrayList_Duplicate_removal {
    public static void main(String[] args) {

        List<Integer> original = List.of(1,2,3,5,1,2,3,4,5);


        Set<Integer> set = new HashSet<>(original);
        System.out.println(set);
        List<Integer> remove = new ArrayList<>(set);
        System.out.println(remove);
    }
}
