package ex_16_Arrays;

public class Task01_2nd_Max_in_Array {
    public static void main(String[] args) {
        int[] arr = {25, 65, 65, 89, 54, 54, 6, 12, 798, 798, 12, 44, 36};
int max =arr[0];
int secHighest = 0;
        for (int i =0 ; i < arr.length; i++) {
            if(arr[i]>max){
secHighest = max;
                max = arr[i];
            }

        } System.out.println(max);
        System.out.println(secHighest);

        int high =0;
        int secH = 0;

        for(int num:arr){
            if(num>high){
                secH = high;
                high = num;

            }

        }System.out.println(high);
        System.out.println(secH);
    }
}

