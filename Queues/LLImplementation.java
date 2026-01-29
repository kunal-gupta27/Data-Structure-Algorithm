package Queues;

public class LLImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LLQueue{
        Node head = null;
        Node tail = null;
        int size=0;

        public void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int x  = head.data;
            head = head.next;
            size--;
            return x;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.data;
        }

        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            Node t = head;
            while(t!=null){
                System.out.print(t.data+" ");
                t=t.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LLQueue q = new LLQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();  // 1 2 3 4
        q.add(5);
        q.display();  // 1 2 3 4 5
        q.remove();
        q.display(); //2 3 4 5
        System.out.println(q.size);  //4
        System.out.println(q.peek()); // 2

    }
}
