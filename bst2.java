import java.util.*;
public class bst2{
    private static Node root;
    private static class Node{
         int data;
         Node left;
         Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public static int height(Node head)
    {
        if(head == null)
        return 0;
        if(height(head.left) > height(head.right))
        return (height(head.left) + 1);
        else if(height(head.left) < height(head.right))
        return (height(head.right) + 1);
        else
        return 1;

    }
    public static void search(Node root,int data)
    {
        if(root == null)
        {
            System.out.println("Data Not Found!");
            return;
        }
        if(root.data == data)
        {
            System.out.println("Data Found!");
            return;
        }
        if(data < root.data)
        {
            search(root.left,data);
        }
        if(data > root.data)
        {
            search(root.right,data);
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
        if(node.data < root.data && root.left!=null)
        {
            insert(root.left,node);
        }
        if(node.data > root.data && root.right!=null)
        {
            insert(root.right,node);
        }
    }
    public static void display_preorder(Node head)
    {
        if(head!=null)
        {
            System.out.print(head.data + " ");
             display_preorder(head.left);
             display_preorder(head.right);
        }
    }
    public static void display_postorder(Node head)
    {
        if(head!=null)
        {
            
             display_preorder(head.left);
             display_preorder(head.right);
             System.out.print(head.data + " ");
        }
    }
    public static void display_inorder(Node head)
    {
        if(head!=null)
        {
            
             display_preorder(head.left);
             System.out.print(head.data + " ");
             display_preorder(head.right);
        }
    }
    public static void main(String[] args)
    {
        bst2 binary_search_tree = new bst2();
        binary_search_tree.root = new Node(70);
        binary_search_tree.insert(root,new Node(6));
        binary_search_tree.insert(root,new Node(71));
        binary_search_tree.insert(root,new Node(55));
        binary_search_tree.insert(root,new Node(7));
        binary_search_tree.insert(root,new Node(90));
        display_preorder(root);
        System.out.println();
        //display_postorder(root);
        System.out.println();
        //display_inorder(root);
        search(root,7);
        int height = height(root);
        System.out.println("The height of the tree is: "+height);


    }
}