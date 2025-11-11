package ex_30_Collection_Framework.CF_01_LIST;

import java.util.LinkedList;
import java.util.List;

public class Lab181_LinkedList {
    public static void main(String[] args) {

        List ll = new LinkedList<>();
        ll.add("kk");
        LinkedList ll1 = new LinkedList();
        ll1.add(1);
        ll1.add(3);
// add on first position
        ll1.addFirst(4);

        ll1.addAll(ll);






          List ll2 = List.of("aa","bb","cc");
        //Exception will come here
         // ll2.add("565");



        ll.add("aa");ll.add("ba");ll.add("ca");ll.add("da");ll.add("ea");ll.add("fa");
        ll.add(5,"good");
        ll.remove("ea");
        System.out.println(ll);
        System.out.println(ll1);


        System.out.println(ll2);



    }
}
