package Stack;

import java.util.*;
public class MinStackImplemen {
    public static class MinStack{
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            if(min.peek()<val){
                min.push(min.peek());
            }else{
                min.push(val);
            }
        }
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
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
