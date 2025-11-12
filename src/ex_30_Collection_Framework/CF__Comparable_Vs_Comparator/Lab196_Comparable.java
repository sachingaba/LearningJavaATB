package ex_30_Collection_Framework.CF__Comparable_Vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab196_Comparable {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sachin", 5);
        Employee e2 = new Employee("SachinG", 3);
        Employee e3 = new Employee("SacG", 1);

        List Emp = new ArrayList<>();
        Emp.add(e1);
        Emp.add(e2);
        Emp.add(e3);
        System.out.println(Emp);
        Collections.sort(Emp);
        System.out.println(Emp);


    }
}
     class Employee implements Comparable<Employee>{
     int id;
        String name;

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
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
             return id + " " + name;
         }



         @Override
         public int compareTo(Employee o) {
            // return this.id-o.id;
             return this.name.compareTo(o.name);
         }
     }


