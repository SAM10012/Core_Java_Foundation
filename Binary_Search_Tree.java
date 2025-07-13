import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int k)
    {
        this.data = k;
    }
}
 class bst
{
    public static Node root;
    public static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static Node insert(Node root,int key)
    {
        if(root == null)
        {
            root = new Node(key);
        }
        else
        {
            if(key < root.data)
            {
                root.left = insert(root.left,key);
            }
            else
            {
                root.right = insert(root.right,key);
            }
        }
        return root;
    }
}
public class Binary_Search_Tree
{
public static void main(String args[])
{
    bst tree = new bst();
    
    tree.root = tree.insert(tree.root,7);
    tree.root = tree.insert(tree.root,8);
    tree.root = tree.insert(tree.root,1);
    tree.root = tree.insert(tree.root,6);
    tree.root = tree.insert(tree.root,4);
    
    tree.preorder(tree.root);
    
}
}