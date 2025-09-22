package ex_05_TypeCasting;

public class Lab034_TypeCasting_0 {

    public static void main(String[] args) {

        // process of converting a value from one data type to another
        /* Widening Casting
        - Widening casting, also known as implicit casting, occurs when converting a smaller data type to a larger one.
        - **This type of casting is performed automatically by the Java compiler** and is considered safe because there's no risk of data loss.
*/
        byte b =10;
        int a = b; // valid syntax >> Implicit casting >> widening casting
        //int a = (int)b; // valid syntax >> Explicit casting >> widening casting
        // for widening , Explicit is not needed
        System.out.println(a);

        //implicit castening

       // int a1 = 300;
       // byte b2 = a1 ; // invalid as byte can take small value 127 range

        //System.out.println(b2);



    }
}
