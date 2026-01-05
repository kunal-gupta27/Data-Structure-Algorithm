package LinkedList_Question;

public class LinkedDelete {
    public static Node middleNodeDelete(Node head){   // odd no. of node in list
        Node slow= head;
        Node fast = head;
        if(head.next==null) return null;
        while(fast.next.next!= null && fast.next.next.next!=null){  //pahele condition even(right value) ki hain && then odd condition
            slow=slow.next;
            fast = fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head= head.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(3);
        Node c = new Node(8);
        Node d = new Node(7);
        Node e = new Node(9);
        Node f = new Node(10);
        // Node g = new Node(23);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        // f.next=g;

        display(a);
        System.out.println();
        middleNodeDelete(a);
        display(a);


    }
}
