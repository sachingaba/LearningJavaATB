package JavaPractise.Inheritance;

public class Single_Inheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.sal();

        Manager m1 = new Manager();
        System.out.println("manager ---- access");

    m1.work();
        m1.sal();
        System.out.println("Lets see.. how cost is coming");
   int cost = m1.cost();
     System.out.println(cost);
    }
}
class Employee{
    int sal = 45000;
    int bonus = 10000;

    int sal(){
       System.out.println("total sal: " + (sal+bonus));
       return sal+bonus;
    }
    void work(){
        System.out.println("Employee");
    }
}
class Manager extends Employee{
    int sal = 65000;
    int bonus = 25000;
    int totale =  super.sal() ;

    int sal(){

     System.out.println("Manager's " + (sal+bonus));
        return 0;
    }
    int cost(){
        int total = totale + sal + bonus;
       return total;
    }
}
