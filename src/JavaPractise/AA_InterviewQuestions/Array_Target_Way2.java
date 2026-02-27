package JavaPractise.AA_InterviewQuestions;


import java.util.HashSet;

public class Array_Target_Way2 {
    public static void main(String[] args) {

//this is not a good way
        int[] arr = {6,8,11,6,9,18,1,16,6,-1};

        int target = 17;

        int start = 0;
        int end = arr.length - 1;

      while(end>start) {
            if (arr[start] + arr[end] == target) {
                System.out.println(arr[start] + " " + arr[end]);
start++;
            } else if (arr[start] + arr[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println("----Set way----");
        HashSet<Integer> map = new HashSet<>();

      for(int num: arr){
          if(map.contains(target-num)){
              System.out.println(num + " " + (target-num));
          }else{
              map.add(num);
          }
      }

    }
}