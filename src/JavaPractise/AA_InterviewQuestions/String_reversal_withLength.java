package JavaPractise.AA_InterviewQuestions;

public class String_reversal_withLength {

    public static void main(String[] args) {
        String s1 = "Test Automation";
        //Output : noit amotuAtesT

        String[] arr = s1.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length() - 1; i
                >= 0; i--) {
            if(s1.charAt(i)==' '){
                continue;
            }else {
                sb.append(s1.charAt(i));

            }        }
        System.out.println(sb);

        String rev = sb.substring(0,4)+" "+sb.substring(4);
        System.out.println(rev);

       // ==========================================================================//===================================
StringBuilder result = new StringBuilder();
int initial = 0;
int len = 0;
for(String s : s1.split(" ")){
    len += s.length();
    String word = sb.substring(initial , len);
    initial = len;
    result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
}
        System.out.println(result);
    }

}

