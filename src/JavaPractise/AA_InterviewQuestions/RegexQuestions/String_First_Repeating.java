package JavaPractise.AA_InterviewQuestions.RegexQuestions;

public class String_First_Repeating {
    public static void main(String[] args) {
        String s1 = "teamofinfosys";

        for(char c:s1.toCharArray()){
            if(s1.indexOf(c)!=s1.lastIndexOf(c)){
                System.out.println("Duplicate:" + c);
                break;
            }
        }
    }
}
