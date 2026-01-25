package JavaPractise.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_reArrange {

        public static void main(String[] args)
        {
            int[] arr = {91,12,5,32,78,6,43,3,72,3,9,20};
            Arrays.sort(arr);
            List<Integer> arr1 = new ArrayList<>();
            List<Integer> arr2 = new ArrayList<>();

            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    arr1.add(arr[i]);

                }else{
                    arr2.add(arr[i]);
                }


            }

            arr1.addAll(arr2);

            System.out.println(arr1);
        }
    }

