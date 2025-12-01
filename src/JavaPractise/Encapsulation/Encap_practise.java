package JavaPractise.Encapsulation;

import java.util.Objects;

public class Encap_practise {
    public static void main(String[] args) {
        student s1 = new student("Sachin",34,4534);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.code);
        s1.age = 30;
        s1.name = "Sachin Gaba";
        s1.code = 4505;
        System.out.println(s1.age);


        System.out.println("------------------------Now Encapsulation------------------------");
        students s2 = new students("gaba",33,1025);
        //Encap doesn't allow this:
        //s2.age = 33;
        System.out.println(s2.getAge());
        System.out.println(s2.getCode());
        System.out.println(s2.getName());
        //Update or set using setter method
        s2.setAge(30);
        s2.setName("Sachin Gaba");
        s2.setCode(4505);
        System.out.println(s2.getAge());
        System.out.println(s2.getCode());
        System.out.println(s2.getName());

        System.out.println(s2);
        //Not in same class
        System.out.println(s2.equals(s1));
        students s3 = new students("Sachin Gaba",30,4505);
        System.out.println(s2.equals(s3));

        System.out.println(s2.hashCode());
    }
}
class student{
    String name;
    int age;
    int code;

    public student(String name, int age, int code) {
        this.name = name;
        this.age = age;
        this.code = code;
    }

}
class students{
    private String name;
  private int age;
  private int code;

    public students(String name, int age, int code) {
        this.name = name;
        this.age = age;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", code=" + code +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        students students = (students) o;
        return age == students.age && code == students.code && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, code);
    }
}
