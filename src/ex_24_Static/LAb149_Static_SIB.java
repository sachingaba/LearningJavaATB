package ex_24_Static;

public class LAb149_Static_SIB {
    public static void main(String[] args) {
        A a = new A();

    }
}

class   A{
    //This will rum on creating an object and run
    static {
        System.out.println("Default text");
        System.out.println("Default task -- like open the file");
    }
    static int age = 33;
    static void m1(){
        System.out.println("Static Function");
    }
}