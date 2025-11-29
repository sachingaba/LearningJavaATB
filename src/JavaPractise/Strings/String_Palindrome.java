package JavaPractise.Strings;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        String s1 = "abcd";
      //  String s2 = "MADAM";

     //   char[] c1 = s1.toCharArray();
        String rev = "";
        for (int i = s1.length()-1; i >=0; i--) {
            rev = rev+s1.charAt(i);

        }
        System.out.println(rev);

        if(rev.equalsIgnoreCase(s1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.next();

        int i = input.length()-1;
        String rev2 = "";
        while(i>=0){
            rev2 = input.charAt(i) + rev2;
            i--;
        }
        System.out.println("Reverse of input: " + rev2);
        if(rev2.equalsIgnoreCase(input)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }

}
