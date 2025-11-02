package Exercises;

import java.util.Scanner;

public class Task27_Website_Domain_type {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String web = readUser(scan , "Enter the website link");
//.com, .org, .edu,
        if (web.contains(".com")){
            System.out.println("its a com website");
        }else if (web.contains(".org"))
        {
            System.out.println("its a org website");
        }
        else if (web.contains(".edu")) {
            System.out.println("its a edu website");
        }
        else if (web.contains(".xyz") ){
            System.out.println("its a xyz website");
        }
        else
        {
            System.out.println("I cant read it");
        }
    }


    static String readUser(Scanner scan , String prompt){
        System.out.println(prompt);

    return scan.next();
    }

}

