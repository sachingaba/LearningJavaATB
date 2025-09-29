package ex_08_If_Condition;
import java.util.Scanner;

public class Lab053_If_ElseIf_Else {

    public static void main(String[] args) {
       // int age = 34;
        System.out.println("enter age");
        Scanner age1 = new Scanner(System.in);


        int age = age1.nextInt();
        if (age > 15){
            System.out.println("age>15");
        } else if(age < 15) {
            System.out.println("age<15");
        } else {
            System.out.println("age=15");
        }

    }
}
