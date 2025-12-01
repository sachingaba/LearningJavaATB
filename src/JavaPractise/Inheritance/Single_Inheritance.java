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

        m1.bill();
        ;
        office o1 = new office() {
            @Override
            public void bill() {
                System.out.println("completing bill interface");
            }

        };
        o1.bill();
    }
}
class Employee{
    int sal = 45000;
    int bonus = 10000;

    void sal(){
       System.out.println("Employee sal: " + (sal+bonus));
    }
    void work(){
        System.out.println("Employee");
    }
}
class Manager extends Employee implements office{
    int sal = 65000;
    int bonus = 25000;
    int totale =  super.sal + super.bonus;

    void sal(){

     System.out.println("Manager's " + (sal+bonus));

    }
    int cost(){
        int total = totale + sal + bonus;
       return total;
    }

    @Override
    public void bill() {
        System.out.println("Bill interface");
    }
}
interface office{
    void bill();
}