package JavaPractise.AA_InterviewQuestions;


import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Array_Target_Way2 {
    public static void main(String[] args) {


        int[] arr = {6,8,11,6,9,18,1,16,6,-1};

        int target = 17;

        System.out.println("----Set way----");
        HashSet<Integer> set = new HashSet<>();

      for(int num: arr){
          if(set.contains(target-num)){
              System.out.println(num + " " + (target-num));
          }else{
              set.add(num);
          }
      }

      //for positions of nums
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],i);
          if(map.containsValue(target-arr[i])) {
              System.out.println(i + ":" + map.get(target - arr[i]));
          }

          }

        System.out.println(map
        );


    }
}