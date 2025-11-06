package ex_20_Polymorphism.Method_Overridding;

public class Lab136_MOverridding_Automation_Ex {
    public static void main(String[] args) {
        commonToAll c1 = new commonToAll();
        c1.Openbrowser();

        chrome b1 = new chrome();
        b1.Openbrowser();

        firefox f1 = new firefox();
        f1.Openbrowser();

       //Dynamic Disptach
        commonToAll c2 = new chrome();
        c2.Openbrowser();

        commonToAll c3 = new firefox();
        c3.Openbrowser();

       /* firefox f2 = new commonToAll();
        f2.Openbrowser();*/
    }


}
class commonToAll{
    void Openbrowser(){
        System.out.println("Open Default Browser");
    }
}
class chrome extends commonToAll{
    @Override
    void Openbrowser() {
        System.out.println("Better browser - Chrome");
    }
}
class firefox extends commonToAll{
    @Override
    void Openbrowser() {
        System.out.println("Better browser - Firefox");
    }
}
