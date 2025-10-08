package ex_16_Arrays;

import java.util.Arrays;

public class Lab115_Array_Max_Min {
    public static void main(String[] args) {
        int[] array = {25,14,65,89,56,54,6,12,585,157,12,44,36};

        Arrays.sort(array);
        System.out.println("MIn "+ array[0]);
        System.out.println("Max "+ array[array.length-1]);
//2nd max

        System.out.println("2nd Max " + array[array.length-2]);
    }
}
