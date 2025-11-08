package ex_24_Static;

public class Lab147_Static {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(25);
        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(Student.course);
        //or
        System.out.println(s1.course);
      Student.m1();

    }
}
 class Student{
int age; // Non-static or instance variable or attribute
     static String course = "JAVA";


     public Student(int age) {
         this.age = age;
     }
     static void m1(){
         System.out.println("I am a Static method");
     }
 }

