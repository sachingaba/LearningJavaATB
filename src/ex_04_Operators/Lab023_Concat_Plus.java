package ex_04_Operators;

public class Lab023_Concat_Plus {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(x+y); // Int --> adds

        String f_name = "sachin";
        String l_name = "gaba";
        System.out.println(f_name+l_name); // string --> concat
        // + operator behaves differently with different data types
        // operator overloading.

        //System.out.println(f_name-l_name); // -,*,/ are not supported here for string

    }
}
