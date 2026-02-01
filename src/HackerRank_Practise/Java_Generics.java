package HackerRank_Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_Generics {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add("Hello");
        arr.add("World");



        for(Object arrs:arr){
            System.out.println(arrs);
        }

    }
}
