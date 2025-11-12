package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab_Array_To_List {
    public static void main(String[] args) {
        String arr[] = {"sachin","gaba","java"};
        String arr2[] = {"sachin2","gaba2","java2"};


        List<String> list = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);

        }
        for(String name:arr){
            list3.add(name);
        }
        System.out.println("List " + list3);


// Second Way of doing it
        List<String> list2 = Arrays.asList(arr2);

        System.out.println(list);
      System.out.println(list2);


    }
}
