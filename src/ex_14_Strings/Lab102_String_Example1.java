package ex_14_Strings;

public class Lab102_String_Example1 {
    public static void main(String[] args) {
        CharSequence c1 = "Sachin".subSequence(1,4);
        System.out.println(c1);
        System.out.println(c1.charAt(2)); // at position 2 ... 0 1 2
    }
}
