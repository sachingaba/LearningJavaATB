package ex_30_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab185_SET_HS_LHS_TS {
    public static void main(String[] args) {

        System.out.println("-------------------------Hashset----------------------");
        Set<String> hs = new HashSet<>();
        // Hashing mechanish to store elements, no order
        //no duplicates

        hs.add("Apple");
        hs.add("Banana");
        hs.add("Watermelon");
        hs.add("Watermelon");
       // hs.add(123);  // only string allowed as mentioned while creating
        hs.add(null);
        hs.add(null);  // 1 null is allowed
        System.out.println(hs);

        System.out.println("-------------------------Linked Hashset----------------------");
        Set lhs = new LinkedHashSet<>();
        // Hashing mechanish to store elements,
        //no duplicates
        // Order will be maintained

        lhs.add("Opple");
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        // hs.add(123);  // only string allowed as mentioned while creating
        lhs.add(4);
        lhs.add(null);// 1 null is allowed
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("-------------------------Tree Set----------------------");
        Set ths = new TreeSet();
        // Black and red mechanism to store elements,
        //no duplicates
        // Order will be maintained , Natural sorting is done

        ths.add("Opple");
        ths.add("Apple");
        ths.add("Banana");
       ths.add("Watermelon");
        ths.add("Watermelon");
        ths.add("sad");
        // ths.add(123);  // only string allowed as mentioned while creating
       // ths.add(null);  // 1 null is not allowed
        System.out.println(ths);
        System.out.println(ths.isEmpty());
        System.out.println(ths.contains("apple"));
        System.out.println(ths.contains("Apple"));
        System.out.println(ths.size());





    }
}
