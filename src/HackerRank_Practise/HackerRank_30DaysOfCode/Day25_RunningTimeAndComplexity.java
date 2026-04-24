package HackerRank_Practise.HackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day25_RunningTimeAndComplexity {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no.of test cases");
        if(scanner.hasNextInt()){
            int testCases = scanner.nextInt();

            for (int j = 0; j < testCases; j++) {
                System.out.println("Enter Num: ");
                if(scanner.hasNextInt()){            int num = scanner.nextInt();
                    if(isPrime(num)){
                        System.out.println("Prime");
                    }else{
                        System.out.println("Not prime");
                    }

                }

            }
        }
    }
    public static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        for(int i= 2 ; i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;

    }


}
