package JavaPractise;

import java.util.Arrays;

public class Array_move0 {
    public static void main(String[] args) {





        int[] ch = {1,0,3,0,5,6,7};
        int n = ch.length;
        int k =0;

            for(int j=0;j<n;j++){
                if(ch[j]!=0){
                   ch[k]=ch[j];
                   k++;
                }

            }
            while(k<n){
                ch[k]=0;
                k++;
            }


        System.out.println(Arrays.toString(ch));
    }
}
