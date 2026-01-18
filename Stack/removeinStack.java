package Stack;

import java.util.*;
public class removeinStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        // remove from the bottom
        Stack<Integer> rt = new Stack<>();
        while(st.size()>1){
            rt.push(st.pop());
        }
        st.pop();  // last element bacha hian stack main 
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
