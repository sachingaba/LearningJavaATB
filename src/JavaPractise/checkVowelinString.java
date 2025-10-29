package JavaPractise;

import java.util.Scanner;

public class checkVowelinString {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String x= readInt(scanner,"Enter your text");
         boolean b = checkVC(x);
         if(b==true){
             System.out.println("vowel is there");
         }else {
             System.out.println("NO vowel");
         }
           // System.out.println(b);

        }
        static String readInt(Scanner scanner ,String prompt) {
            System.out.println(prompt);

                return scanner.next();

        }


        static boolean checkVC(String x){
            for (int i=0;i<x.length();i++){
                char ch = x.toLowerCase().charAt(i);
                if (ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                   // System.out.println("Contains vowel");
                   return true;
                }

            }

           return false;
        }
    }


