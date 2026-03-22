package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab192_Map_Real {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();

        map.put("name", "Sachin");
        map.put("Phone", "864341");
        map.put("Address", "gurgaon");
        map.put("Hometown", "Sirsa");

        System.out.println(map);

        Map<String,Object> map2 = new LinkedHashMap<>();

        map2.put("name", "Sachin");
        map2.put("Phone", "864341");
        map2.put("Address", "gurgaon");
        map2.put("Hometown", "Sirsa");

        System.out.println(map2);

        Map<String,Object> map3 = new TreeMap<>();

        map3.put("name", "Sachin");
        map3.put("Phone", "864341");
        map3.put("Address", "gurgaon");
        map3.put("Hometown", "Sirsa");

        System.out.println(map3);
        System.out.println(map3.size());
        System.out.println(map);

        for(Map.Entry<String,Object> item : map.entrySet()){
            System.out.println(item.getKey() + "--> "+ item.getValue() );
        }



    }
}
