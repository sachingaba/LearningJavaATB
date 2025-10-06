package ex_14_Strings;

import java.sql.SQLOutput;

public class Lab100_String_Interview2 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello";

        // Object Area String
        String s2 = new String("Hello"); // String 3
        String s3 = new String("Hello"); // String 4
        String s5 = new String("hello"); // String 5

// Comparison - > String -> check the ref. location4
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        System.out.println(s1==s4);
        System.out.println(s2==s3);

// equals (content) --> Values
        System.out.println("check values here");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));  /// ignored all upper and lower cases rule



    }
}
