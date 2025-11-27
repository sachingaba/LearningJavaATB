package JavaPractise.Array;

import java.util.Arrays;

public class Array_Max_Min {
    public static void main(String[] args) {
        int[] array = {25,14,65,89,56,54,6,12,2,585,157,12,44,36};
int max = array[0];
int min = array[0];
int max2 =array[0];
int min2 = array[0];
        System.out.println("Array length : "+array.length);
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max= array[i];

            }
            if(array[i]>=max2 && array[i]<max){
                max2 = array[i];
            }
            if(array[i]<min){

                min = array[i];

            }
            if(array[i]<min2 && array[i]>min){
                min2 = array[i];
            }
        }
        System.out.println(max);
        System.out.println(max2);
        System.out.println(min);
        System.out.println(min2);




        Arrays.sort(array);
        System.out.println("Min : " + array[0]);

        System.out.println("Max : " + array[array.length-1]);
    }
}
