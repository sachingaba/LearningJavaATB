package Exercises;

import java.util.Arrays;

public class Task39_2nd_Min_In_Array {
    public static void main(String[] args) {
        int[] array = {25, 14, 65, 89, 56, 54, 6, 12, 585, 585, 12, 44, 36};

        int max = 0;
        int min = array[0];

        for (int i = 0; i <array.length ; i++) {
            if(max<array[i]){
                max = array[i];

            }

        } System.out.println("Max " + max);

        for (int i =1 ; i < array.length ; i++) {
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println("Min " + min);





        Arrays.sort(array);
            System.out.println(array[1]);
        System.out.println(array[array.length-1]);


    }
}
