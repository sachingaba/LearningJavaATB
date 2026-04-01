package JavaPractise.AA_InterviewQuestions.RegexQuestions;

public class String_Last_Non_Repeating {
    public static void main(String[] args) {
        String s1 = "teamofinfosysi";
        char lastDuplicate = ' ';
        for (char c : s1.toCharArray()) {
            if (s1.indexOf(c) != s1.lastIndexOf(c)) {
                lastDuplicate = c;

            }
        }
        System.out.println(lastDuplicate);
    }
}
