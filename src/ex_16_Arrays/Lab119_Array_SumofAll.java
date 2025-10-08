package ex_16_Arrays;

public class Lab119_Array_SumofAll {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        for (int i = 0; i <arr.length; i++) {
            sum = sum+arr[i];

        }
        System.out.println(sum);
    }
}
