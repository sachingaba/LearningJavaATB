package ex_01_Java_Basics;

public class Lab013_PrintF {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b);
        System.out.println(a);

        //Print
        System.out.print(a);
        System.out.print(b);

        //Printf how to use
        // %d  -> int, byte, long , short, - data type
        // %s  -> string
        // %f  -> float, double
        // %b  -> boolean


        System.out.printf(" Value of a is %d", a); // %d will add value of a and you can use = to replace is
        System.out.println(); // for next line
        System.out.printf(" Value of b is %d", b);

    }

}
