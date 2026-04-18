package JavaPractise.AA_InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class String_LongestSubstring {
    public static void main(String[] args) {
       // System.out.println("Try programiz.pro");

        String day = "AutomationTestingIsFunWhenYouRemoveFlakyTestsAutomation";

        char[] chday = day.toLowerCase().toCharArray();

        String subs = "";

        for(int i=0;i<chday.length-1;i++){
            StringBuilder sb = new StringBuilder();
            Set<Character> set  = new HashSet<>();
            for (int j = i; j <chday.length ; j++) {

                if (!set.contains(chday[j])) {
                    set.add(chday[j]);
                    sb.append(chday[j]);
                } else {
                    break;
                }
            }

            if(subs.length()<sb.length()){
                //  subs.length()=sb.length();
                subs = sb.toString();
                System.out.println(subs);
            }


        }
        System.out.println("Final result: "+subs);
    }
}
