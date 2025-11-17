package JavaPractise;
import java.util.Arrays;
public class P01_First_Duplicate_In_Array {

        public static void main(String[] args) {

            int[] array = {22,33,66,55,80,23,44,44};


            int max1= array[array.length-1];
            System.out.println("2nd Max " + max1);

            int max = array[0];
            for (int i=0;i<=array.length-1;i++){
                if(array[i]>max){
                    max=array[i];
                }
            }
            System.out.println("Max " + max);

            int[] nums = {1, 0, 3, 2, 4, 5,1};

            for (int i = 0; i < nums.length; i++) {
                for (int kj = i + 1; kj < nums.length; kj++) {
                    if (nums[i] == nums[kj]) {
                        System.out.println("Duplicate: " + nums[i]);
                    }
                }
            }



        }
    }

