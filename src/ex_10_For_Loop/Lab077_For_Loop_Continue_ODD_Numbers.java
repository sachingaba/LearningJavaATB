package ex_10_For_Loop;

import java.util.Scanner;

public class Lab077_For_Loop_Continue_ODD_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int num = readInt(scan ,"Enter Num upto which I will show you even numbers");

        for (int i = 1; i <= num; i++) {
            if(i%2==0){
              continue;
            }else{
                System.out.println("ODD Num - > " + i);
            }

        }

    }
    static int readInt(Scanner scan , String prompt){
        System.out.println(prompt);
        if(!scan.hasNextInt()){
            System.out.println("Enter Num only");
        }
            return scan.nextInt();

    }
}
