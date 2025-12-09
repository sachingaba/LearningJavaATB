package JavaPractise.Exception;

import java.util.Scanner;

public class Exception_Practise2 {
    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");*/
        String gg = null;

        try {
            gg.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(gg);
        }






    }
}
