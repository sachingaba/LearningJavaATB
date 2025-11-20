package JavaPractise;

public class Outer_Inner_Class_Implementation {
    public static void main(String[] args) {
    outer1 o1 = new outer1();

    outer1.inner inn = o1.new inner();
    inn.display();

    }
}
class outer1 {
    int x =10;

    class inner{


        void display(){
            System.out.println(x);
        }


    }

}