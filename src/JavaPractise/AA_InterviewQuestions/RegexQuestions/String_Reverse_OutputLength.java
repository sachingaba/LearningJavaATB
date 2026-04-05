package JavaPractise.AA_InterviewQuestions.RegexQuestions;

public class String_Reverse_OutputLength {
    public static void main(String[] args) {
        String s1 = "Test Automation";

        //Output == noit amotuAtesT

        s1 = s1.replaceAll(" ","");

        System.out.println(s1);

        StringBuilder sb = new StringBuilder(s1).reverse();
        System.out.println(sb);

        String result = sb.substring(0,4)+" "+sb.substring(4);
        System.out.println(result);
        System.out.println(sb.substring(1,3));

        //2nd Way
        String s2 =s1.replaceAll("[' ]","");
        System.out.println(s2);

        String test = "i am the king";
        String test2 = test.replaceAll("[\\s+]","");
        System.out.println(test2);
    }
}
