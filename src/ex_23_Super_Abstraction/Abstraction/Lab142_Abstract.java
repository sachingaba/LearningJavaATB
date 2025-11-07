package ex_23_Super_Abstraction.Abstraction;

import java.sql.SQLOutput;

public class Lab142_Abstract {
    public static void main(String[] args) {
      Son_Aj Aj = new Son_Aj();
        Aj.loan50k();
    }
}

abstract class Father_Amit{

    abstract void loan50k();

    void loan10k(){
            System.out.println("Given");
        }
}
class Son_Aj extends Father_Amit{


    @Override
    void loan50k() {
        System.out.println("AJ will pay");
    }
}