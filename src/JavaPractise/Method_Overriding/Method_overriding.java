package JavaPractise.Method_Overriding;

public class Method_overriding {
    public static void main(String[] args) {
        parent p1 = new parent();
        p1.home();
        System.out.println("-----------------------");
        son s1 = new son();
        s1.home();
        s1.gold();
        System.out.println("-----------------------");
        parent p3 = new son();
        p3.home();
        System.out.println("-----------------------");
        son2 s2 = new son2();
        s2.home();

        gs grandson = new gs();
        grandson.home("sachin");
        gs.gold();
        gs.gold();

    }
}
class parent{
    void home(){
        System.out.println("Parent's home");
    }
   public static void gold(){
        System.out.println("I have the gold");
    }

}
class son extends parent{
    void home(){
     //   super.home();
        System.out.println("son's home");
    }
  public  static void gold(){
        System.out.println("son's gold");
    }
}
class son2 extends parent{
    @Override
    void home() {
       // super.home();
        System.out.println("son2");

    }
}
class son3 extends parent{
    void home(){
        System.out.println("son3");
    }
}
class gs extends son{
    //overloading method not override
    void home(String x){
        System.out.println("Grand son" + x);
    }
}