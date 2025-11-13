package ex_09_Switch;
import java.util.Scanner;

public class Lab056_Switch_Without_Case {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no.");
        int x = scanner.nextInt();

        switch (x){  // No default and case here
            case 1 :
                System.out.println("day 1");
                break;
            case 2 :
                System.out.println("day 2");
                break;

            default:
                System.out.println("you entered " + x + "No case match" );
        }


    }
}
