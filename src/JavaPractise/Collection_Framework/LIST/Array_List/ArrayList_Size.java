package JavaPractise.Collection_Framework.LIST.Array_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayList_Size {
    public static void main(String[] args) {
        List<Object> arrayList = new ArrayList<>(5);

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List<Integer> vector =new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);

        System.out.println(vector);

        List<Object> linked = new LinkedList<>();
        linked.add(vector);
        linked.add(arrayList);

        System.out.println(linked);
        Object[] array = linked.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Sizes");

        System.out.println(arrayList.size());
        System.out.println(vector.size());
        System.out.println(linked.size());
    }
}
