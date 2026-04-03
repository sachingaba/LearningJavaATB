package JavaPractise.Inheritance.Practise;

public class Heirarichal_Inheritance {
    public static void main(String[] args) {
Bank b1 = new Bank();
b1.Bankname = "sachin's Bank";
b1.balance = 100000;
b1.numOfEmp =5;

b1.work();

EmployeeBank e1 = new EmployeeBank("sk","manager");
e1.work();
e1.permissions();
    }
}class Bank{
    String Bankname;
    double balance;
    int numOfEmp;

     Bank() {
         System.out.println("NEW Bank");
    }
    void permissions(){
        System.out.println("permission loading");
    }
    void work(){
        System.out.println("Define Work");
    }


}
class EmployeeBank extends Bank{
    public EmployeeBank(String name, String role) {

        this.name = name;
        this.role = role;
    }

    String name;
    String role;

    @Override
    void work(){
        System.out.println("Work will be defined her - Employeee");
    }
}
interface security{
    void safe();
    void gate();
}
