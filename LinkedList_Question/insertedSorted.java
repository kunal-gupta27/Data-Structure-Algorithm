package LinkedList_Question;

public class insertedSorted {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insertsorted(Node head, int data){
        Node temp=new Node(data);

        if(head==null) return temp;

        if(head.data>data){
            temp.next=head;
            return temp;
        }

        Node p = head;
        while(p.next.data<data && p.next!=null){
            p = p.next;
        }
        temp.next=p.next;
        p.next=temp;
        return head;
    }
    static void display(Node head){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Node h = new Node(3);
        h.next = new Node(5);
        h.next.next = new Node(10);
        h.next.next.next=new Node(12);
        h.next.next.next.next=new Node(15);
        insertsorted(h, 7);
        display(h);
    }
}
