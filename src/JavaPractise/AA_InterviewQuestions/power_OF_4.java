package JavaPractise.AA_InterviewQuestions;

import java.util.Scanner;

public class power_OF_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int x = scanner.nextInt();

        while(x%4==0){
            x=x/4;
        }

        System.out.println(x==1);
    }
}
