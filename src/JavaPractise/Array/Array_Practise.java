package JavaPractise.Array;

import java.util.Arrays;

public class Array_Practise {
    public static void main(String[] args) {
        String[] sach = {"sa","sd","fg","fg","hg","g","h"};

        for (int i = 0; i < sach.length; i++) {
            System.out.print(" "+ sach[i]);

        }
        System.out.println(" ");
        Arrays.sort(sach);
        for (int i = 0; i < sach.length; i++) {
            System.out.print(" "+ sach[i]);

        }
    }
}
