package JavaPractise.AA_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_Group_Anagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();

        for(int i = 0;i<strs.length;i++){
            if(lists.contains(strs[i])){
                continue;
            }
            List<String> list = new ArrayList<>();
            // list.add(strs[i]);
            for(int j = i;j<strs.length;j++){
                if(isAnagram(strs[i],strs[j])){
                    list.add(strs[j]);
                  //  strs[j]=" ";
                }
                System.out.println(list);
            }
            lists.add(list);

        }
        System.out.println(lists);
        return lists;
    }
    public static boolean isAnagram(String s , String y){

        char[] a = s.toCharArray();
        char[] b = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
            return true;
        }

        return false;
    }

public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
    System.out.println(groupAnagrams(strs));

}
}
