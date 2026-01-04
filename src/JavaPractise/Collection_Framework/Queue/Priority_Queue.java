package JavaPractise.Collection_Framework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    public static void main(String[] args) {
        Queue Pq = new PriorityQueue();
        Pq.add("sa");
        Pq.add("ga");
        Pq.add("ba");
        Pq.add("ch");
      Pq.add("in");
       // Pq.add(5);
     //   Pq.add(null);

        //No order maintained , same type of values can be added
// NO null
        System.out.println(Pq);
        System.out.println(Pq.poll());
        System.out.println(Pq);
    }
}
