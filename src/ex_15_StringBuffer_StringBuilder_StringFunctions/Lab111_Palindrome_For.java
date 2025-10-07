package ex_15_StringBuffer_StringBuilder_StringFunctions;

import java.util.Scanner;

public class Lab111_Palindrome_For {
    public static void main(String[] args) {
        // madam -> reverse -> madam
        // radar -> radar
        // user_input = reverse of user_input

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text");
        String User_Input = scan.next();

        String reverse =  "";

       /* for (int i = User_Input.length()-1; i >=0; i--) {
            reverse = reverse + User_Input.charAt(i);

        }
        System.out.println("Reverse of your input is " + reverse);*/

        int i= User_Input.length()-1;
        while(i>=0){
            reverse = reverse + User_Input.charAt(i);
            i--;
        }System.out.println("Reverse of your input is " + reverse);

        if (reverse.equalsIgnoreCase(User_Input)) {
            System.out.println("Palindrome");

        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
