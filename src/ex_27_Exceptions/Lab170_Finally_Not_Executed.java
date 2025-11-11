package ex_27_Exceptions;

import java.sql.SQLOutput;

public class Lab170_Finally_Not_Executed {
    public static void main(String[] args) {
        try {
            int a= 10/0;
            System.out.println("try Executed");
            System.exit(0); // To stop the program to further running
        } catch (Exception e) {
            System.out.println("Catch Executed " + e.getMessage());
            System.exit(0); // To stop the program to further running
            throw new RuntimeException(e.getMessage());

        } finally {
            System.out.println("Finalyy -- I will always run");
        }

    }
}
