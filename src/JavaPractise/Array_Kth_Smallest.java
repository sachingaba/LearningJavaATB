package JavaPractise;

import java.util.Collections;
import java.util.PriorityQueue;

public class Array_Kth_Smallest {
    public static void main(String[] args) {
        int[] arr = {23,4,5,7,34,6,89,71};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);

        }
        for (int i = k; i < arr.length; i++) {
            if(pq.peek()>arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }

        }
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
