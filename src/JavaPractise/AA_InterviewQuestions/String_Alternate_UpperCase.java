package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class String_Alternate_UpperCase {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        String s1= "jAvA";

        char[] ch = s1.toCharArray();

        for(int i =0;i<ch.length;i++){
            if(i % 2 == 0){
              ch[i]=  Character.toUpperCase(ch[i]);
            }else{
               ch[i]= Character.toLowerCase(ch[i]);
            }
        }
        System.out.println(Arrays.toString(ch));
    }
}
