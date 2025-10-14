package Exercises;

public class Task01_2nd_Max_In_Array {
    public static void main(String[] args) {
        int[] array = {25, 14, 65, 89, 56, 54, 6, 12, 585, 585, 12, 44, 36};

        /*Arrays.sort(array);
        System.out.println("MIn "+ array[0]);
        System.out.println("Max "+ array[array.length-1]);*/


        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];

            }


        }
        System.out.println("Max " + max);

        int max2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max2 && array[i] < max) {
                max2 = array[i];

            }


        }
        System.out.println("2nd max " + max2);

    }
}
