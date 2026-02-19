package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class String_Reverse_Duplicate_Words {
    public static void main(String[] args) {

        String a1 = "I am good person in india and others word good word";

        // reverse only the repeated words

        String[] arr = a1.split(" ");

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                String s1= arr[i];

                if(arr[i].equalsIgnoreCase(arr[j])){
                  //  StringBuilder sb1 = new StringBuilder(arr[i]);
                    StringBuilder sb2 = new StringBuilder(arr[j]);
                    arr[i]= new StringBuilder(arr[i]).reverse().toString();
                    arr[j]= sb2.reverse().toString();

                }

            }
        }
        System.out.println(" Array To String: "+ Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
