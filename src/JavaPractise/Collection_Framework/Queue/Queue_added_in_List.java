package JavaPractise.Collection_Framework.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_added_in_List {
    public static void main(String[] args) {
        Queue q1 = new ArrayDeque();
        for (int i = 0; i < 5; i++) {
            q1.add("king"+i);

        }
        q1.poll();  //FIFO
        System.out.println(q1);

        PriorityQueue pq = new PriorityQueue<>();
        for (int i = 5; i >0; i--) {
            pq.add("Queen"+i);
        }
        pq.poll();
        System.out.println(pq);

        Queue big = new ArrayDeque();
        big.add(q1);
        big.add(pq);

        System.out.println(big);

        Queue link = new LinkedList();
        link.add(big);
        link.add(q1);
        link.add(pq);
        System.out.println(link);
        System.out.println(link.peek());

    }
}
