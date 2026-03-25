package JavaPractise.AA_InterviewQuestions.RegexQuestions;

public class String_First_Non_Repeating {

    public static void main(String[] args) {
        String s1 = "tests";

        for(char c:s1.toCharArray()){
            if(s1.indexOf(c)==s1.lastIndexOf(c)){
                System.out.println("Not Duplicate:" + c);
                break;
            }
        }
    }
}
