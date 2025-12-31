package LinkList;

public class Basicllfun {

    public static void displayrecursive(Node head){
        if(head==null) return;
        // System.out.print(head.data+" ");
        displayrecursive(head.next);
        System.out.print(head.data+" ");    // reverse print hogi linkedlist
    }

   public static void display(Node head){      // through function printing
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
   }
   public static int length(Node head){
        int cnt=0;
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt;
   }
    public static class Node{
        int data;     //store value
        Node next;    //store address of next node

        Node(int data){
            this.data = data;
        }
    }

public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(23);

        a.next = b;   //5->3
        b.next=c;  //5->3->9
        c.next=d;  //5->3->9->8
        d.next=e;
        e.next=f;
        
        System.out.println(length(a));

        // display(a);
        // System.out.println();
        // displayrecursive(a);
}
}

