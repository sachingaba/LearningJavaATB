package ex_06_Ternary_Operator;


import java.util.Scanner;

public class Lab040_TO_Nested {

    // Nested Ternary
// result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = age(scan, "Enter your age");
        String result = age > 18 ? (age >= 25 ? "yes You can Drink" : "Go but No Drink") : "No";
        System.out.println(result);
    }

    static int age(Scanner scan, String prompt) {
        System.out.println(prompt);
        // int input = scan.nextInt();
        if (!scan.hasNextInt()) {
            System.out.println("Enter No. only");
            System.out.println("Enter again");
            scan.nextInt();
            // System.exit(0);
        }
        return scan.nextInt();
    }
}
