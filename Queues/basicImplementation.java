package Queues;


import java.util.*;

public class basicImplementation {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);  // 1 2 3 4
        // q.remove();
        q.poll();
        System.out.println(q);  // 2 3 4 
        System.out.println(q.peek()); //2
        System.out.println(q.size()); //3

    }
}
