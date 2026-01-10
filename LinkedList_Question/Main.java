package LinkedList_Question;


import java.util.*;
public class Main {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static  Node takeinput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head=null;
        Node tail=null;

        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            Node newNode = new Node(d);

            if(head==null){
                head=tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        return head;

    }
    
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Node head = takeinput();
        display(head);
    }
}
