package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab190_Map_P1 {
    public static void main(String[] args) {
        System.out.println("-------------------------Hash Map------------------------------");
// no order
        Map m1 = new HashMap();

         m1.put("name", "Sachin");
        m1.put("Roll", 4534);
       // m1.put(true, "Sachin");
        m1.put("Ph. no.", "8699181153");

        System.out.println(m1);

        System.out.println("-------------------------Linked Hash Map---------------------");
        //Order maintained
        Map m2 = new LinkedHashMap();

        m2.put("name", "Sachin");
        m2.put("Roll", 4534);
       // m2.put(true, "Sachin");
        m2.put("Ph. no.", "8699181153");

        System.out.println(m2);

        System.out.println("-------------------------Tree Map---------------------");
        // naturally sorted order
        Map m3 = new TreeMap();

        m3.put("name", "Sachin");
        m3.put("Roll", 4534);
       // m3.put(true, "Sachin");
        m3.put("Ph. no.", "8699181153");

        System.out.println(m3);





    }
}
