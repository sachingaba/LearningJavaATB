package JavaPractise.AA_InterviewQuestions;

public class Int_Limits
{
    public static void main(String[] args) {
        Integer x = 128;
        Integer y = 128;
        int a = 128;
        int b = 128;


        System.out.println("x==y? :" + (x==y));
        System.out.println("x==y? :" + (x.equals(y)));
        System.out.println("a==b? :" + (a==b));

        System.out.println(x);
        System.out.println(Integer.valueOf(x));
    }
}
