package JavaPractise.Collection_Framework.LIST.Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Array_To_List {
    public static void main(String[] args) {


        String[] names = {"Sachin", "Gurleen", "Sagar", "prachi"};

        Integer[] age = {34, 33, 30, 26};

        List<Object> l1 = Arrays.asList(names);

        System.out.println(l1);

        List<Object> l2 = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            l2.add(names[i]);
            l2.add(age[i]);
        }
        System.out.println(l2);
        List<Object> l3 = new ArrayList<>();
        l3.addAll(Arrays.asList(age));
        l3.addAll(Arrays.asList(names));
        System.out.println(l3);

        List<Object> l4 = new ArrayList<>();
        for(String name : names){
            l4.add(name);
        }
        for(int ages : age){
            l4.add(ages);
        }
        System.out.println(l4);
    }
}