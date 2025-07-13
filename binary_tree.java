import java.util.*;
class Node
{
    int data;
    Node left;
    Node right;
    Node(int k)
    {
        this.data = k;//No need to initialise left and right to null. If not initialised, then automatically set to null.
    }
}
 class tree //class -> data variable + methods which work on that data variable -> ENCAPSULATION
{
    Node root;// data variable
    void preorder(Node root)// method which works on the data variable
    {
        if(root != null)
        {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
   
    void inorder(Node root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
   
    void postorder(Node root)
    {
        if(root != null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
public class binary_tree
{
    public static void main(String args[])
    {
        tree t1 = new tree();
        t1.root = new Node(1);
        t1.root.left = new Node(2);
        t1.root.right = new Node(3);
        t1.root.left.left = new Node(4);
        t1.root.left.right = new Node(5);
        t1.preorder(t1.root);
        System.out.println();
        t1.inorder(t1.root);
        System.out.println();
        t1.postorder(t1.root);

    }
}