package JavaCollectionFramework;

import java.util.*;

public class ListInterfaceExample {
    static void ArrayListExamples(){
        // ArrayList<Integer> l = new ArrayList<>();

        LinkedList<Integer> l = new LinkedList<>();

        //it is also same for linkedlist
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // 1 2 3
        System.out.println(l.get(1)); //2
        l.set(1,10);
        System.out.println(l); // 1 10 3
        System.out.println(l.contains(10)); //true

    }
    static void StackExample(){
        Stack<String> st = new Stack<>();
        st.push("pw");
        st.push("skills");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());

    }
    public static void main(String[] args) {
        // ArrayListExamples();
        StackExample();
    }
}
