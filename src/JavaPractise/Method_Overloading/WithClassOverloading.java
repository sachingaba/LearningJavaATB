package JavaPractise.Method_Overloading;

public class WithClassOverloading {
    public static void main(String[] args) {
        office o = new office();
        o.work();
        o.work("Coding");
    }
}
class office{
    void work(){
        System.out.println("DO your work");

    }
    void work(String x){
        System.out.println("YOu will do: "+ x);
    }

}