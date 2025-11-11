package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab183_ArrayList_Class {
    public static void main(String[] args) {

        Students s1 = new Students("Sachin" , "4534");
        Students s2 = new Students("Sachin2" , "45342");
        Students s3 = new Students("Sachin3" , "45343");
        s2.setName("Gurleen");

        System.out.println(s1.toString());

        List<Students> Std = new ArrayList<>();
        Std.add(s1);
        Std.add(s2);
        Std.add(s3);

        System.out.println(Std);

    }
    static class Students{
        private String name;
        private String roll;

        public Students(String name, String roll) {
            this.name = name;
            this.roll = roll;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRoll() {
            return roll;
        }

        public void setRoll(String roll) {
            this.roll = roll;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "name='" + name + '\'' +
                    ", roll='" + roll + '\'' +
                    '}';
        }
    }
}
