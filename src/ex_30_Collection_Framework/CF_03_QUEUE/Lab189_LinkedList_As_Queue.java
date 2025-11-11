package ex_30_Collection_Framework.CF_03_QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class Lab189_LinkedList_As_Queue {

    public static void main(String[] args) {
        Queue qq = new LinkedList<>();

        qq.peek();
        qq.add(5);
        qq.add(8);
        qq.add(8);
        qq.add(89);

        System.out.println(qq);
        System.out.println(qq.peek());
        System.out.println(qq.poll());
        System.out.println(qq);
        System.out.println(qq.add(1));
        System.out.println(qq);
        System.out.println(qq.remove(89)); // remove object
        System.out.println(qq);
        System.out.println(qq.offer(55)); // Insert at the end of queue
        System.out.println(qq);




    }
}
