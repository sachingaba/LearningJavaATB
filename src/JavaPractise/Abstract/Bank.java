package JavaPractise.Abstract;

public class Bank {
    public static void main(String[] args) {
        cov c1 = new cov();
       manager b1 = c1.publish();
       b1.printme();
        System.out.println("--------------------------");
       cov1 c2 = new cov1();
        security s2 = c2.publish();
        s2.printme();
        System.out.println("--------------------------");
        b1.bankBal();
       b1.printme();
       b1.salaries();
        System.out.println("--------------------------");
       security s1 = new security();
        System.out.println(s1.salary);
        s1.bankBal();
        s1.salaries();
        s1.safe();
        s1.maingate();
        s1.closingTime();
        s1.msg();
    }
}
abstract class BankOp{
    void maingate(){
        System.out.println("Open for all");
    }
     abstract void bankBal();
    abstract void safe();
    abstract void salaries();

}
class manager extends BankOp{
static {
    System.out.println("Method Overiding -Manager- print me");
}
    @Override
    void bankBal() {
        System.out.println("bankBal check");
    }

    @Override
    void safe() {
        System.out.println("Open safe");
    }

    @Override
    void salaries() {
        System.out.println("View Salaries");

    }
    void printme(){
        System.out.println("Print Manager");;

    }
}
class cov{
    manager publish(){
        System.out.println("Manager");
        return new manager();
    }
}
class cov1{
    security publish(){
        System.out.println("Security");
        return new security();
    }
}
class security extends BankOp implements close {
    static {
        System.out.println("Method Overiding -Security- print me");
    }
    int salary = 15000;

    @Override
    void bankBal() {
        System.out.println("No");
    }

    @Override
    void safe() {
        System.out.println("NO");
    }

    @Override
    void salaries() {

        System.out.println("yours only" + this.salary);

    }

    void printme() {
        System.out.println("Print Security");
        
    }

    @Override
    public void closingTime() {
        System.out.println("Will come on closing time");
    }

    @Override
    public void msg() {
        close.super.msg();
    }
}
interface close{
    void closingTime();

    default void msg(){
        System.out.println("CLosing time , logout please");
    }
}