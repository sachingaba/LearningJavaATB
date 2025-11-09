package ex_26_Wrapper_Class;

public class Lab156_Wrapper {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;
        //Boxing - primitive -> Wrapper -- AutoBoxing -- JVM will do it.
        System.out.println(b.intValue());
        System.out.println(b);

        //Unboxing -- wrapper to Primitive
        Integer aa = 10;
        int bb =aa;
       // System.out.println(aa.intValue());
        System.out.println(bb);

    }
}
