package ex_30_Collection_Framework.CF_01_LIST;

import java.util.Vector;

public class Lab176_Vector {

    public static void main(String[] args) {

        //Vector are thread safe and that's why slow

        Vector v1 = new Vector<>();
        v1.add("w");
        v1.add("wife");   v1.add("woo");   v1.add("win");   v1.add("with");   v1.add("wash");

        System.out.println(v1.size());
        System.out.println(v1.capacity());
        System.out.println(v1.contains("wife"));




    }
}
