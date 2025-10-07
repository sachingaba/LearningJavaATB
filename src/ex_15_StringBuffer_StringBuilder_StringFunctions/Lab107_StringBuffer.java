package ex_15_StringBuffer_StringBuilder_StringFunctions;

public class Lab107_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Sachin");

        stringBuffer.append("Gaba");
        System.out.println(stringBuffer);// Single string will come as they are mutable
        stringBuffer.append(123); // can append int, long , float , double also
        System.out.println(stringBuffer);

        String s1 = "SAchin";
        s1 = s1+"gaba";
        System.out.println(s1); // now 2 strings will be stored . 1.sachin 2. sachingaba as they are immutable
    }
}
