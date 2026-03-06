package JavaPractise.AA_InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Array_kth_Smallest_Number {
    public static void main(String[] args) {


        int[] arr = {11,20,34,5,68,0,77,89};

        int k=3;

        //this is important collections.reverseOrder()

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < k; i++) {

            pq.add(arr[i]);
        }

        for (int j =k ; j < arr.length; j++) {
            if (pq.peek() > arr[j]) {
                pq.poll();
                pq.add(arr[j]);
            }
        }
        System.out.println(pq);
        System.out.println(k + " Smallest: "+ pq.peek());
    }

}
