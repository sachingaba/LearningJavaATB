package ex_30_Collection_Framework.CF_03_QUEUE;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab187_Queue {
    public static void main(String[] args) {
        Queue q = new PriorityQueue();
        q.add("Sa");
        q.add("dd");


        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);

        PriorityQueue q1 = new PriorityQueue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1);


    }
}
