package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_reverse_two_Pointers {
    public static void main(String[] args) {
        int[] array = {9,32,542,52,5,252,34,43,3456,9,72,3,1,2,6,39};

        int left = 0;
        int right = array.length-1;

        while (left<right){

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(array));
    }
}
