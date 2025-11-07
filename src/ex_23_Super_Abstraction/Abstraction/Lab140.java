package ex_23_Super_Abstraction.Abstraction;

public class Lab140 {
    public static void main(String[] args) {
        car nexon = new car(250);
nexon.drive();


    }
}
class Vehicle{
    public int  maxSpeed = 180;

//method
    void noTest(){
        System.out.println("Empty");
    }
// default constructor
    Vehicle(){
        System.out.println("DC - Constructor");
    }
// parameterized Constructor
    Vehicle(int a){
    System.out.println("    Param Constructor");
}
//Multiple - param - Constructor
    Vehicle(int a,int b){
        System.out.println(" Multiple Param Constructor");
    }
// Method Overloading - same name , with different arguments
    void message(){
        System.out.println("No return no argument");
    }
    void message(int a ){
        System.out.println("no return but different arguments");
    }
    void drive(){
        System.out.println("Vehicle Parent");
    }



    }
    class car extends Vehicle{

        private int maxSpeed = 290;
        car(){
            super(100);
        }
        car(int a){
            System.out.println("PC - CAR");
        }
        void test(){
            System.out.println("CAR - EMpty test");
        }

        @Override
        void drive() {
            System.out.println("Over ridden the vehicle");
            System.out.println(super.maxSpeed);
            System.out.println(this.maxSpeed);
            super.noTest();
            this.test();

        }

    }