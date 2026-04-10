package JavaPractise.AA_InterviewQuestions.RegexQuestions;

import java.util.stream.Stream;

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

//===========2nd Way=======================

        String s = "Testing Automation Mechanism";
        String[] sArray = s.split(" ");

        String s2 = s.replaceAll(" ","");
        int length = sArray[0].length();
        int length2 = sArray[1].length();
        String rev = Stream.of(s2.split("")).reduce("",(a, b)->b+a);
       // System.out.println(rev);
        System.out.println(rev.substring(0,length)+" "+rev.substring(length,length+length2)+" "+ rev.substring(length+length2));


        int len = 0;
        String news="";
        int initial = 0;
        for(String k : sArray){
            len = len+ k.length();
            news = news+ rev.substring(initial,len)+ " ";
            initial = len;

        }
        System.out.println(news);
    }
}

