package JavaPractise.AA_InterviewQuestions;

public class String_LongestSubstring {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        String day = "automationTestingIsFunWhenYouRemoveFlakyTests123!@#Automation";

        char[] chday = day.toLowerCase().toCharArray();
        String subs = "";

        for(int i=0;i<chday.length-1;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(day.charAt(i));
            //  System.out.println("Here: "+ sb);
            for(int j=i+1;j<chday.length;j++){

                if(chday[i]!=chday[j]){
                    sb.append( day.charAt(j));
                    //   System.out.println(sb+ "");
                }else{
                    break;
                }


            }

            if(subs.length()<sb.length()){
                //  subs.length()=sb.length();
                subs = sb.toString();
            }


        }
        System.out.println(subs);
    }
}
