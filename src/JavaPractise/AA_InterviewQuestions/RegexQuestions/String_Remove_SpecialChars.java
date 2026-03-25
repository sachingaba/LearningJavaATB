package JavaPractise.AA_InterviewQuestions.RegexQuestions;

public class String_Remove_SpecialChars {

    public static void main(String[] args) {
        String s1 = "Welcome@123";

        s1= s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);


        //for getting special char

        String s2 = "Welcome@123";
        s2 = s2.replaceAll("[0-9a-zA-Z]","");
        System.out.println(s2);
    }
}
