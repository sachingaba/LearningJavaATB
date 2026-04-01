package JavaPractise.AA_InterviewQuestions;

public class String_Find_Target_InString_bb {

    public static void main(String[] args) {

        String s1 = "babbcbbcabbcabb";
//Output: Count of "bb"
String target = "bb";
int count=0;
        for (int i = 0; i+1 < s1.length(); i++) {
            if(s1.startsWith(target, i)){  // if (s1.substring(i, i + target.length()).equals(target)) {

                count++;
            }
        }

        System.out.println(count);


 //==============Second way==============
        char[] ch = s1.toCharArray();
        int count1 = 0;
        for(int i=0 ; i+1<ch.length;i++){
            if(ch[i]==ch[i+1] && ch[i]=='b'){
                count1++;
            }
        }




        System.out.println(count1);



    }
    }





