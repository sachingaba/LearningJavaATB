package JavaPractise.Array;

public class ArrayIteration {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(j==i){
                    System.out.print(matrix[i][j]);
                }else{
                    System.out.print(" ");
                }


            }
            System.out.println("");

        }
    }
}
