package JavaPractise.AA_InterviewQuestions;

public class StringManipulations {
    public static void main(String[] args) {
        String s1 = "Sachin";
        s1.concat(" Tendulkar");

        System.out.println(s1);
        // it was not allocated again

         s1 = s1.concat(" Tendulkar");
        System.out.println(s1);
    }
}
