package JavaPractise.Collection_Framework.LIST.Linked_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_VS_LinkedList {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Fill both with 100 elements (0 to 99)
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Insert 50 at index 50 (middle)
        arrayList.add(5, 5);  // O(n): shifts 50 elements right
        System.out.println(arrayList);
        linkedList.add(5, 5); // O(n) to reach index, but O(1) link change
        System.out.println(linkedList);

        // Delete index 25
        arrayList.remove(2);   // O(n): shifts remaining left
        System.out.println(arrayList);
        linkedList.remove(2);  // O(n) to reach, O(1) unlink
        System.out.println(linkedList);
        System.out.println("ArrayList size: " + arrayList.size()); // 100
        System.out.println("LinkedList size: " + linkedList.size()); // 100
    }
}
