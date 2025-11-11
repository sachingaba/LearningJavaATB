package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab174_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add(4);
        list.add(true);

        System.out.println(list.isEmpty());
        System.out.println(list.contains("4"));
        System.out.println(list.size());
        System.out.println("---------------------------------- for loop examples------------------");
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
           // System.out.println(list.indexOf("1"));
        }
        System.out.println("---------------------------------- for each loop examples------------------");
        for(Object o:list){
            System.out.println(o);
        }
        System.out.println("---------------------------------- for List Iterator examples------------------");
        Iterator iter = list.iterator();
            while(iter.hasNext()){
                System.out.println(iter.next());
            }




    }
}
