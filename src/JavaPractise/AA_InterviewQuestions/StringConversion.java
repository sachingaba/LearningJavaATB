package JavaPractise.AA_InterviewQuestions;

public class StringConversion {
    public static void main(String[] args) {
        String input = "My name is so and so";
        String result = "{" + input.replace(" ", "-") + "}";
// Output: {My-name-is-so-and-so}

        System.out.println(input);
        System.out.println(result);
    }
}
