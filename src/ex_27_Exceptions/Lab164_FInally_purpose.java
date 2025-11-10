package ex_27_Exceptions;

import java.util.Scanner;

public class Lab164_FInally_purpose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            int v = scan.nextInt();
            int a = 10/v;
            System.out.println(a);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            scan.close();

        }

    }

}
