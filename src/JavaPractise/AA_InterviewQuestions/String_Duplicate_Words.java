package JavaPractise.AA_InterviewQuestions;

public class String_Duplicate_Words {
    public static void main(String[] args) {

        String s1 = "my name is sachin is hello all";
        for( String s : s1.split(" ")){
            if(s1.equals(" ") || s1.indexOf(s)!=s1.lastIndexOf(s)){
                System.out.println(s);
               s1= s1.replace(s, " ");
                System.out.println(s1);
                break;
            }
            }






    }
}
