package JavaPractise;

public class Array_SubArray_Target_Sum {
    public static void main(String[] args) {

        int[] s1 = {2, 4, 5, 6, 7};

        for (int i = 0; i < s1.length; i++) {
          int  sum1=0;
            for (int j = i; j < s1.length; j++) {
                sum1 = sum1 + s1[j];
                if(sum1==11){
                    System.out.println(i+ ":"+ j);
                }
            }
        }
        }
    }

