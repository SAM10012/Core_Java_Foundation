import java.util.*;
public class bst
{
    private static Node root;
    private static class Node{
        private int data;
        private Node left_child;
        private Node right_child;
        Node(int data)
        {
            this.data = data;
            this.left_child = null;
            this.right_child = null;
        }
    }

    public static void insert(Node root,Node node)
    {
        if(root.left_child == null && root.right_child == null && node.data<root.data)
        {
            root.left_child = node;
            return;
        }

        if(root.left_child == null && root.right_child == null && node.data>root.data)
        {
            root.right_child = node;
            return;
        }

        if(node.data < root.data)
        {
            insert(root.left_child,node);
        }
        else if(node.data > root.data)
        {
            insert(root.right_child,node);
        }
    }
    public static void preorder(Node root)
    {
        if(root!=null)
        {
        System.out.println(root.data);
        preorder(root.left_child);
        preorder(root.right_child);
        }
    }
    public static void main(String[] args) 
    {
        bst new_bst = new bst();
        new_bst.root = new Node(12);
        //insert(root,new Node(45));
        insert(root,new Node(5));
        preorder(root);
    }   
}