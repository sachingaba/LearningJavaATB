package JavaPractise.AA_InterviewQuestions;

public class Swap_Two_Variables {
    public static void main(String[] args) {

        int a = 12;
        int b = 16;

         a = b+a; //28
         b = a-b; //28-16=12
         a = a-b; //28-12=16

        System.out.println(a+" "+b);

        String c = "Sachin";
        String d = "Gaba";

        c= c.concat(d); //SachinGaba

        d = c.substring(0,c.length()-d.length());

        c = c.substring(d.length());

        System.out.println(c + " " + d);



    }
}
