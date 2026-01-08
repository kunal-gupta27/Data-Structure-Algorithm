package LinkedList_Question;

public class reverseLinkedList {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
    }
    // public static Node linkedlist(){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     Node head = null;
    //     Node tail=null;

    //     for(int i=0;i<n;i++){
    //         Node t = new Node(sc.nextInt());
    //          if (head == null) {
    //             head = t;
    //             tail = t;
    //         } else {
    //             tail.next = t;
    //             tail = t;
    //         }
    //     }
    //     return head;
        


    // }
    public static Node reverse(Node head){
        if(head.next==null) return head;
        Node newHead = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static void display(Node head){
            if(head==null) {
                System.out.println();
                return;
            }
            // display(head.next);
            System.out.print(head.val+" ");
            display(head.next);
        }
    
    public static void main(String[] args) {
        // Node head = linkedlist();
        // display(head);
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;

        display(a);
        a= reverse(a);
        display(a);
        

    }
}
