package ex_17_OOPs;

public class Lab127_Constructors {
    public static void main(String[] args) {


        Student sachin = new Student();
        Student s1 = new Student(" Sachin");
        Student s2 = new Student();
        System.out.println(s2.name);
        Student s3 = new Student("Gaba");
        System.out.println(s3.name);
        s3.sleep();
        s2.sleep();
    }
}

class Student{
String name;
// Default Constructor created by JVM
Student(){
    name = "sam";
        System.out.println("I am called");
    }
//Parametrizes Constructor
    Student(String pname){
    this.name = pname;
        System.out.println("hi"+ pname);
    }

    void sleep(){
        System.out.println("who's is running "+ this.name);
    }
    void study(){}
    void eat(){}
}
