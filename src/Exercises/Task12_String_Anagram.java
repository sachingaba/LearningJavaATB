package Exercises;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task12_String_Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = readString(scanner , "Enter your first text");
        String s2 = readString(scanner , "Enter your second text");

        if(s1==null||s2==null){
            System.out.println("bad entry");
            System.exit(0);
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
       // System.out.println(s2);

        if(s1.length()!=s2.length()){
            System.out.println("Not an Anagram");
            System.exit(0);
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

   Arrays.sort(ch1);
     Arrays.sort(ch2);

       if(Arrays.equals(ch1,ch2)){
           System.out.println(s1 + " " + s2  + " are anagram");
       }else {
           System.out.println("NO anagram for IF");
       }

    }
    static String readString(Scanner scanner ,String prompt){
        System.out.println(prompt);
        return scanner.next();
    }
}
