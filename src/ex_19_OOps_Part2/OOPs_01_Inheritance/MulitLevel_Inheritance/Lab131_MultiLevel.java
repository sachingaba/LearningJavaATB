package ex_19_OOps_Part2.OOPs_01_Inheritance.MulitLevel_Inheritance;

public class Lab131_MultiLevel {
    public static void main(String[] args) {

      //SOn can inherit from both GF and Father
        System.out.println("-----SON here------");
        Son sachin = new Son();
        sachin.bhk3();
        sachin.home();
        sachin.extra();
        sachin.gf();

        System.out.println("----Father here-------");
//Father can inherit from GF only
        Father f1 = new Father();
        f1.gf();
        f1.home();
        f1.extra();

        System.out.println("------GrandFather Here-----");
//GF can only use his own functions
        GrandFather gf1 = new GrandFather();
        gf1.gf();
        gf1.home();

        //Dynamic Dispatch
        GrandFather gf2 = new Son();
        Father f11 = new Son();
        //Son S1 = new GrandFather();  --- NOt POssible
        // Son s1 = new Father();



    }
}
