import java.util.*;
public class tree
{
    private static Node root;
    private static class Node{
        private int data;
        private Node left;
        private Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void insert(Node root,Node node)
    {
        if(root.left == null && node.data < root.data)
        {
            root.left = node;
            return;
        }
        if(root.right == null && node.data > root.data)
        {
            root.right = node;
            return;
        }
        if(node.data < root.data)
        {
            insert(root.left,node);
        }
        else if(node.data > root.data)
        {
            insert(root.right,node);
        }
    }
    public static void preorder(Node root)
    {
        
        if(root!=null)
        {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static int height(Node root)
    {
        if(root == null)
    
            return -1;
        

        if(height(root.left) > height(root.right))
        {
            return height(root.left) + 1;
        }
        else if(height(root.left) < height(root.right))
        {
            return height(root.right) + 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        tree tree1 = new tree();
        tree1.root = new Node(12);
        insert(root,new Node(134));
        insert(root,new Node(54));
        insert(root,new Node(78));
        insert(root,new Node(99));
        insert(root,new Node(775));
        insert(root,new Node(31));
        insert(root,new Node(2));
        //insert(root,new Node(-52));
        preorder(root);
        System.out.println("The height of bst is: "+height(root));
    }
}