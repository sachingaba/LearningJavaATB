package JavaPractise;

import java.util.Scanner;

public class P03_Palindrome_check {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your text");
        String s1 = scan.next();

        int s = s1.length();
        String k = "";

            for (int i = s - 1; i >= 0; i--) {
                k = k + s1.charAt(i);
            }
            System.out.println(k);
            if (k.equalsIgnoreCase(s1)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }/*static String readtext(Scanner scan , String prompt){
        System.out.println(prompt);
        if(scan.hasNext()){
            return String.valueOf(scan.hasNext());
        }else {


            System.out.println("please enter text only");
            System.exit(0);
            return "a";
        }*/



