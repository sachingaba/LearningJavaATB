package JavaPractise.AA_InterviewQuestions;

public class String_all_a_before_b {
    public static void main(String[] args) {
        String s1 = "aaabb"; //true
        String s2 = "abababa"; // false

        System.out.println(abCheck(s1));
        System.out.println(abCheck(s2));
    }
    static boolean abCheck(String s){
boolean result = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='b'){
                result = true;
            }
            else if( result && s.charAt(i)=='a'){
                return result = false;
            }
        }
        return true;
    }
}
