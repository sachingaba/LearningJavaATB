package ex_30_Collection_Framework.CF_02_SET;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab186_Tree_Set {
    public static void main(String[] args) {
        Set<Integer> it = new TreeSet<>();
        it.add(1);
        it.add(66);
        it.add(45);
        it.add(2);

        System.out.println(it);

        Iterator iterator = it.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
