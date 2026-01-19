package Stack;

public class LinkedListImplementation {
    public static class Node{   // user defined datatype
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{  // user defined Data Structure
        Node head=null;
        int size=0;

        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }

        void display(){
            displayRec(head);
            System.out.println();
        }

        int size(){
            return size;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }

        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4); 
        st.display();  // 4
        st.push(5);
        st.display(); // 4 5
        st.push(1);
        st.display(); // 4 5 1
        System.out.println(st.size());  // otput-> 3
        st.pop();
        st.display(); // 4 5
        System.out.println(st.size()); // output -> 2
        st.push(23);
        st.display();  // 4 5 23
        st.push(7);
        st.display(); // 4 5 23 7
        st.push(8);
        st.display();  // 4 5 23 7 8
        System.out.println(st.size());  // 5
    }
}
