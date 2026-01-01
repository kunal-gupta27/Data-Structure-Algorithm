package LinkList;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head = temp;
            }
            else {
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;  // or insertAtEnd(val);
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size){     //if valli condition ka case hain tab lagayi hain
                insertAtEnd(val);
                return;
            }
            else if(idx==0){          //when insert krna hain element in first place
                insertAtHead(val);
                return;
            }
            else if(idx<0 ||  idx>size){
                System.out.println("Wrong idx");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }

        void deleteAt(int idx){
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
        }

        int getAt(int idx){
            if(idx<0 ||  idx>size){
                System.out.println("Wrong idx");
                return -1;
            }
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        // int size(){
        //     Node temp=head;
        //     int cnt=0;
        //     while(temp!=null){
        //         cnt++;
        //         temp=temp.next;
        //     }
        //     return cnt;
        // }

        
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);  //4
        // ll.display();
        ll.insertAtEnd(5);  //4->5
        // ll.display();
        ll.insertAtEnd(12);  //4->5->12
        // ll.display();

        ll.insertAtHead(24); //24->4->5->12
        // ll.display();
        // System.out.println("Linked List size is: "+ll.size);
        
        ll.insertAt(2, 10);   //24->4->10->5->12
        
        ll.display();
        //   System.out.println("Linked List size is: "+ll.size);
        // System.out.println(ll.tail.data);
        System.out.println(ll.getAt(4));

        ll.deleteAt(4);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println("Linked List size is: "+ll.size);

        
    }
}
