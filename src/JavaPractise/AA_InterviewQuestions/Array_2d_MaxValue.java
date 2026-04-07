package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_2d_MaxValue {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,5,9},
                {2,4,6},
                {32,65,8}

        };
      //  System.out.println(matrix.length);
       // System.out.println(matrix[0].length);
int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if(max<matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println(max);


    }
}
