package ex_27_Exceptions;

public class Lab163_Try_Catch_Finally {
    public static void main(String[] args) {
        int a = 10;
        int c=05;

        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always execute");
        }
        System.out.println(c);


    }
}
