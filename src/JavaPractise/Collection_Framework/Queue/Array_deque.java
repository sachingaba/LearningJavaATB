package JavaPractise.Collection_Framework.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Array_deque {
    public static void main(String[] args) {
        Queue<Object> adq = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            adq.add(i);

        }
        //cant add NUll in Deque
        // adq.add(null);
        //adq.add(null);
        adq.add("you");
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.poll()); // removed top
        System.out.println(adq);
        System.out.println(adq.contains(3));
    }
  /*        | Aspect                 | ArrayDeque                               | PriorityQueue                                    |
            | ---------------- | ---------------------------------------- | ------------------------------------------------ |
            | Primary use      | Queue/stack, double-ended operations     | Always get “smallest / highest priority” element |
            | Order of removal | FIFO or LIFO based on methods            | By priority (natural order or Comparator)        |
            | Operations       | addFirst/addLast, removeFirst/removeLast | offer/add, poll, peek (on priority head)         |
            | Implementation   | Resizable circular array                 | Binary heap                                      |
            | Time complexity  | O(1) add/remove at ends                  | O(log n) add/remove head                         |
            | Null allowed     | No                                       | No                                               |
            | When to choose   | Need general queue/stack/deque           | Need scheduling / priority-based processing      |
}*/
}