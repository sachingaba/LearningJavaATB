package JavaPractise.AA_InterviewQuestions;

public class String_reverse_Even {
    public static void main(String[] args) {
   String text = "Today is a good day";
   String Output = "day doog a si Today";
   StringBuilder result =new StringBuilder();
   String[] arr = text.split(" ");

   for(int i=arr.length-1;i>=0 ; i--){
       if(i%2!=0){
           StringBuilder sb = new StringBuilder(arr[i]);
           sb.reverse();
           result.append(sb).append(" ");
       }else{
           result.append(arr[i]).append(" ");
       }
   }
        System.out.println(result);
    }
}
