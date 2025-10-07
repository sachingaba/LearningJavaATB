package ex_15_StringBuffer_StringBuilder_StringFunctions;

import java.util.Scanner;

public class Task01_Count_The_No_Of_Words_In_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");
        String sr = scanner.nextLine();
        String[] count = sr.split(" ");

        // Count number of words

        System.out.println("total count of words are" + count.length);
       // System.out.println(count[0]);

        // first alphabet of each word in string


        for (int i=0 ; i<count.length;  i++){
            System.out.println(count[i].charAt(0));
        }


        //}
    }
}

