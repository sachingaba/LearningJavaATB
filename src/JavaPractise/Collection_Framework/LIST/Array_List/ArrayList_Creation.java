package JavaPractise.Collection_Framework.LIST.Array_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList_Creation {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("tomato");
        fruits.add("pineapple");
        fruits.add("onions");


        System.out.println(fruits);
        System.out.println("Sorted here: ---------------------------->");
        Collections.sort(fruits);
        System.out.println(fruits);
        System.out.println("Remove vegetable here: ------------------>");
        fruits.remove("onions");
        System.out.println(fruits);

        //other way to create list
        List<String> veg = new ArrayList(List.of("Potato", "bitter gourd", "Onion", "Cauliflower", "raddish"));
        System.out.println(veg);
        veg.add(2,"cabbage");
        System.out.println(veg);
        System.out.println("Add First and Last ------------------>");
        veg.addFirst("Veggies");
        System.out.println(veg);
        veg.addLast("Fruits: ");
        System.out.println(veg);
        veg.addAll(8,fruits);
        System.out.println(veg);
        System.out.println("Remove features ------------------------->");
        veg.removeAll(fruits);
        System.out.println(veg);
        veg.removeFirst();
        veg.removeLast();
        System.out.println(veg);

        System.out.println("calling all lists in one");
        List<Object> rationList = new ArrayList<>();
        //Adding elements of fruits list in ration list
        rationList.addAll(fruits);
        //Adding as a list in ration list
        rationList.add(veg);
        System.out.println(rationList);

        List<Object> rationList2 = new ArrayList<>();
        //Adding as a list in ration list
        rationList2.add(fruits);

        rationList2.add(veg);
        System.out.println(rationList2);

    }
}
