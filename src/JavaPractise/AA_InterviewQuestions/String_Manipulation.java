package JavaPractise.AA_InterviewQuestions;

public class String_Manipulation {
    public static void main(String[] args) {
        String s1= "India is a beautiful country";
//🔸 Output: "Indi@ is @@ be@@@utiful country"
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i<s1.length();i++){
            if(s1.charAt(i)=='a'){
                int x =0;
                count++;
                while(x<count){
                    sb.append('@');
                    x++;
                }

            }else{
                sb.append(s1.charAt(i));
            }

        }
        System.out.println(sb);


    }
}
