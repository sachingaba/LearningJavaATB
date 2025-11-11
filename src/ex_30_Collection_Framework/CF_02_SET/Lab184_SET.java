package ex_30_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab184_SET {
    public static void main(String[] args) {
        Set hs = new HashSet<>();
        hs.add("Sachin");
        hs.add("Gaba");
        hs.add("Sachin");  // Will not take the duplicate values
        System.out.println(hs);

        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

    }
}
