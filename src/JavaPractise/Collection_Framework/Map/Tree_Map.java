package JavaPractise.Collection_Framework.Map;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        Map<String,Object> map3 = new TreeMap<>();
//natural Order
        map3.put("Name", "Sachin");
        map3.put("Phone", "864341");
        map3.put("Address", "gurgaon");
        map3.put("Hometown", "Sirsa");
        System.out.println(map3);

        for(Map.Entry<String,Object> item : map3.entrySet()){
            System.out.println(item.getKey());
            System.out.println(item.getValue());
            System.out.println(item.getKey()+ " ---> " + item.getValue());
        }
    }
}
