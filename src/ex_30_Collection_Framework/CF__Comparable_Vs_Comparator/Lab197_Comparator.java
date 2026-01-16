package ex_30_Collection_Framework.CF__Comparable_Vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab197_Comparator {

        public static void main(String[] args) {
          /*  Employee2 e10 = new Employee2("Sachin", 5);
            Employee2 e20 = new Employee2("SachinG", 3);
            Employee2 e30 = new Employee2("SacG", 1);*/

            List<Employee2> Emp = new ArrayList<>();
            Emp.add(new Employee2("Sachin", 5,25000));
            Emp.add(new Employee2("SachinG", 3,45000));
            Emp.add(new Employee2("SacG", 1,2000));
            System.out.println(Emp);

            Comparator<Employee2> nameComparator = (e1, e2) -> e1.name.compareTo(e2.name);
            Comparator<Employee2> idComp = (e1,e2) -> e1.id-e2.id;
            Comparator<Employee2> salComp = (e1,e2) -> e1.sal-e2.sal;

           // Collections.sort(Emp, nameComparator);
           // Collections.sort(Emp,idComp);
            Collections.sort(Emp,salComp);
            System.out.println(Emp);

    }
} class Employee2 implements Comparator<Employee2>{
    int id;
    String name;
    int sal;

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Employee2(String name, int id, int sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

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

    @Override
    public String toString() {
        return id + "-" + name + "-" + sal;
    }





    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return this.name.compareTo(o2.name);
    }
}

