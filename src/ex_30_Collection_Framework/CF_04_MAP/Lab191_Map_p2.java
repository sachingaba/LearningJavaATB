package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab191_Map_p2 {
    public static void main(String[] args) {

        System.out.println("-------------------------Hash Map------------------------------");
    // no order
    Map<String,Object> m1 = new HashMap();

         m1.put("Id", 1);
        m1.put("id", 4534);
    // m1.put(true, "Sachin");
        m1.put("ID", "8699181153");
        m1.put("Id",5);
        m1.put("id1",556);
        m1.put("Id",9);

        System.out.println(m1);
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey("ID"));
        System.out.println(m1.containsValue(556));

        System.out.println(m1.keySet());
        System.out.println(m1.values());

        for(Map.Entry<String,Object> Item : m1.entrySet()){
            System.out.println(Item.getKey() + " df "+ Item.getValue());
        }



}}
