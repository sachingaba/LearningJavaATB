package JavaPractise.Strings;

import java.util.Scanner;

public class Removing_Last_Duplicate {
    public static void main(String[] args) {
lastDuplicate(new Scanner(System.in),"enter your text: ");
    }
    static void lastDuplicate(Scanner scan,  String prompt){
        System.out.println(prompt);
        char[] ch = scan.next().toCharArray();

     outer:   for (int i = ch.length-1; i >0; i--) {
         for (int j = i - 1; j >= 0; j--) {
             if (ch[i] == ch[j]) {
                 System.out.println("Last Duplicate:" + ch[i]);
                 ch[j] = ' ';
                 break outer;
             }

         }
     }
         System.out.println("Convert to Sttring: ");
         StringBuilder s1 = new StringBuilder();
         for (int i = ch.length-1; i >=0; i--) {
             if (ch[i] != ' ') {
                 s1.append(ch[i]);
             }
         }
         System.out.println(s1.toString());
        }
    }
