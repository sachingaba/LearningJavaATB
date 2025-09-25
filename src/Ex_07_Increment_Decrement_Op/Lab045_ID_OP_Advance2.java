package Ex_07_Increment_Decrement_Op;

public class Lab045_ID_OP_Advance2 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a); // a++ = 10 and then 11 .. 11 will become 12 first assigned
        System.out.println(a); // 12

        // ++a --> A --> 10 assigned and value changed to 10+1=11
        //  +
         //a++ --> B --> 11+1 = 12 first and then assigned
    }
}
