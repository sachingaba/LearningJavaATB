package JavaPractise;

public class Abstract_Shape_Implementation {
    public static void main(String[] args) {
        shape R1 = new Rectangle(5,3);
        shape c1 = new circle(4);

        R1.getArea();
        c1.getArea();
    }
}
abstract class shape{
    abstract void getArea();
}
class Rectangle extends shape {
    int sideA;
    int sideB;
    double area;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    void getArea() {
        area = sideA*sideB;
        System.out.println("Rectangle Area: " + area);
    }
}
class circle extends shape {
    int radius;

    public circle(int radius) {
        this.radius = radius;
    }

    double area;


    @Override
    void getArea() {
        area = 3.14159265359*radius*radius;
        System.out.println("Circle Area: " + area);
    }
}