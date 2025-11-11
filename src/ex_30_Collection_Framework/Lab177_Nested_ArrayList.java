package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab177_Nested_ArrayList {
    public static void main(String[] args) {


        List fruits = new ArrayList<>();
        fruits.add("Banana");fruits.add("Apple");fruits.add("Kiwi");fruits.add("Orange");
        System.out.println(fruits);

        //Only String type of objects can be added here
        List<String> Veg = new ArrayList<>();
        Veg.add("Gourd");Veg.add("Cauliflower");Veg.add("Potato");Veg.add("Onion");
        System.out.println(Veg);

        List Impo = new ArrayList<>();
        Impo.add("Avocado");Impo.add("Dragon Fruit");Impo.add("Blue Berry");
        System.out.println(Impo);

        List allv = new ArrayList<>();
        allv.add(fruits);
        allv.add(Veg);
        allv.add(Impo);
        System.out.println(allv);



    }
}
