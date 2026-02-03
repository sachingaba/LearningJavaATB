package JavaPractise.AA_InterviewQuestions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayList_Duplicate_removal {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        List<Integer> original = List.of(1,2,3,5,1,2,3,4,5);


        Set<Integer> set = new LinkedHashSet<>(original);
        System.out.println(set);
        List<Integer> remove = new ArrayList<>(set);
        System.out.println(remove);
    }
}
