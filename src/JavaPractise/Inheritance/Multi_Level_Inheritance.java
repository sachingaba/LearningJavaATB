package JavaPractise.Inheritance;

public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        security raj = new security("Raj");
        manager ankit = new manager("Ankit",39);
        clerk sach = new clerk("Sach",34);

        System.out.println(sach+ " ---------------->Can access : ");
        sach.role3();
        sach.roles();


        System.out.println(ankit+ " ----------------->Can access : ");
        ankit.role();
        ankit.role3();
        ankit.roles();
        ankit.sal();

        System.out.println(raj+ " ----------------->Can access : ");
     //   raj.role();
        raj.role3();
    //    raj.roles();
        System.out.println(security.saly);


    }
}
class security{

    String name;
   static int saly = 45000;
    security(String name){
        this.name = name;
    }
    void role3(){
        System.out.println("Security's role");
    }

    void sal(){

        System.out.println("Salary of security: " + saly);
    }

    @Override
    public String toString() {
        return "security{" +
                "name='" + name + '\'' +
                ", saly=" + saly +
                '}';
    }
}
class clerk extends security{
    String name ;
    int age;

    clerk(String name, int age){
        super(name);
this.age = age;
        this.name = name;
    }
    void roles(){
        System.out.println("Clerk Role");
    }

    @Override
    public String toString() {
        return "clerk{" +
                "name='" + name + '\'' +
                ", head name='" + name + '\'' +
                '}';
    }
}
class manager extends clerk{
    String name;
    int age;

    manager(String name,int age){
        super(name,age);
        this.name = name;
        this.age = age;
    }
    void role(){
        System.out.println("Manager's");

    }

    @Override
    public String toString() {
        return "manager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
