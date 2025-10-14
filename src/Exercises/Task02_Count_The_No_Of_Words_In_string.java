package Exercises;

import java.util.Scanner;

public class Task02_Count_The_No_Of_Words_In_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");
        String sr = scanner.nextLine();
        String[] count = sr.split(" ");
        System.out.println(count.length);
        // Count number of words
        System.out.println(sr);
        System.out.println("Total count of words are " + count.length);
       // System.out.println(count[0]);

        // first alphabet of each word in string

        // First way
        for (int i=0 ; i<count.length;  i++){
            System.out.print(count[i].charAt(0) + " ");
        }
        System.out.println("");
        // 2nd way

        for (String firstletter : count){
            System.out.println(firstletter.toUpperCase().charAt(0));
        }


        //}
    }
}

