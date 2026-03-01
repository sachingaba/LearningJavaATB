package JavaPractise;

import java.util.Arrays;

public class Array_rotate_practise {
    public static void main(String[] args) {
    int[] ch = {1,2,3,4,5,6,7};
    int n = ch.length-1;

    int k=3;


    reverse(ch,k,n);
    reverse(ch,0,k-1);
        reverse(ch,0,n);

    System.out.println(Arrays.toString(ch));
//System.out.println(character2+" " +max2);

}
    public static void reverse(int[] arr , int start,int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }

}
