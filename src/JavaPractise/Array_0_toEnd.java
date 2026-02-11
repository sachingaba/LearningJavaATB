package JavaPractise;

import java.util.Arrays;

public class Array_0_toEnd {

    public static void main(String[] args) {

        int[] arr = {1,2,3,0,0,5,0,6,7};
int k =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[k]=arr[i];
                k++;
            };

        }
        while(k<arr.length){
            arr[k]=0;
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
