package ex_30_Collection_Framework.CF_03_QUEUE;

import java.util.*;

public class Queue_In_LinkedList {
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

        Queue q2 = new ArrayDeque();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);

        List qArr = new LinkedList();
        qArr.add(q1);
        qArr.add(q2);
        System.out.println(qArr);
    }
}
