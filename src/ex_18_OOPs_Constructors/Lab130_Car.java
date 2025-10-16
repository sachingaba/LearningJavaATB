package ex_18_OOPs_Constructors;

public class Lab130_Car {
    public static void main(String[] args) {
     car c1= new car();
        System.out.println(c1.year);
        System.out.println(c1.name);

        loginPage l1 = new loginPage();
        System.out.println(l1.name);

        System.out.println("Parameterzid Constructor");
        car2 c2 = new car2("sachin",2023,2022);
        System.out.println(c2.name);
        System.out.println(c2.model);

    }
}




