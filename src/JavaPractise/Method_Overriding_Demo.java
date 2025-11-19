package JavaPractise;

public class Method_Overriding_Demo {
    public static void main(String[] args) {
        Parents p1 = new Childs();
        Parents p2 = new Parents();
        Childs c1 = new Childs();
      //  Childs c2 = new Parents();

        p1.display();
        p2.display();
        c1.display();

    }
}
class Parents{
    void display(){
        System.out.println("parent's display");
    }
}
class Childs extends Parents{
    void display(){
        System.out.println("Child's display");
    }
}