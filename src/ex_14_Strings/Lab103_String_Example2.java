package ex_14_Strings;

public class Lab103_String_Example2 {
    public static void main(String[] args) {
        String s = "java".substring(2); //java-0123 -> 2,3 value taken
        System.out.println(s);

        String s1 = "java".substring(1,3); // value taken from 1 to (3-1)
        System.out.println(s1);

        char[] arr = "Java".toCharArray();
        System.out.println(arr);

        String st = "  Ja va   ".trim(); // remove extra spaces
        System.out.println(st);

        boolean b = "".isBlank();
        System.out.println(b);

        String s2 = "AB".repeat(5);
        System.out.println(s2);

        boolean b11 = "Java".equalsIgnoreCase("java") ;
        System.out.println(b11);



    }

}
