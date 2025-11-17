package ex_19_OOps_Part2.OOPs_01_Inheritance.Hierarchical.Practise;

import java.util.Scanner;

public class Vatika  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("toString here");
        E5Home one7 = new E5Home("Sachin", "17 2nd");

        //System.out.println(one7.toString());
       one7.Street();
        System.out.println(one7.name);

     E5Home one8 = new E5Home("Rahul", "254");
        System.out.println("Enter your units to check the bill");
        int unit = scan.nextInt();
       one8.elec(unit);
    }
}
