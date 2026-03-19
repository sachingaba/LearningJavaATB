package JavaPractise.AA_InterviewQuestions;

import java.util.Random;
import java.util.Scanner;

public class Game_NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);

        Random random = new Random();
        int randomGuess = random.nextInt(1010);
      //  System.out.println(randomGuess);
        int x ;

        int count = 0;
        while(true){
            if(!scanner.hasNextInt()){
                System.out.println("Enter No. Only");
                scanner.nextInt();
                continue;
            }


           x = scanner.nextInt();
            count++;


            if(x<randomGuess){
                System.out.println("Higher - attempt: "+ count);


            }else if(x>randomGuess){
                System.out.println("Lower - attempt: "+ count);

            }else{


                System.out.println("You nailed it !! IN: " + count);
                break;
            }

        }


    }
}
