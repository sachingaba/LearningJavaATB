package JavaPractise.AA_InterviewQuestions;

public class ReverseANumber {
    public static void main(String[] args) {
        int x = 12422115;
        String s1 = String.valueOf(x);
        for (int i = s1.length()-1; i >=0 ; i--) {
            System.out.print(s1.charAt(i));
        }
        System.out.println(" ");
        int rev =0;
        while(x%10>0){
            int rem = x%10;
            rev = rev*10 + rem;
            x = x/10;

        }
        System.out.println(rev);
    }
}
