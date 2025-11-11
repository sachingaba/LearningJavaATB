package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class lab175_List_Creation {

    public static void main(String[] args) {
        // initial capacity of 10
        List l1 = new ArrayList<>();

        // capacity of 5 but on adding value till 5  it Will auto inc. the capacity to 10
        List l2 = new ArrayList<>(5);

        l1.add(1);
        l1.add(1);l1.add(1);l1.add(2);l1.add(2);l1.add(11);

        // add element at index of
        l2.add(0,"six");

        System.out.println(l1.size());
        System.out.println(l1.get(3));


        System.out.println(l2.size());
        System.out.println(l2.get(0));
        System.out.println(l1.lastIndexOf(1));








    }
}
