package ex_24_Static;

public class Lab148_Static_p2 {
    public static void main(String[] args) {
        ATB java25 = new ATB(787900, "Sachin gaba");
        java25.display();
    }
}
class ATB{
    int ph_no ;
    String name;
    static String course = "Java";

    public ATB(int ph_no, String name) {
        this.ph_no = ph_no;
        this.name = name;
    }
    static void Attendance(){
        System.out.println("Mark Attendance");
       // this.ph_no;  --> static can't call not static
    }

    //calling static variable in non-static function
    void display(){
        System.out.println(this.name + " " + this.ph_no + " " + course);
    }

}
