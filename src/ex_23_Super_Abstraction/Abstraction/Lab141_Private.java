package ex_23_Super_Abstraction.Abstraction;

public class Lab141_Private {

}
class XYZ{
    public XYZ() {
    }
    protected int gold = 10;
  //  private int my_gold = 25;
}// Gold can be accessed within the package
class YYY extends XYZ {
    void display() {
        System.out.println(super.gold);
      //  System.out.println(super.my_gold);
    }

}