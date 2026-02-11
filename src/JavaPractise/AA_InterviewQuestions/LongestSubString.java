package JavaPractise.AA_InterviewQuestions;

public class LongestSubString {
    public static void main(String[] args) {
        String s1 = "sachinGabaishereforyoutoteanchyouJava";

        char[] ch = s1.toCharArray();
        int max=0;
        String sub = "";
        for (int i = 0; i < ch.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(ch[i]);
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]!=ch[j]){
                    sb.append(ch[j]);
                }else{
                    break;
                }

            }
            if(max<sb.length()){
                max=sb.length();
               sub  = sb.toString();
            }

        }
        System.out.println(sub);

    }
}
