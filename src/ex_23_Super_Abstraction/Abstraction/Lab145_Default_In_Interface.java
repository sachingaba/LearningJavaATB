package ex_23_Super_Abstraction.Abstraction;

public class Lab145_Default_In_Interface {
    public static void main(String[] args) {
Car12 c1 = new Car12("NEXON Gaba");
c1.start();
    }
}
 class Car12 implements stopcar{
    String name;

     public Car12(String name) {
         this.name = name;
     }

     void start(){
         this.testengine();
         this.breaks();
         this.stop();
     }

     @Override
     public void stop() {
         System.out.println("Stop car " + name);
     }

     @Override
     public void breaks() {
         System.out.println("Apply break " + name);

     }
 }
interface stopcar{
    void stop();
    void breaks();

    // default is used to make a concrete or complete class in interface .. all other are abstract
    default void testengine(){
        System.out.println("Engine is great");

    }
    default void testengine2(){
        System.out.println("Engine is great2");

    }

}
