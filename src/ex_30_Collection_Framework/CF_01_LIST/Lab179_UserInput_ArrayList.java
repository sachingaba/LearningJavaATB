package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab179_UserInput_ArrayList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        String add = "Y";
        while(add.equalsIgnoreCase("Y")){
            System.out.println("Enter the NAME");
            names.add(scan.next());

            System.out.println("Do you wanna add more?");
            add = scan.next();

        }
        System.out.println("here is the list : ");
        System.out.println(names);
        System.out.println( "Size: " + names.size());

        //Other way of doing it

        for(String name:names){

            System.out.println(name);
        }
    }
}
