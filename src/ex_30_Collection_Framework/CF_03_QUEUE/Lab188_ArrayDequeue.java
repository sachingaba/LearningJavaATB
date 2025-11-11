package ex_30_Collection_Framework.CF_03_QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab188_ArrayDequeue {
    public static void main(String[] args) {

        Deque dq = new ArrayDeque<>(5);
        dq.push("a");
        dq.add(5);
        dq.add(7);

        System.out.println(dq);
        System.out.println(dq.add(3));
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq.peek());





    }
}
