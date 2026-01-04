package JavaPractise.Collection_Framework.LIST.Stack;

import java.util.List;
import java.util.Stack;

public class Stack_LIST {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();

        stack.add("first");
        stack.add("a");
        stack.add('a');
        stack.add(4.5);
        stack.add("top");

        System.out.println(stack);
        //Last In First Out
        System.out.println(stack.peek());
        //top removal
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.size());
        System.out.println(stack.get(0));

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 11; i++) {
            st.add(i);
            st.push(i);

        }
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.capacity());



    }
}
