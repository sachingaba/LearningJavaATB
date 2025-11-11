package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab173_List {
    public static void main(String[] args) {
        List fruits = List.of("orange","banana","apple","strawberry","papaya","WaterMelon",5,6.5,"orange");
        System.out.println(fruits);



        List arrayList = new ArrayList();
        arrayList.add("sachin");
        arrayList.add("sachin");
        arrayList.add("gaba");
        arrayList.add(true);
        arrayList.add(4.5);
        arrayList.add(123);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains(1));
        System.out.println(arrayList.contains(true));
        System.out.println(arrayList.indexOf("3"));

        ArrayList a1 = new ArrayList<>();
        a1.add("hello");
        a1.add("4");
        a1.add(4);
        System.out.println(a1.contains(4));
        System.out.println(a1.contains("lo"));
    }
}
