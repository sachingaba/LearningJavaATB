package ex_30_Collection_Framework.CF_01_LIST;

import java.util.Stack;

public class Lab182_Stack {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        st.add("sachin1");
        st.add("sachin2");
        st.add("sachin3");st.add("sachin4");

        //Last In FIRST Out

        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.peek());  // element at the last - //Last In FIRST Out
        System.out.println(st.pop());  // remove the top positioned .. sachin4 here
        System.out.println(st);
        System.out.println(st.get(2));



    }
}
