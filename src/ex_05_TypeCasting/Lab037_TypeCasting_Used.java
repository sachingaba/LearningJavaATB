package ex_05_TypeCasting;

public class Lab037_TypeCasting_Used {

    public static void main(String[] args) {
        int course = 100;
        float gst = 18.45f;
        // int total = course + gst;  // Norrowing >>Implicit>> not valid . float is bigger
        int total = course + (int)gst; // we will need to do Explicit

        System.out.println( total);
        // Widening

        float total2 = course + gst; // auto Implicit by JAVA
        System.out.println(total2);

        long course1 = 1000;
        long total3 = course1 + (long)gst;
        System.out.println(total3);

    }
}
