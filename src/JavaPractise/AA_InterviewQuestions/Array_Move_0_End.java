package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_Move_0_End {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 12};
        // Output - {1,3,12,0,0}

        //1st Way
        int[] arr1 = new int[arr.length];
int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr1[k]=arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr1));
// 2nd Way:
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[pos]= arr[i];
                pos++;
            }

            }
        while(pos<arr.length){
            arr[pos]=0;
            pos++;

        }
        System.out.println(Arrays.toString(arr));

        int[] array = {0,43,0,21,0,05,324,2,0};
        System.out.println(moveZeroes(array));


    }
    static String moveZeroes(int[] arr){
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[pos]= arr[i];
                pos++;
            }

        }
        while(pos<arr.length){
            arr[pos]=0;
            pos++;

        }
        return  Arrays.toString(arr);
    }
}
