package JavaPractise.Static;

public class Static_keyword {
    public static void main(String[] args) {
        staticMethod a1 = new staticMethod("sachin");
        a1.member();
        System.out.println("---------------------------------------------------------");
        staticMethod a2 = new staticMethod("Gaba");

        staticMethod.details();
        System.out.println("calling static variables: from non static method "+ staticMethod.year + " " + staticMethod.course + " for: " + a2.name);
//final class object
        student s1 = new student();
        System.out.println(s1.loc);

// Updating static variables
        staticMethod.year = 2026;
        System.out.println("calling static variables: from non static method "+ staticMethod.year + " " + staticMethod.course + " for: " + a2.name);

    }
}
class staticMethod{
     String name;

    {
        System.out.println("I will come on each object creation");
    }
    static{
        System.out.println("Static --> Will come on class loading ");
    }

    static int year =  2025;
    static String course = "Java";

    public staticMethod(String name) {
   this.name = name;
    }


    static void details(){
        System.out.println("Year and Course : " + year + " "+ course);
    }

    void member(){
        System.out.println(name + " : you ara a member of : "+ course);
    }

}
final class student {
    String loc = "India";
}
