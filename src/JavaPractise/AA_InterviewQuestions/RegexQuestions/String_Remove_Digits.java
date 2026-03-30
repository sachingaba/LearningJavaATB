package JavaPractise.AA_InterviewQuestions.RegexQuestions;

public class String_Remove_Digits {
    public static void main(String[] args) {

        String s1 = "Sac25hin1234c";

         s1 = s1.replaceAll("[0-9]+","c");
        System.out.println(s1);

        String s2 = "Sachin1234e";

        s2 =s2.replaceAll("[^a-zA-Z]","");
        System.out.println(s2);
    }
}
