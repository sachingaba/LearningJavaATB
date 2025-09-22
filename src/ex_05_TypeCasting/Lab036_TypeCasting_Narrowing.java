package ex_05_TypeCasting;

public class Lab036_TypeCasting_Narrowing {

    public static void main(String[] args) {
        //Narrowing castening

        int a1 = 300; // converted to 32 bits digit no .. 101010 and then last 8 digit it will take
        //byte b2 = a1 ; //implicit won't work here
        byte b2 = (byte)a1; // Narrowing casting


        System.out.println(b2);



    }
}
