package JavaPractise.AA_InterviewQuestions.RegexQuestions;

public class String_Replace_Characters_In_String {
    public static void main(String[] args) {
        String s1 = "Managementementment";

        s1 = s1.replace("ement", "er");
        System.out.println(s1);

        String s2 = "Apple";

        s2 = s2.replace("p", "z");
        System.out.println(s2);

        String s3 = "cloud";

        s3 = s3.replace("u", "");
        System.out.println(s3);
    }
}
