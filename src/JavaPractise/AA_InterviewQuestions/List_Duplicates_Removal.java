package JavaPractise.AA_InterviewQuestions;

import java.util.*;

public class List_Duplicates_Removal {
    public static void main(String[] args) {

        List<String> list = List.of("name","age","kill","process","ok","ok" ,"fail","name");

        Set<String> set = new HashSet<>(list);

        System.out.println(set);
        System.out.println(Collections.max(set));



//Output: Count of "bb"





    }
}
