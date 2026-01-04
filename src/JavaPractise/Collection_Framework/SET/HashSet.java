package JavaPractise.Collection_Framework.SET;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {

        Set<Object> s1 = new java.util.HashSet<>();

        for (int i = 0; i < 5; i++) {
            s1.add(i);
        }
        s1.add("kill");
        System.out.println(s1);
        s1.add("Sachin");
        s1.add("Sachin");

        s1.add(null);
        s1.add(null);
        System.out.println(s1);

        Set s2 = new java.util.HashSet<>(Set.of("s","a","c","d",5));
        System.out.println(s2);

        for (int i = 0; i < s2.size(); i++) {
            System.out.println(s2.iterator());

        }
    }
}
