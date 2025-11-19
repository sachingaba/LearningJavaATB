package JavaPractise;

public class Employee_Encapsulation {
    public static void main(String[] args) {
        Employee E1 = new Employee(1,"John Doe",50000);
        System.out.println("Employee ID: "+ E1.getId() + " Employee Name: "+ E1.getName());
        System.out.println("Employee Salary: "+ E1.getSalary());
    }
}

class Employee{
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
