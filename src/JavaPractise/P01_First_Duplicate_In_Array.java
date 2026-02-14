package JavaPractise;
import java.util.Arrays;
public class P01_First_Duplicate_In_Array {

        public static void main(String[] args) {

            int[] array = {22,33,66,55,80,23,44,44,80};


            int max = array[0];
            int max2nd = 0;
            for (int i=0;i<=array.length-1;i++){
                if(array[i]>=max){
                    int temp = max;
                    max=array[i];
                    if(temp<=max){
                        max2nd=temp;
                    }

                }

            }
            System.out.println("Max " + max);
            System.out.println("Max 2nd " + max2nd);

            int[] nums = {1, 0, 3, 2, 4, 5,1 , 1 , 0};

            for (int i = 0; i < nums.length; i++) {
                if(nums[i]<0){

                    continue;
                }
                int count = 1;
                for (int kj = i + 1; kj < nums.length; kj++) {

                    if (nums[i] == nums[kj]) {
                        count++;
                        nums[kj] = -1;

                    }
                }
                if(count>1){
                    System.out.println("Duplicate: " + count + " " + nums[i]);
                }

            }



        }
    }

