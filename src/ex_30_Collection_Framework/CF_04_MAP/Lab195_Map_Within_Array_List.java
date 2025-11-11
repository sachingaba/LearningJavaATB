package ex_30_Collection_Framework.CF_04_MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab195_Map_Within_Array_List {
    public static void main(String[] args) {
        Map<String,Object> Student1 = new HashMap<>();

        Student1.put("name", "Sachin");
        Student1.put("Phone", "864341");
        Student1.put("Address", "gurgaon");
        Student1.put("Hometown", "Sirsa");

        System.out.println(Student1);

        Map<String,Object> Student2 = new HashMap<>();

        Student2.put("name", "Sachin");
        Student2.put("Phone", "864341");
        Student2.put("Address", "gurgaon");
        Student2.put("Hometown", "Sirsa");

        System.out.println(Student2);

        List students = new ArrayList<>();
        students.add(Student1);
        students.add(Student2);
        System.out.println(students );

    }
}
