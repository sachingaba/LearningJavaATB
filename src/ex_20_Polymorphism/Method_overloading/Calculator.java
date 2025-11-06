package ex_20_Polymorphism.Method_overloading;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        calc c1 = new calc();
        c1.add(3.5,4.5);
        c1.add(3,4,5);
        System.out.println(c1);
        System.out.println("scan function used");
        calc c2 = new calc();
        c2.add(scanner.nextInt(), scanner.nextInt());
        System.out.println(c2);
    }
}
class calc{
    int add(int a, int b){
        System.out.println("Int called");
        return a+b;
    }
    int add(int a, int b,int c){
        System.out.println("Int called");
        return a+b+c;
    }
    double add(double a, double b){
        System.out.println("double called");
        return a+b;
    }
    long add(long a,long b){
        System.out.println("Long called");
        return a+b;
    }
}