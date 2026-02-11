package JavaPractise.AA_InterviewQuestions;

public class LongestSubstringWithSameChar {
    public static void main(String[] args) {

        String s1 = "aaabcbccbbcbbcsbbbbbababaa";

        int max =0;
        String sub="";
        char[] ch = s1.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='1'){
                continue;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(ch[i]);
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                    sb.append(ch[j]);
                    ch[j]='1';

                }else{
                    break;
                }

            }
            if(max<sb.length()){
                max=sb.length();
                sub= sb.toString();
            }

        }
        System.out.println(sub);



    }
}
