package JavaPractise;

public class Mulitple_Interface_Implementation {
    public static void main(String[] args) {
        duck d1 = new duck();
        d1.fly();
        d1.swim();
    }

}
class duck implements flyable,swimmable{


    @Override
    public void fly() {
        System.out.println("Duck is flying in the sky!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water!");
    }
}
interface flyable{
    void fly();
}
interface swimmable{
    void swim();
}