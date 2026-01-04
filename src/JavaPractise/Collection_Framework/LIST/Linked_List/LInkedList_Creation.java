package JavaPractise.Collection_Framework.LIST.Linked_List;

import java.util.LinkedList;

public class LInkedList_Creation {
    public static void main(String[] args) {
        LinkedList<Object> l1 = new LinkedList<>();
        l1.add("First");
        l1.add("A"); l1.add("A"); l1.add("A"); l1.add("A"); l1.add("A"); l1.add("Last");

        System.out.println(l1.getFirst());
        System.out.println(l1.get(4));
        System.out.println(l1);
        System.out.println(l1.getLast());

        l1.remove(4);
        System.out.println(l1.size());
        System.out.println(l1);



    }
}
