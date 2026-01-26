package HackerRank_Practise;

import java.util.Scanner;



public class String_code {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);

            String s1 = scanner.next();
            while(s1.length()<=15){
              s1=  s1.concat(" ");
            }
           // String code ="";
            String i1 = scanner.next();
            while(i1.length()<3){
                i1 = "0".concat(i1);
            }
            String s2 = scanner.next();
            while(s2.length()<=15){
                s2 =  s2.concat(" ");
            }
            // String code ="";
            String i2 = scanner.next();
            while(i2.length()<3){
                i2 = "0".concat(i2);
            }
            String s3 = scanner.next();
            while(s3.length()<=15){
                s3 =  s3.concat(" ");
            }
            // String code ="";
            String i3 = scanner.next();
            while(i3.length()<3){
                i3 = "0".concat(i3);
            }
            System.out.println("================================");
            System.out.println(s1 + i1);

            System.out.println(s2 + i2);

            System.out.println(s3 + i3);

            System.out.println("================================");
        }

    }

