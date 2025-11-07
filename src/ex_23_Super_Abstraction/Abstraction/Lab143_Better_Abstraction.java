package ex_23_Super_Abstraction.Abstraction;

public class Lab143_Better_Abstraction {
    public static void main(String[] args) {


//        Tesla t1 = new Tesla();
//        t1.startCar();
//        t1.stopCar();

        WagonR rr = new WagonR();
        rr.drive();
        /*rr.applyBrake();
        System.out.println("Next : ");
        rr.startCar();
        rr.stopCar();*/

    }
}

abstract class  CarOG{

    abstract void startCar();
    abstract void stopCar();

}

class Tesla extends CarOG{

    @Override
    void startCar() {
        System.out.println("Starting the Car");
    }

    @Override
    void stopCar() {
        System.out.println("Stop the car");
    }
}
class WagonR extends Tesla implements Tyre,gear{

    void drive(){
        this.startCar();
        this.rubber();
        this.blackColor();
        this.changeGear();
        this.stopCar();

    }
    @Override
    void startCar() {
        super.startCar();
        super.stopCar();
    }
    void applyBrake(){
        System.out.println("USing own function");
        this.startCar();

    }

    @Override
    public void rubber() {
        System.out.println("Rubber Tyre");
    }

    @Override
    public void blackColor() {
        System.out.println("Change color to black");
    }

    @Override
    public void changeGear() {
        System.out.println("change gear functionality");
    }
}
interface Tyre {
    void rubber();
    void blackColor();

}
interface gear{
    void changeGear();
}



