package Stack;

import java.util.Stack;

public class underFlowOverflow {
    public static void main(String[] args) {
        // *******************Condition of UnderFlow**************************
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();   // it gives mw array because here stack is empty 
        // also we did not use -> st.peek() here when array is empty 
        // Both are gives us error
        System.out.println(st);
    }
}
