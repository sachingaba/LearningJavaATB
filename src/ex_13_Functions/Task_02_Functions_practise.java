package ex_13_Functions;

import java.util.Scanner;

public class Task_02_Functions_practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x = readInt(sc , "Enter 1");
        int y = readInt(sc , "Enter 2");

        //mathf(x,y);
        Calc ca = new Calc(x,y);
        ca.cal();
        System.out.println(ca.x);


    }
static int readInt(Scanner scan, String read){
    System.out.println(read);
    if(!scan.hasNext()){
        System.out.println("Enter Num only");
    }
    return scan.nextInt();
    }
    static void mathf(int a , int b){
        System.out.println("sum = " +  (a+b));
        System.out.println("sub = " +  (a-b));
    }
}
class Calc implements rema{
    public int x;
    public int y;
    public Calc(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void cal(){
        this.div();
        this.mul();
        this.sub();
        this.sum();
        this.rem();
        this.imain();

    }

   void sum(){
       System.out.println("sum = " +  (x+y));
   }
    void sub(){
        System.out.println("sub = " +  (x-y));
    }
    void mul(){
        System.out.println("mul = " +  (x*y));
    }
    void div(){
        System.out.println("div = " +  (x/y));
    }
    void rem(){
        System.out.println("rem = " +  (x%y));
    }

    @Override
    public void imain() {
        System.out.println("implementation");
    }
}
interface rema {
    void imain();
}
