package JavaPractise.AA_InterviewQuestions;

import java.util.*;

public class Array_To_List {

    public static void main(String[] args) {
        int[] arr = {2,3,5,78,9,6,7,3};

        String[] srr = {"sa0","as","asfa","dfa"};

        List<Integer> list = new ArrayList<>();
        List<String> slist = new ArrayList<>();

       for(int c:arr){
           list.add(c);
       }
        slist.addAll(Arrays.asList(srr));
        System.out.println(list.toString());
        System.out.println(slist);

        Set<Integer> set = new LinkedHashSet<>(list);
       // set.addAll(list);
        System.out.println(set);
    }
}
