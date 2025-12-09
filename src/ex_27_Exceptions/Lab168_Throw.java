package ex_27_Exceptions;

import java.util.Scanner;

public class Lab168_Throw {
    public static void main(String[] args) throws CustomException {
        Scanner scan = new Scanner(System.in);

        if(!scan.next().equalsIgnoreCase("Sachin")){
         //   throw new CustomException("Bhagoooo");
            throw new ArithmeticException("HEheh");

        }
        System.gc();  // Garbage collector
    }
}
