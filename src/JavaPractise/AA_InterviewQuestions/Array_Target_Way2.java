package JavaPractise.AA_InterviewQuestions;


import java.util.*;

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
             // System.out.println(Arrays.toString(set.toArray()));
          }
      }

      //for positions of nums - LIST
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i <arr.length ; i++) {
            list.add(arr[i]);
          if(list.contains(target-arr[i])) {
              System.out.println(i + ":" + list.indexOf((target - arr[i])));
              System.out.println(arr[i] + "+" + (target - arr[i]));
          }

          }

        System.out.println(list);
//for positions of nums - Map
Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],i);
            if(map.containsKey(target-arr[i])) {
                System.out.println(i + ":" + map.get((target - arr[i])));

            }

        }
        System.out.println(map);
    }
}