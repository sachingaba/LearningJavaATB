package ex_22_Accessmodifier.Police;

public class Rahul extends cop {
    public Rahul(int bullet) {
        super(bullet);
    }

    public static void main(String[] args) {
        cop p = new cop(100);
      p.thisdefaultf1();  //not allowed unless in same package
    }
}
