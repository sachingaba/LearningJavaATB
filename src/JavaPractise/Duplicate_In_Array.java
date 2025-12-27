package JavaPractise;

import javax.crypto.spec.PSource;

public class Duplicate_In_Array {
    public static void main(String[] args) {
        int[] arr = {121, 56, 11, 54, 12, 9, 9, 36, 63, 464, 89, 4, 11, 6, 0, 0,9, 36};

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i]<0){
                continue;
            }
            int count = 1;

            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] == arr[j + 1]) {
                    count++;
                    arr[j+1] = -1;


                }

            }
            if (count>1){
                System.out.println("duplicate: " + arr[i] + " count:  " + count);
            }


            }


        System.out.println("\n");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + ",");

        }


    }
}
