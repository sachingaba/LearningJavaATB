package JavaPractise.Collection_Framework.CF__Comparable_Vs_Comparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee1 implements Comparable<Employee1> {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee1(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    private String name;
    private Integer id;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


    @Override
    public int compareTo(Employee1 o) {
        return this.id-o.id;
      //  return this.name.compareTo(o.name);
    }
}
class comp{
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Sachin",34);
        Employee1 e2 = new Employee1("Rahul",31);
        Employee1 e3 = new Employee1("King",44);


        List l1 = new ArrayList();
        l1.add(e1);
        l1.add(e2);
        l1.add(e3);

        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);

    }
}
