package LinkedList_Question;
import java.util.*;
public class AddTwoNumber {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node takeInput() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Node head = null, tail = null;
    for (int i = 0; i < n; i++) {
        int val = sc.nextInt();
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }
    return head;
}


    static void display(Node head){
        Node t = head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
    public static Node addTwoNumber(Node l1, Node l2) {
    Node dummy = new Node(0);
    Node curr = dummy;
    int carry = 0;

    while (l1 != null || l2 != null || carry != 0) {
        int sum = carry;

        if (l1 != null) {
            sum += l1.data;
            l1 = l1.next;
        }
        if (l2 != null) {
            sum += l2.data;
            l2 = l2.next;
        }

        carry = sum / 10;
        curr.next = new Node(sum % 10);
        curr = curr.next;
    }
    return dummy.next;
}

    public static void main(String[] args) {
    System.out.print("Enter list 1: ");
    Node l1 = takeInput();

    System.out.print("Enter list 2: ");
    Node l2 = takeInput();

    Node result = addTwoNumber(l1, l2);

    System.out.print("Result: ");
    display(result);
}

}
