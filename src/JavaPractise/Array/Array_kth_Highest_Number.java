package JavaPractise.Array;

import java.util.PriorityQueue;

public class Array_kth_Highest_Number {
    public static void main(String[] args) {

        int[] arr = {7777,3,5464,73,3,6,870,806,3,22,96,7500};
        int k=3;

        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        for (int i = 0; i < k; i++) {

            pq.add(arr[i]);
        }
            for (int j =k ; j < arr.length; j++) {
                if (pq.peek() < arr[j]) {
                    pq.poll();
                    pq.add(arr[j]);
            }
            }
        System.out.println(pq);
        System.out.println(k + " Top: "+ pq.peek());
        }

    }

