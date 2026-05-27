package Trees;

import java.util.*;

public class Traversals {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public static void display(Node root){
        if(root== null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
     public static void inorder(Node root){
        if(root==null) return;
        preorder(root.left);
         System.out.print(root.val+" ");
        preorder(root.right);
    }
     public static void postorder(Node root){
        if(root==null) return;
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.val+" ");
    }
    public static void levelorder(Node root){
            Queue<Node> q = new LinkedList<>();
            if(root!=null) q.add(root);
            while(q.size()>0){
                Node front = q.remove();
                System.out.print(front.val+" ");
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);  //a is the root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        display(a);
        System.out.println();
        System.out.print("Preorder : ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder : ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder : ");
        postorder(a);
        System.out.println();
        System.out.print("LevelOrder : ");
        levelorder(a);
    }
}
