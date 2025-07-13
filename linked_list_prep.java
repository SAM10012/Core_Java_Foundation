//Linked List Preparation
/*1. Display elements of linked list
  2. Insert at beginning
  3. Delete at Beginning
  4. Insert at a given position
  5. Delete at a given position
  6. Frequency of elements.
  7. Reverse a singly linked list in place without using recursion.
 */
import java.util.*;
public class linked_list_prep
{
    private static Node head;
    private static class Node
    {
        int data;
        Node next;
        Node(int n)
        {
            this.data = n;
            this.next = null;
        }
    }
    public static void display(Node n)
    {
        Node p = n;
        while(p !=null)
        {
            System.out.print(p.data + " ");
            p=p.next;
        }
    }
    public static void reverse_list() throws NullPointerException
    {
        Node p = head;
        Node prev = null, curr = null, next = null;
        while(p != null)
        {
            curr = p;
            next = p.next;
            p.next = prev;
            p = next;
            prev = curr;    
        }
        head = prev;
        System.out.print("\nAfter reversal: ");
        display(head);
    }
    public static void ins_at_beg(Node n, int data)
    {
        
        Node beg_node = new Node(data);
        beg_node.next = n;
        n = beg_node;
        head = n;
        System.out.print("\nAfter new node insertion at beginning: ");
        display(head);
    }
    public static void del_at_beg(Node n)
    {
        n = n.next;
        head = n;
        System.out.print("\nAfter new node deletion at beginning: ");
        display(head);
    }
    public static void ins_at_pos(Node n,int pos, int val)
    {
        
        if(pos ==1 )
        {
            ins_at_beg(head,val);
        }
        else
        {
        Node p = n;
        int count = 1;
        while(count < pos-1)
        {
            p = p.next;
            count++;
        }
        
        Node new_ins = new Node(val);
        new_ins.next = p.next;
        p.next = new_ins;
        display(head);
    }
    }
    public static void del_at_pos(Node n, int pos)
    {
        if(pos == 1)
        {
            del_at_beg(head);
        }
        else
        {
        Node p = n;
        int count = 1;
        while(count < pos-1)
        {
            p = p.next;
            count++;
        }
        p.next = p.next.next;
        display(head);
    }
    }
    public static void freq_of_list(Node n)
    {
        Node p = n;
        int count = 1;
        while(p.next!=null)
        {
            p=p.next;
            count++;
        }
        System.out.print(count);
    }
    public static void main(String args[]) throws NullPointerException
    {
        Scanner sc = new Scanner(System.in);
        linked_list_prep list = new linked_list_prep();
        list.head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        //head.next.next.next = new Node(4);
        //display(head);
        //System.out.print("\nEnter the new node to be inserted at beginning of list: ");
        //int new_node_data = sc.nextInt();
        //ins_at_beg(head,new_node_data);
        //del_at_beg(head);
        //System.out.print("\n Enter the position of new node: ");
        //int pos = sc.nextInt();
        //System.out.print("\n Enter the value of new node: ");
        //int val = sc.nextInt();
        //ins_at_pos(head,pos,val);
        //System.out.print("\n Enter the position of the node to be deleted: ");
        //int pos = sc.nextInt();
        //del_at_pos(head,pos);
        //freq_of_list(head);
        //reverse_list(head);
        System.out.print("Before reversal: ");
        display(head);
        reverse_list();
        

    }
}