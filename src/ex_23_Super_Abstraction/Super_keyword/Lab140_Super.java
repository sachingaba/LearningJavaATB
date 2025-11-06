package ex_23_Super_Abstraction.Super_keyword;

public class Lab140_Super {
    public static void main(String[] args) {
        FatherG gul = new FatherG();
        SonG Sach = new SonG();


    }
}

class FatherG{
    int gold=10;

    FatherG(){
        System.out.println("Father DC");
    }
    void home(){
        System.out.println("father's home");
    }
}
class SonG extends FatherG{
    int gold_s = 100;
    SonG(){
        super();
    }
    void bike(){
        System.out.println("Bike");
    }
    void newHome(){
        super.home();// calling father's function
        System.out.println(super.gold);
        this.bike();  // calling own function
        System.out.println(this.gold_s);


    }
}
