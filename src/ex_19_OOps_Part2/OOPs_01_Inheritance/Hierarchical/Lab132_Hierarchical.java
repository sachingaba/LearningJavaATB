package ex_19_OOps_Part2.OOPs_01_Inheritance.Hierarchical;

public class Lab132_Hierarchical {
    public static void main(String[] args) {
        System.out.println("Sachin's fucntion calling");
        Sachin sach = new Sachin();
        sach.h2();
        sach.home();

        System.out.println("Gurleen's function calling");
        Gurleen g1 = new Gurleen();
        g1.h4();
        g1.home();


        System.out.println("Sagar function calling");
        Sagar sag = new Sagar();
        sag.h3();
        sag.home();

    }
}
