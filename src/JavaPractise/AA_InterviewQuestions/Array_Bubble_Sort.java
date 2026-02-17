package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_Bubble_Sort {
    public static void main(String[] args) {
        int[] array = {25,14,65,89,56,54,6,12,585,15798,12,44,36};
int temp=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j+1 < array.length; j++) {
                if(array[j]>array[j+1]){
                  temp=array[j+1];
                    array[j+1]= array[j];
                    array[j]=temp;
                }

            }

        }
        System.out.println(Arrays.toString(array));

    }
}
