package ex_17_OOPs;

public class Lab127_Constructors {
    public static void main(String[] args) {


        Student sachin = new Student();
        Student s1 = new Student(" Sachin");
    }
}

class Student{
String name;
// Default Constructor created by JVM
Student(){
        System.out.println("I am called");
    }
//Parametrizes Constructor
    Student(String name){
        System.out.println("hi"+ name);
    }

    void sleep(){}
    void study(){}
    void eat(){}
}
