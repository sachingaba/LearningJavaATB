package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_Bubble_Sort {
    public static void main(String[] args) {
        int[] array = {9,32,542,52,5,252,34,43,3456,9,72,3,1,2,6,39};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j + 1 < array.length; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(array));
    }



    }

