package JavaPractise;


    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Array_2d_Hourglass {



        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);

            int[][] arr = new int[6][6];
            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    arr[i][j]= scanner.nextInt();
                }
            }
            System.out.println(Arrays.toString(arr));
            for (int i = 1; i < 5; i++) {
                for (int j = 1; j < 5; j++) {
                    int sum =
                            //Top
                            arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+
                                    //Mid
                                    arr[i][j]+
                                    //bottom
                                    arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                    if(sum>maxSum){
                        maxSum=sum;
                    }
                }


            }
            System.out.println(maxSum);
        }
    }



