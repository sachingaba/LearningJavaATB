package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab180_UserInput_Marks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> marks = new ArrayList<>();
        String cont = "y";
        Integer total =0;

        while(cont.equalsIgnoreCase("y")) {
            System.out.println("Enter marks");
            marks.add(scan.nextInt());

            System.out.println("Do you want to add more to the list :(Y/n)");
            cont = scan.next();

        }
        System.out.println(marks);

        for(int mark:marks){
             total = total+mark;


        }
        int out = marks.size()*100;
        System.out.println("marks: " + total);
        System.out.println("percentage: " + ((float)(total*100)/out));


    }
}
