package JavaPractise;

import java.util.Arrays;

public class Array_Move_x_to_End {

    public static void main(String[] args) {

        int[] ch = {0,0,7,1,0,3,0,5,6,7};
int x = 5;
int[] arr = new int[ch.length];
int k =0;
        for (int i = 0; i < ch.length; i++) {


            if(ch[i]!=x){
                ch[k]=ch[i];
                k++;
            }
        }
        while(k<ch.length){
            ch[k]=x;
            k++;
        }
        System.out.println(Arrays.toString(ch));
    }
}
