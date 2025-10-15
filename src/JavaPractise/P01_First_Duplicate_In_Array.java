package JavaPractise;
import java.util.Arrays;
public class P01_First_Duplicate_In_Array {

        public static void main(String[] args) {

            int[] array = {22,33,66,55,80,23,44,44};

            Arrays.sort(array);
            //first duplicate
            int j = 0;
            for(int arr : array){
            // for (int i=0;i<array.length;i++){
                if(arr!=j){
                    j= arr;
                }else{
                    System.out.println("easy peassy" + j);
                }

            }


            int max1= array[array.length-1];
            System.out.println("easy " + max1);

            int max = array[0];
            for (int i=0;i<=array.length-1;i++){
                if(array[i]>max){
                    max=array[i];
                }
            }
            System.out.println(max);




        }
    }

