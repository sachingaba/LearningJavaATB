package JavaPractise.AA_InterviewQuestions;

import java.util.LinkedList;
import java.util.List;

public class SumOfAllPrimeNum {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for (int i = 2; i < n; i++) {

            if( isPrime(i)){
                sum += i;
            }


        }
        System.out.println(sum);





        System.out.println("Total Sum: "+sum);
}
public static boolean isPrime(int x) {


    for (int j = 2; j * j <= x; j++) {
        if (x % j == 0) {
            System.out.println("not prime: " + x);
            return false;

        }


    }
    return true;
}





    }

