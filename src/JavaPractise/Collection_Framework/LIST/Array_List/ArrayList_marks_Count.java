package JavaPractise.Collection_Framework.LIST.Array_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_marks_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many subject you have: ");
        int sub = scanner.nextInt();
float total = 0;
        List<Float> marks = new ArrayList<>();

int count =1;
        for (int i = 0; i < sub; i++) {

            System.out.println("Enter mark for subjects: "+ count);
            marks.add(scanner.nextFloat());
           Float val = marks.get(i);
            total = total+val;
            count++;

        }
        System.out.println(marks);
       float totalmarks = sub*100;

       float percentage = (total/totalmarks)*100;
        System.out.println(percentage + "%");

    }
}
