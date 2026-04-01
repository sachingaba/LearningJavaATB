package ex_14_Strings;

import java.util.stream.Stream;

public class String_reverse_Whitespace {
    public static void main(String[] args) {
        String s1 = "My name is Sachin";

        String rev = Stream.of(s1.split(" ")).reduce("",(a,b)->b+" "+a);
        System.out.println(rev);
        String reverse = "";
        for(String text : s1.split(" ")){
             reverse = text + " " + reverse; //my
        }
        System.out.println(reverse);
    }
}
