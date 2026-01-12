package DubblyLL;

public class displayDll {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }

    public static void Ddisplay(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");  // 4 10 2 99 13
            temp=temp.next;
        }
    }


    // yai dll koo reverse printkarayegi   
    public static void Ddisplayrev(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");    // 13 99 2 10 4
            temp=temp.prev;
        }
        System.out.println();
    }

    public static void display2(Node random){  //kisi bhi random node sai hum dll print kra sakte hain
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        //print the list;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();

    }

    public static Node insertAtHead(Node head, int x){
        Node t = new Node(x);
        t.next= head;
        head.prev = t;
        head=t;
        return head;
    }

    public static void insertAtTail(Node head, int x){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t = new Node(x);
        temp.next=t;
        t.prev=temp;

    }

    public static void insertAtInd(Node head, int idx,int x){
        Node s = head;
        for(int i=1;i<=idx-1;i++){
            s=s.next;
        }
         Node r = s.next;
            Node t = new Node(x);
            s.next=t;
            t.prev=s;
            t.next=r;
            r.prev=t;

    }

    public static void deleteAtIdx(Node head, int idx){
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;

        Ddisplay(a);
        System.out.println();
        // Ddisplayrev(e);

        // display2(b);  

        // Node newHead = insertAtHead(a, 20);
        // Ddisplay(newHead);

        // insertAtTail(a, 90);
        // Ddisplay(a);

        // insertAtInd(a, 3, 35);
        // Ddisplay(a);

        deleteAtIdx(a, 1);
        Ddisplay(a);
    }
}
