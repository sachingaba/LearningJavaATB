package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;

public class Array_Duplicate_For_Loop {
    public static void main(String[] args) {
        int[] arr = {11,20,34,5,11,0,77,89};
        int[] narr = new int[arr.length];

int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==Integer.MIN_VALUE){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                   // narr[i]=arr[i];
                    arr[j]=Integer.MIN_VALUE;
                }
            }
            narr[index]=arr[i];
            index++;
        }
        System.out.println(Arrays.toString(narr));
        int[] unique = new int[index];
        System.arraycopy(narr, 0, unique, 0, index);
        System.out.println(Arrays.toString(unique));


        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
        public static int removeDuplicates(int[] nums) {
            if(nums.length == 0) return 0;

            int k=1;
            for(int i=1;i<nums.length;i++){

                if(nums[i]!=nums[i-1]){
                    nums[k++] = nums[i];


                }
            }
            System.out.println(Arrays.toString(nums));
            return k;

        }
    }

