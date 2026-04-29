package JavaPractise.AA_InterviewQuestions;

public class String_Pangram {

    public static void main(String[] args) {
        String s1 = "the quick brown fox jumps over the lazy dog";

        if(s1.length() <26){
            System.out.println("False");

    }else {
            for (char i = 'a'; i <= 'z'; i++) {
                if (s1.indexOf(i) < 0) {
                    System.out.println("here false");
                    System.exit(0);
                }
            }
        }
        System.out.println("True");
    }
}
