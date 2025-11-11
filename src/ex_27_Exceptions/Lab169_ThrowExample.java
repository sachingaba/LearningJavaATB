package ex_27_Exceptions;

import java.util.Scanner;

public class Lab169_ThrowExample {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // ageGoa(scan,"Enter your age");
        ageGoa1(scan,"Enter your age");





    }
    static void ageGoa(Scanner scan,String prompt) throws Exception {
        System.out.println(prompt);
        if (!scan.hasNextInt())
        {
            System.out.println("Enter num only");
        } else if(scan.nextInt()<25 ){
            throw new Exception("Age cant be less than 25");

        }else{
            System.out.println("Allowed  --  Enjoy!!");
        }
    }
    static void ageGoa1(Scanner scan,String prompt) {
        System.out.println(prompt);
        if (!scan.hasNextInt())
        {
            System.out.println("Enter num only");
        } else if(scan.nextInt()<25 ){
            try {
                throw new Exception("Age cant be less than 25");
            } catch (Exception e) {
                System.out.println("AGE ISSUE");
                throw new RuntimeException(e);
            }

        }else{
            System.out.println("Allowed  --  Enjoy!!");
        }
    }
}
