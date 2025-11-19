package JavaPractise;

public class Student_Management_System {
    public static void main(String[] args) {
        Student s1 = new Student("Bob",101, 'A');
        System.out.println(s1);
    }
}

 class Student{
    String name;
    int roll_num;
    char section;

     public Student(String name, int roll_num, char section) {
         this.name = name;
         this.roll_num = roll_num;
         this.section = section;
     }

     @Override
     public String toString() {
         return "Student: " +
                  name +
                 ", Roll No:" + roll_num +
                 ", Section:" + section +
                 ' ';
     }
 }
