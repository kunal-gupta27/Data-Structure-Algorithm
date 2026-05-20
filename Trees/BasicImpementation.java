package Trees;

public class BasicImpementation {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }

    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int product(Node root){
        if(root==null) return 1;
        return root.val * product(root.left) * product(root.right);
    }

    public static int nonzeromul(Node root){
        if(root==null) return 1;
        if(root.val== 0) return nonzeromul(root.left) * nonzeromul(root.right);
        return root.val * nonzeromul(root.left) * nonzeromul(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(1);  //a is the root
        Node b = new Node(2);
        // Node c = new Node(3);
        Node c = new Node(0);
        Node d = new Node(4);
        // Node e = new Node(5);
        Node e = new Node(0);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;


        display(a);
        System.out.println();
        // a.left=null;  //left subtree will be unlink here from the tree
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(nonzeromul(a));
    }
}
