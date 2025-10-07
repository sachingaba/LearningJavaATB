package ex_15_StringBuffer_StringBuilder_StringFunctions;

public class Lab106_StringBuilder_vs_StringBuffer {

    public static void main(String[] args) {

        // 90% used
        String s0= "Sachin";
        String s1 = new String("Sachin") ;

        // 10% used
        StringBuffer stringBuffer = new StringBuffer("Sachin");
        StringBuilder stringBuilder = new StringBuilder("Sachin");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
