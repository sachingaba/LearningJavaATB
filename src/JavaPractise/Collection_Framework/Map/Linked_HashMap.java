package JavaPractise.Collection_Framework.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_HashMap {
    public static void main(String[] args) {
        Map<Object,Object> lmap = new LinkedHashMap();
        lmap.put("name","sachin");
        lmap.put("roll" ,4534);
        lmap.put("address", "guragon");
        lmap.put('A',"A");

        System.out.println(lmap);

        lmap.put("name",null);
        lmap.put(null,450);
        lmap.put(null,7870);
        lmap.put("roll", null);
        lmap.replace('A',"B");

        System.out.println(lmap);

        LinkedHashMap<String,Object> l1 = new LinkedHashMap<>();
        l1.put("Name","Sachin");
        l1.put("Roll" ,4534);
        l1.put("Address", "Gurgaon");
        //char type key not allowed
      //  l1.put('A',"A");
        System.out.println(l1);

        for(Map.Entry<String,Object> item : l1.entrySet()){
            System.out.println(item.getKey() + "--> " + item.getValue());
        }
    }
}
