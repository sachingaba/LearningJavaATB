package JavaPractise.Collection_Framework.LIST.Array_List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayList_Class {
    public static void main(String[] args) {

        Students s1 = new Students("Sachin",4534,"Java");
        Students s2 = new Students("Gurleen", 1535 ,"MBA");
        Students s3 = new Students("Sagar", 45366, "btech");

        List<Students> Student = new ArrayList<>();
        Student.add(s1);
        Student.add(s2);
        Student.add(s3);

        System.out.println(Student);

        ListIterator<Students> studentsListIterator = Student.listIterator(2);
        System.out.println(studentsListIterator);
    }
}
class Students {
    public Students(String name, Integer roll_no, String course) {
        this.name = name;
        this.roll_no = roll_no;
        this.course = course;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", course='" + course + '\'' +
                '}';
    }

    private String name;
    private Integer roll_no;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(Integer roll_no) {
        this.roll_no = roll_no;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
