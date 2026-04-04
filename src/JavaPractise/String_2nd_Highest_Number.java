package JavaPractise;

import java.util.Arrays;

public class String_2nd_Highest_Number {
    public static void main(String[] args) {

        String s1 = "Mynameis45673Sachin";
        String s2 = s1.replaceAll("[^0-9]", "");
        System.out.println(s2);

        char[] ch = s2.toCharArray();
        System.out.println("array: " + Arrays.toString(ch));
        int max = 0;
        int max2 = 0;
        for (int i = 0; i + 1 < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if ((Integer.parseInt(String.valueOf(ch[i])) > Integer.parseInt(String.valueOf(ch[j])))) {
                    max2 = max;
                    max = Integer.parseInt(String.valueOf(ch[i]));
                }
            }
        }
        System.out.println(max);
        System.out.println(max2);

        //2nd Try:
        int first = 0;
        int sec = 0;
        String[] s3 = s2.split("");
        System.out.println(Arrays.toString(s3));
        for (int i = 0; i < s3.length; i++) {
            for (int j = i+1; j <ch.length ; j++) {
                if((Integer.parseInt(s3[i])) > Integer.parseInt(s3[j])){
                    sec=first;
                    first=Integer.parseInt(s3[i]);

            }
        }

        }
        System.out.println(first);
        System.out.println(sec);
    }
}
