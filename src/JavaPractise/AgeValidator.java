package JavaPractise;


    public class AgeValidator {

        // Method to validate age that declares it 'throws' the custom exception
        public static void validateAge(int age) throws InvalidAgeException {
            if (age < 18) {
                // Explicitly 'throw' an instance of the custom exception
                throw new InvalidAgeException("Age must be 18 or above. Provided age: " + age);
            } else {
                System.out.println("Age is valid: " + age);
            }
        }

        public static void main(String[] args) {

            // Example 1: Invalid Age
            try {
                validateAge(15);
            } catch (InvalidAgeException e) {
                // Catch the custom exception and print its message
                System.out.println(e.getMessage());
            }

            // Example 2: Valid Age
            try {
                validateAge(25);
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }


