package JavaPractise;

import java.util.Arrays;
import java.util.Scanner;

public class Anangram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1");
        String str1 = scan.next();
        System.out.println("Enter 2");
        String str2 = scan.next();

       if( anangram(str1, str2)){
           System.out.println("yes");
       }else {
           System.out.println("No");
       }
    }
    static boolean anangram(String str1 , String str2){

        if((str1==null) ||( str2==null)){
            return false;
        }
        if(str1.isEmpty() && str2.isEmpty()){
            return true;
        }

        String s1 = str1.replaceFirst("\\s","").toLowerCase();
        String s2 = str2.replaceFirst("\\s","").toLowerCase();

        if(s1.length()!=s2.length()){
            return false;
        }

         char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

       /* Arrays.sort(c1);
        System.out.println(c1);
        Arrays.sort(c2);
        System.out.println(c2);*/

        return Arrays.equals(c1,c2);



    }

}
