package JavaPractise.AA_InterviewQuestions;

public class Array_Adjacent_sign {
    public static void main(String[] args) {
        int[] arr = {10,4,56,89,4,567,3,23,87,8,33};

        for(int i=0;i<arr.length-1; i++){

            if(arr[i]>arr[i+1]){
                System.out.print(">");
            }else{
                System.out.print("<");
            }
        }
    }
}
