package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_Duplicate_For_Loop {
    public static void main(String[] args) {
        int[] arr = {11,20,34,5,11,0,77,89};
        int[] narr = new int[arr.length];
int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                   // narr[i]=arr[i];
                    arr[j]=-1;
                }
            }
            narr[index]=arr[i];
            index++;
        }
        System.out.println(Arrays.toString(narr));
        int[] unique = new int[index];
        System.arraycopy(narr, 0, unique, 0, index);
        System.out.println(Arrays.toString(unique));
    }

}
