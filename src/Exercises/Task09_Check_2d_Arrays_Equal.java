package Exercises;

import java.util.Arrays;

public class Task09_Check_2d_Arrays_Equal {
    public static void main(String[] args) {
        int[][] array_2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] array_2ds = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepEquals(array_2ds,array_2d));
    }
}