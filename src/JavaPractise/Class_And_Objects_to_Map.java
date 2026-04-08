package JavaPractise;

import java.util.*;

public class Class_And_Objects_to_Map {
    public static void main(String[] args) {
        Person p1 = new Person(39, "Sachin", 45000);
        Person p2 = new Person(36, "sagar", 75000);
        Person p3 = new Person(38, "Sam", 90000);

        Map<Integer, Person> map = new HashMap<>();
        map.put(p1.id, p1);
        map.put(p2.id, p2);
        map.put(p3.id, p3);
        System.out.println(map);
        double total = 0;
        int count = 0;
        for (Person person : map.values())
        {
            total = total + person.getSalary();
            count++;
        }
        System.out.println("Average Salary= " + total/count);
        //Sort in Map
        System.out.println(new TreeMap<>(map));

        //Sort on values in Map
        List<Person> list = new ArrayList<>(map.values());
        Collections.sort(list, (a,b)->Double.compare(b.getSalary(),a.getSalary()));
        System.out.println(list);

        Comparator<Person> nameComp = (a,b)-> a.name.compareTo(b.name);
        Comparator<Person> sal = (a,b)-> (int) (a.getSalary()-b.getSalary());
        Collections.sort(list,nameComp);
        System.out.println(list);
        Collections.sort(list,sal);
        System.out.println(list);
    }
}

    class Person implements Comparator{
        public String name;
        public int id;

        public double getSalary() {
            return salary;
        }

        private double salary;

        Person(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", salary=" + salary +
                    '}';
        }

        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
