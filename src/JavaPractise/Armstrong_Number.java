package JavaPractise;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println(Armstrong_check(scanner,  "Enter your Number"));

    }

static boolean Armstrong_check(Scanner scan , String Prompt) {
    System.out.println(Prompt);
    while(!scan.hasNextInt()){
        System.out.println("Enter num only");
    }
  int num = scan.nextInt();
        int arm = 0;
        int num_og = num;
    String count = Integer.toString(num);
    int length = count.length();

       /* while(num_og!=0){
            int remainder = num_og%10;
            arm = arm +remainder*remainder*remainder;
            num_og = num_og/10;
        }*/
    while(num_og!=0) {
        int remainder = num_og%10;
        arm = (int) (arm + Math.pow(remainder,length));
        num_og = num_og/10;

    }
    System.out.println("sum of all the numbers : " + arm);
        return num== arm;
    }

}