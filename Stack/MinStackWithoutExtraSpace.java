package Stack;

import java.util.*;
public class MinStackWithoutExtraSpace {
    public static class MinStack {
    Stack<Long> st = new Stack<>();
    long min=-1;
    public MinStack() {
        
    }
    
    public void push(int val) {
        long x = (long)val;
        if(st.size()==0){
            st.push(x);
            min=x;
        }
        else if(x>=min){
            st.push(x);
        }
        else if(x<min){
            st.push(2*x-min);
            min=x;
        }

    }
    
    public void pop() {
        if(st.size()==0) return;
        else if(st.peek()>=min){
            st.pop();
        }
        else if(st.peek()<min){
            long old = 2*min-st.peek();
            min=old;
            st.pop();
        }
    }
    
    public int top() {
        long q = st.peek();
        if(st.size()==0) return -1;
        else if(q>=min){
            return (int)q;
        }
        else if(q<min){
            return (int)min;
        }
        return 0;
    }
    
    public int getMin() {
        if(st.size()==0) return -1;
        return (int)min;
    }
}
    public static void main(String[] args) {
        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(3);
        ms.push(7);

        System.out.println(ms.getMin()); // 3
        ms.pop();
        System.out.println(ms.getMin()); // 3
        ms.pop();
        System.out.println(ms.getMin()); // 5
    }
}
