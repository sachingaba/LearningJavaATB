package JavaPractise.Collection_Framework.LIST.Vector;

import java.util.Vector;

public class Vector_List {
    public static void main(String[] args) {
        Vector<Object> vectorlist = new Vector<>();

        for (int i = 0; i < 20; i++) {
            vectorlist.add(i);

        }
        System.out.println(vectorlist.capacity());
        System.out.println(vectorlist.size());
        System.out.println(vectorlist);

        Vector<Object> vectorlist1 = new Vector<>();
        System.out.println(vectorlist1.capacity());
        System.out.println(vectorlist1.size());
        System.out.println(vectorlist.contains(2));
        System.out.println(vectorlist.get(15));
        System.out.println(vectorlist.getLast());
    }
}
