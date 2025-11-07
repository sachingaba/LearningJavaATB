package ex_23_Super_Abstraction.Abstraction;

public class Lab144_Bank {
    public static void main(String[] args) {
        System.out.println("------Manager : ------");
        Manager sachin = new Manager();
    sachin.permissions();

        System.out.println("------Clerk : ------");
    Clerk rahul = new Clerk();
    rahul.permissions();

        System.out.println("------King : ------");
    Security King = new Security();
    King.permissions();

    }
}
abstract class Bank{

    abstract void safe();
    abstract void maingate();
    abstract void profile();

}
class Clerk extends Bank{
     void permissions(){
     this.maingate();
     this.profile();
    }

    @Override
    void safe() {
        System.out.println("Clerk -- You are not allowed");
    }

    @Override
    void maingate() {
        System.out.println("Clerk -- You have access to lock/unlock main gate");
    }

    @Override
    void profile() {
        System.out.println("Clerk -- You have the access to user's profiles");
    }
}
class Manager extends Bank{
    void permissions(){
        this.maingate();
        this.safe();
        this.profile();
    }

    @Override
    void safe() {
        System.out.println("Manager -- You are Allowed");
    }

    @Override
    void maingate() {
        System.out.println("Manager - You have access to lock/unlock main gate");
    }

    @Override
    void profile() {
        System.out.println("Manager - You have the access to user's profiles");
    }
}
class Security extends Bank{
    void permissions(){
        this.maingate();

    }

    @Override
    void safe() {
        System.out.println("Security -- You are not Allowed");
    }

    @Override
    void maingate() {
        System.out.println("Security -- You have access to lock/unlock main gate");
    }

    @Override
    void profile() {
        System.out.println("Security -- You have NO access to user's profiles");
    }
}
