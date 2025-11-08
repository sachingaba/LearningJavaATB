package ex_23_Super_Abstraction.Abstraction;

public class Lab146_Mulitple_Inheritance_Solved {

    public static void main(String[] args) {
        child sach = new child();
        sach.money();
    }
}
class child implements fathe1,fathe2{

    @Override
    public void money() {
        System.out.println("Child");
    }
}
interface fathe1{
    void money();
}
interface fathe2{
    void money();
}
