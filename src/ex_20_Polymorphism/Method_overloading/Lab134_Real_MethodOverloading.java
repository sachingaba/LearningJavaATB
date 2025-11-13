package ex_20_Polymorphism.Method_overloading;

public class Lab134_Real_MethodOverloading {
    public static void main(String[] args) {
    Home h1 = new Home();
    h1.task();
    h1.task("Bedroom");
    h1.task("kitchen");

    }
} class Home{
    void task(){
        System.out.println("default - clean washroom");
    }
    void task(String whichTask){
        System.out.println("Overloading task " + whichTask);
    }

}
