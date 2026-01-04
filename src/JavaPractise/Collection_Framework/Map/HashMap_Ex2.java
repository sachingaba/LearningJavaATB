package JavaPractise.Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Ex2 {
    public static void main(String[] args) {
        HashMap<Object, Object> h1 = new HashMap<>();
        h1.put("name", "Sachin");
        h1.put("Phone", "864341");
        h1.put("Address", "gurgaon");
        h1.put("Hometown", "Sirsa");
        System.out.println(h1);

        for(Map.Entry<Object ,Object> item:h1.entrySet()){
            System.out.println(item.getKey() + "--->" + item.getValue());
        }
    }
}
