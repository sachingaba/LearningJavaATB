package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Lab193_HashTable {
    public static void main(String[] args) {
        Map<String,Object> m1 = new Hashtable();

        m1.put("Id", 1);
        m1.put("id", 4534);
        // m1.put(true, "Sachin");
        m1.put("ID", "8699181153");
        m1.put("Id",5);
   //Null key and null values are not allowed and thread safe --
    //    m1.put(null,556);
    //    m1.put("Id",null);

        System.out.println(m1.get("id"));

    }
}
