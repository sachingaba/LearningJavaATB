package JavaPractise.Collection_Framework.CF__Comparable_Vs_Comparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee2 implements Comparator<Employee2> {
    String name;

    public Employee2(String name, int id, int sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

     int id;
      int sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "{" +
                 name + '-' +
                 id + "-"+
               sal +
                '}';
    }



    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return this.name.compareTo(o2.name);    }
}
class company{
    public static void main(String[] args) {




        List emp = new ArrayList<>();
        emp.add(new Employee2("Sachin", 34, 80000));
        emp.add(new Employee2("Rahul", 31, 75000));
        emp.add(new Employee2("king", 45, 90000));

        System.out.println(emp);

        Comparator<Employee2> nameComparator = (Employee2 e1,  Employee2 e2) -> e1.name.compareTo(e2.name);
        Collections.sort(emp,nameComparator);
        System.out.println(emp);
        Comparator<Employee2> idComp = (e1,e2) -> e1.id-e2.id;
        Collections.sort(emp,idComp);
        System.out.println(emp);
    }
}
