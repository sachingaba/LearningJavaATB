package JavaPractise;

import java.util.Scanner;

public class Custom_Exception_Implementation {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);

        try {
             validateAge(sc , "Enter your age");

        } catch (InvalidAgeException f) {
            System.out.println(f.getMessage());
        }

    }

    public static void validateAge(Scanner sc, String prompt) throws InvalidAgeException {
        System.out.println(prompt);
        int age = sc.nextInt();
        if (age < 18) {
            // Explicitly 'throw' an instance of the custom exception
            throw new InvalidAgeException("Age must be 18 or above. Provided age: " + age);
        } else {
            System.out.println("Age is valid: " + age);
        }

    }
}
