package ex_23_Super_Abstraction.Abstraction;

public class Abstraction_practise {
    public static void main(String[] args) {

        automation sachin = new sachin("sachin","admin@123");
        sachin.hi();

            }
        }

abstract  class automation{
 String username;
 String password;

    public automation(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void auto(){
        System.out.println("Automation auto method");
    }
    abstract void abs();

    public void hi() {
    }
}
class sachin extends automation implements ids,access{
  
    public void hi(){
        this.abs();
        this.id();
        this.Act();
        super.auto();
    }

    public sachin(String username, String password) {
        super(username, password);
    }
   
    @Override
    void abs() {
        System.out.println("I have completed this method");
    }

    @Override
    public void Act() {
        System.out.println("complete act");
    }

    @Override
    public void id() {
        System.out.println("complete ids");

    }
  
}
interface ids{
    void id();

}
interface access{
    void Act();
}