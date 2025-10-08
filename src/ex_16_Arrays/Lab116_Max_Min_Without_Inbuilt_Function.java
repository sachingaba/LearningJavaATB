package ex_16_Arrays;

import java.util.Arrays;

public class Lab116_Max_Min_Without_Inbuilt_Function {
    public static void main(String[] args) {
        int[] array = {25,14,65,89,56,54,6,12,585,15798,12,44,36};

        /*Arrays.sort(array);
        System.out.println("MIn "+ array[0]);
        System.out.println("Max "+ array[array.length-1]);*/

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=max){
                max = array[i];

            }


        }
        System.out.println("Max "+ max);
        int max2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=max2 && array[i]<max){
                max2 = array[i];

            }



        }System.out.println("2nd max " + max2 );

        // MIn value
         int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("MIN " + min);
    }
}
