package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_Duplicate_For_Loop {
    public static void main(String[] args) {


        int[] arr = {11,20,34,5,11,0,77,89};
        int[] narr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                continue;
            }


            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    narr[i]=arr[i];
                    arr[j]=100;


                }


            }
            narr[i]=arr[i];

        }
        System.out.println(Arrays.toString(narr));
    }
}
