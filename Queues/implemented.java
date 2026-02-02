package Queues;
import java.util.Stack;

public class implemented {

    public static class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Push element x to the back of queue
        public void push(int x) {
            s1.push(x);
        }

        // Removes the element from front of queue
        public int pop() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        // Get the front element
        public int top() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

        // Returns whether the queue is empty
        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q.top());   // 10
        System.out.println(q.pop());   // 10
        System.out.println(q.top());   // 20
        System.out.println(q.empty()); // false
    }
}
