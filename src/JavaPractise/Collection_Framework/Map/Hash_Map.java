package JavaPractise.Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        Map<Object,Object> m1 = new HashMap();
        // key-Value Pair
        m1.put(1,2);
        m1.put(2,3);
        m1.put(3,4);
        m1.put(4,5);
        m1.put(5,6);
        m1.put(1,5);  // same key .. so it will update to this
        m1.put(null,7); // 1 null is allowed
        m1.put(5, null); // same key .. so it will update to this
        m1.put(6,null);
        m1.put(null,9); // same key .. so it will update to this
        System.out.println(m1);
    }
}
