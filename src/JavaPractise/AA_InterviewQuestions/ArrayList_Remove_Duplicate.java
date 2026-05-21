package JavaPractise.AA_InterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayList_Remove_Duplicate {
    public static void main(String[] args) {
        List<Integer> arrayList1 = List.of(1,2,45,57,7,9,5,1,2);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);arrayList.add(1);arrayList.add(1);arrayList.add(1);arrayList.add(1);arrayList.add(1);arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);arrayList.add(2);arrayList.add(2);arrayList.add(2);arrayList.add(2);arrayList.add(2);arrayList.add(2);arrayList.add(2);arrayList.add(2);arrayList.add(2);

        Set<Integer> set = new HashSet<>(arrayList);

        System.out.println(new ArrayList<>(set));
        Set<Integer> set1 = new HashSet<>(arrayList1);
        System.out.println(new ArrayList<>(set1));
    }
}
