package JavaPractise.Strings;

import java.util.Scanner;

public class StringBuilder_vs_StringBuffer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 90% used
        String s0= "Sachin";
        String s1 = new String("Sachin") ;

        // 10% used

        StringBuffer stringBuffer = new StringBuffer("Sachin");

        StringBuilder stringBuilder = new StringBuilder("sc.next()");
        System.out.println("stringBuilder is asynchronize and not thread safe - faster");
        System.out.println(stringBuffer);
        System.out.println("stringBuilder is synchronized and thread safe -> slower");
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.insert(5,"SG"));

    }
}
