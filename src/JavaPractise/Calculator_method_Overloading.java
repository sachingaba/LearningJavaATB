package JavaPractise;

public class Calculator_method_Overloading {
    public static void main(String[] args) {
        Addf f1 = new Addf();
        System.out.println("Integer addition: " + f1.add(5,3));
        System.out.println("Double addition: " + f1.add(2.5,3.7));
        System.out.println("Three integers addition: " +  f1.add(1,2,3));
    }
}
class Addf{

    int add(int x, int y){

        return x+y;
    }
    double add(double x, double y){

        return x+y;
    }
    int add(int x, int y, int z){

        return x+y+z;
    }
    }
