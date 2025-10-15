package JavaPractise;

import java.util.Scanner;

public class P04_Vowel_Check_in_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1 = readtext(scan,"Please enter the String");

        System.out.println(vowel(s1));


    }static String readtext(Scanner scan, String prompt){
        System.out.println(prompt);
        return scan.next();
    }


    static boolean vowel(String s1) {


        for (int i = 0; i < s1.length(); i++) {
            char sk = s1.charAt(i);


            if (sk == 'a' || sk == 'e' || sk == 'i' || sk == 'o' || sk == 'u') {
                System.out.println("contains vowel");
                return true;
            }


            }
        return false;
        }
    }





