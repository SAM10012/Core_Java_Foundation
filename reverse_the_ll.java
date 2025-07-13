// Reverse a singly linked list in place without using recursion.
import java.util.*;
public class reverse_the_ll
{
    public static Node head;
    public static class Node{
        private static int data;
        private static Node next;
        Node(int n)
        {
            this.data = n;
            this.next = null;
        }
    }
    public static void display(Node n)
    {
        Node p = n;
        while(p != null)
        {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }
    public static void reverse_list()
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
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        reverse_the_ll list = new reverse_the_ll();
        list.head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        //System.out.print("Before reversal: " );
        //display(head);
        reverse_list();
    }
}