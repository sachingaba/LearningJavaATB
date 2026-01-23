package JavaPractise.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Removing_First_Duplicate {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       firstDuplictate(scanner,"Enter your String value: ");


    }
    public static void firstDuplictate(Scanner scan, String prompt){
        System.out.println(prompt);

        char[] ch = scan.next().toCharArray();

       outer: for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                  //  System.out.println("Duplicate: " + ch[i]);
                    ch[j]=' ';
                    break outer;
                }


            }

        }
        System.out.println("Convert to Sttring: ");
       StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                s1.append(ch[i]);
            }
        }
        System.out.println(s1.toString());



        }


    }
