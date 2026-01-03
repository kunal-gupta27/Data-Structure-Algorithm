package LinkedList_Question;

public class NthNodefromEnd {
    public static Node nthNode(Node head, int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m =size-n+1;
        //mth node from start
        temp=head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static Node nthNodeTwo(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }

        while(fast!=null){
            fast = fast.next;
            slow=slow.next;
        }
        return slow;
    }
    public static Node deleteNthNodeFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast= fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;  //100->13->4->5->12->10->null    //end sai delete
        
        // Node q = nthNode(a, 2);
        // System.out.println(q.data);

        // Node t = nthNodeTwo(a, 3);
        // System.out.println(t.data);

        display(a);
        System.out.println();
        a = deleteNthNodeFromEnd(a, 1);
        display(a);


    }
}
