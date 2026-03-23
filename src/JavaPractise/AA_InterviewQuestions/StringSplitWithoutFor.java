package JavaPractise.AA_InterviewQuestions;

public class StringSplitWithoutFor {

    public static void main(String[] args) {
        String s = "WelcomeToInfosys@123";

        String chars = s.replaceAll("[^a-zA-z]","");
        String digits = s.replaceAll("[^0-9]","");
        String spec = s.replaceAll("[a-zA-Z0-9]","");

        System.out.println(chars+"-"+digits+"-"+spec);

    }
}
