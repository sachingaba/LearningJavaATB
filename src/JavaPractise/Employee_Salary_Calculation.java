package JavaPractise;

public class Employee_Salary_Calculation {
    //Create an Employee base class and Manager, Developer subclasses.
    // Each should have different salary calculation methods.

    public static void main(String[] args) {
        EmployeeBase man1 = new Manager(60000,10000);
        EmployeeBase dev1 = new Developer(160);
        man1.salaryCal();
        dev1.salaryCal();
    }
}
class EmployeeBase{
     void salaryCal(){
        //System.out.println("Salary Calculations: ");
    }

}
class Manager extends EmployeeBase{
    public Manager(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    double salary;
double bonus;


    @Override
    void salaryCal() {
        super.salaryCal();
        salary = this.salary + this.bonus;
        System.out.println("Manager salary: " + salary);

    }
}
class Developer extends EmployeeBase{
    public Developer(int Hours) {
        this.Hours = Hours;


    }

    int rate = 50;
    int Hours;
    double salary;


    @Override
    void salaryCal() {
        super.salaryCal();
        salary = rate*this.Hours;
        System.out.println("Developer salary: " + salary);

    }
}