package ex_24_Static;

public class Lab150_ATB14x {
    public static void main(String[] args) {
        java j1 = new java();
        j1.getName();
        j1.setName("Sachin");
        j1.setPhone("64546");
        System.out.println(j1.getName());
        System.out.println(j1.getPhone());
        j1.readDoc();
         java.course = " java gaba"; // To update the Static variable value
        java j2 = new java();
        j2.readDoc();
    }
}
class java{
    {
        System.out.println("IIB - Default run on object creation");
    }
    static{
        System.out.println("this is SIB when class is loaded");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name;
    private String phone;

    static String course = "Java main";

    void readDoc(){
        System.out.println("Non- Static method");
        System.out.println(course);  // accessing static variable
    }
}