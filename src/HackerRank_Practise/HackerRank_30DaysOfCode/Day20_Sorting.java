package HackerRank_Practise.HackerRank_30DaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Day20_Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

      //  List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //        .map(Integer::parseInt)
        //        .collect(toList());

        List<Integer> a = new java.util.ArrayList<>(List.of(3, 4, 1));

        // Write your code here
        int numberOfSwaps = 0;
        for(int i = 0; i< n; i++){
            for(int j =0; j < n-1; j++){
                if(a.get(j)> a.get(j+1)){
                    int temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in "+ numberOfSwaps+ " swaps.");
        System.out.println("First Element: "+ a.getFirst());
        System.out.println("Last Element: "+ a.get(n-1));
        System.out.println(a);

        bufferedReader.close();
    }
}
