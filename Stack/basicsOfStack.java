package Stack;

import java.util.*;

public class basicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println(st.isEmpty()); // it gives boolean output -> true
        // zero 
        System.out.println("size is: "+st.size());
        // empty stack
        System.out.println(st);
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        //peek
        System.out.println(st.peek());
        System.out.println(st);
        // pop operation
        st.pop();
        System.out.println(st.isEmpty());  //gives boolean-> false
        System.out.println(st);
        // size operation
        System.out.println("size is: "+st.size());

        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
    }
}
