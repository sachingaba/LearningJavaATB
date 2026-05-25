package JavaPractise.AA_InterviewQuestions;



public class Lab149_Static_SIB {
    public static void main(String[] args) {
       new A();

    }
}
class   A extends B{
    //This will rum on creating an object and run
    static {
        System.out.println("1");

    }

    public A(){

        System.out.println("3");
        super("blue");
    }

}class   B {
    String name;
    //This will rum on creating an object and run
    static {
        System.out.println("2");
    }



     B(String name) {
        this.name = name;
        System.out.println(name);
         System.out.println("4");
    }
    {
        System.out.println("5");
    }
}


