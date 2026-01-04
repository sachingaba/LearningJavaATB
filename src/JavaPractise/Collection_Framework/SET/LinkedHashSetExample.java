package JavaPractise.Collection_Framework.SET;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {

 LinkedHashSet<Object> s1 = new LinkedHashSet<>();
  s1.add("Hello");
  s1.addFirst("yellow");
  s1.addLast("Kill");
  s1.add(5);
  s1.removeFirst();
  s1.remove(5);
  // One null allowed
  s1.add(null);
  s1.add(null);
        s1.addLast("Kill");
        System.out.println(s1.isEmpty());

        System.out.println(s1);





    }
}
