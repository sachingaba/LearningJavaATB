package JavaPractise.Collection_Framework.LIST.Array_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// first way
        List<Object> arr = new ArrayList<>(3);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter value:");
            arr.add(scanner.next());

        }
        System.out.println(arr);


// Second way
        System.out.println("---------------------Second Way --------------------");
        List<Object> arr1 = new ArrayList<>();
        String add = "Y";
        while(add.equalsIgnoreCase("Y")){
            System.out.println("Enter value : ");
            arr1.add(scanner.next());
            System.out.println("Do you want to enter more: (Y/N)");
            add = scanner.next();
        }
        System.out.println(arr1);
    }
}
