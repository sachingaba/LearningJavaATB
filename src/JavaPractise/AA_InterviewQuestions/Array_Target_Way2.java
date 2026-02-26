package JavaPractise.AA_InterviewQuestions;

public class Array_Target_Way2 {
    public static void main(String[] args) {


        int[] arr = {6, 8, 11, 6, 9, 18,1,16};

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
    }
}