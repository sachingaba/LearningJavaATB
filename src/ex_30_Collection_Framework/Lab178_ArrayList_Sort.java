package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab178_ArrayList_Sort {

    public static void main(String[] args) {

        List marks = new ArrayList<>();

        marks.add(44);
        marks.add(25);
        marks.add(94);
        marks.add(65);
        marks.add(99);
        marks.add(2);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);


    }
}
