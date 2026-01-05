package JavaPractise.Collection_Framework.Map;

import java.util.*;

public class Maps_In_List {
    public static void main(String[] args) {
        System.out.println("------------------------------------------Map1----------------------------");
        Map<String,Object> map1 = new HashMap<>();
//natural Order
        map1.put("Name", "Sachin");
        map1.put("Phone", "864341");
        map1.put("Address", "gurgaon");
        map1.put("Hometown", "Sirsa");
        System.out.println(map1);

        System.out.println("------------------------------------------Map2-----------------------------");
        Map<String,Object> map2 = new LinkedHashMap<>();
//natural Order
        map2.put("Name", "Sachin");
        map2.put("Phone", "864341");
        map2.put("Address", "gurgaon");
        map2.put("Hometown", "Sirsa");
        System.out.println(map2);

        System.out.println("------------------------------------------Map3------------------------------");
        Map<String,Object> map3 = new TreeMap<>();
//natural Order
        map3.put("Name", "Sachin");
        map3.put("Phone", "864341");
        map3.put("Address", "gurgaon");
        map3.put("Hometown", "Sirsa");
        System.out.println(map3);
        System.out.println("------------------------------------------All in One Map------------------------------");
        Map<String,Map> all = new TreeMap<>();
        all.put("HashMap",map1);
        all.put("LinkedHashMap",map2);
        all.put("TreeMap",map3);
        System.out.println(all);

        System.out.println("------------------------------------------All in One List------------------------------");

        List allMap = new LinkedList();
        allMap.add(map1);
        allMap.add(map2);
        allMap.add(map3);
        System.out.println(allMap);

        System.out.println("------------------------------------------For Loop in Map------------------------------");

        for(Map.Entry<String,Map> item: all.entrySet()){
            System.out.println(item.getKey() + "--->" + item.getValue());
        }

    }
}
