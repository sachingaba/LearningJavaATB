package JavaPractise.Method_Overloading;

public class No_Return_With_Parameters {
    public static void main(String[] args) {
     work(5);
     work("Coding");
    }
    static void work(String whichtask){
        System.out.println("your task is: " + whichtask);
    }
    static void work(int x){
        System.out.println("Do " + x + " Meetings");
    }
}
