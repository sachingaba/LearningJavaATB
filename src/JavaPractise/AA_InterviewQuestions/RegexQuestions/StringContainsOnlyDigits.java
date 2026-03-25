package JavaPractise.AA_InterviewQuestions.RegexQuestions;

public class StringContainsOnlyDigits {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s1 = "123";
        String s2 = "123a";
//check if String contains only digits
        boolean bol = s1.matches("^[0-9]+$");
        boolean bol2 = s2.matches("^[0-9]+$");

        System.out.println("bol1: " + bol);
        System.out.println("bol2: " + bol2);

        String s3 = "Java25";
        boolean bol3 = s3.matches("^[a-zA-Z]");
        System.out.println(bol3);
    }
}
