package LinkList;

public class Basicsll {
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
        

        // System.out.println(a.next);   //null
        // System.out.println(a.data);   //0
        


       // Element=> 5 3 9 8 16
        a.next = b;   //5->3
        b.next=c;  //5->3->9
        c.next=d;  //5->3->9->8
        d.next=e;  //5->3->9->8->16
        

        // System.out.println(a.next); //$Node@251a69d7
        // System.out.println(b);    //$Node@251a69d7    //these both are same so these are connected 
        
        // System.out.println(a.next.data);  // b ka value aayega

        // Node temp =a;
        // for(int i=1;i<=5;i++){
        //     System.out.print(temp.data+" ");   //jab temp null pr chala jaayega tab yai kaam nhi karega
        //     temp=temp.next;
        // }
    
        Node temp = a;
        while(temp!=null){
            System.out.print(temp.data+" ");   //this is code for printing the list
            temp=temp.next;
        }

    }
}
