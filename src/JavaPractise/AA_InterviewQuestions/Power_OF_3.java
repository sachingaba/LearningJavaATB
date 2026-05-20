package JavaPractise.AA_InterviewQuestions;

import java.util.Scanner;

public class Power_OF_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int x = scanner.nextInt();

        while(x%3==0){
                x =x/3;
            }

        if(x==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
