package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class String_2nd_most_Repeated {
    public static void main(String[] args) {
        String s1 = "heisanamazingperson";

        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
        int max=0;
        int max2=0;
        char character1 =' ';
        char character2 = ' ';


        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                continue;
            }
            int count=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j] ='1';
                }
            }
            if(count>=max){
                max2 = max;
                max = count;
                character2= character1;
                character1 = ch[i];
            }



        }
        System.out.println(character1+" " +max);
        System.out.println(character2+" " +max2);

    }
}
