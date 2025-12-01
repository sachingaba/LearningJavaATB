package JavaPractise.Abstract;

public class abstract_Father {
    public static void main(String[] args) {
        son s1 = new son();
        s1.loan();
        s1.home();
        s1.gold();
        s1.rent1();
        s1.rent2();
        System.out.println(s1.gold_f);
        //System.out.println(s1.money);
        System.out.println(son.sec);
        System.out.println(rent.sec);

    }
}
abstract class fatherLoan{
   static int money = 50000;
    abstract void loan();
    abstract void gold();
    abstract void home();

}

class son extends fatherLoan implements rent{
    int gold_f = 500;
    static int sec = 10000;
    void gold(){
        System.out.println("son's gold");
    }

    @Override
    void home() {
        System.out.println("son's Home");
    }

    @Override
    void loan() {
        System.out.println("Son will pay");
    }

    @Override
    public void rent1() {
        System.out.println("Son will get 1");
    }

    @Override
    public void rent2() {
        System.out.println("sun will get 2");
    }
}
interface rent{
    static int sec = 20000;
    void rent1();
    void rent2();

}