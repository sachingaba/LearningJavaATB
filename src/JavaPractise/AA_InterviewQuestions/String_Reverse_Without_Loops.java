package JavaPractise.AA_InterviewQuestions;

public class String_Reverse_Without_Loops {

    public static void main(String[] args) {
        String s = "WelcomeBack";
        String sb = "WelcomeBack";
        String rev = "";
        while(!sb.isEmpty()) {
            rev = sb.charAt(0) + rev;
            sb = sb.substring(1);

        }

        System.out.println(rev);
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        String s2 = "";
        while (!s.isEmpty()) {
            s2 =  s.charAt(0)+s2;
            s = (s.substring(1)) ;

        }
        return s2;
    }
}
