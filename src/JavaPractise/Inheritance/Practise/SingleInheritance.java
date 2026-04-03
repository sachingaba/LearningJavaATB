package JavaPractise.Inheritance.Practise;

public class SingleInheritance {

    public static void main(String[] args) {
        Employee e1 = new Employee("Sachin","Manager",45000);
        e1.salaryDistribution();
        System.out.println(e1);


    }
} class Employee implements Salary{
    String name;
    String role;
int salary;

    public Employee(String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary  = salary;
        System.out.println(name +" " +role );
    }

    @Override
    public void salaryDistribution() {

        System.out.println(this.name +" : - " + salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
interface Salary {
    default void salaryDistribution() {
        System.out.println("Default salary - ADd your own details");
    }
}