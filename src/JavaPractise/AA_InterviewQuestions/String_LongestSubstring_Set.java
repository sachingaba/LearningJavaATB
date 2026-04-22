package JavaPractise.AA_InterviewQuestions;

import java.util.*;

public class String_LongestSubstring_Set {

    public static void main(String[] args) {
        String s1 = "mynameissachin";

        int left=0;
        int right=0;
        int maxlength=0;
        String maxStr ="";
Map<String ,Integer> map = new LinkedHashMap<>();


        Set<Character> set = new LinkedHashSet<>();

        while(right<s1.length()){
            char c = s1.charAt(right);

            while(set.contains(c)){
                set.remove(s1.charAt(left));
                left++;

            }
            set.add(c);

            int length = right-left+1;
            if(length>maxlength){
                maxlength=length;
                maxStr = s1.substring(left,right+1);
               map.put(maxStr,maxlength);
            }

right++;




        }
        System.out.println("Final: "+maxStr);
        System.out.println(map);
        System.out.println(Collections.max(map.values()));
       for(Map.Entry<String, Integer> entry:map.entrySet()){
           if(Objects.equals(entry.getValue(), Collections.max(map.values()))){
               System.out.println(entry.getKey());
           }
       }


    }
}
