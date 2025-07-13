// Find the nth node from the tail of the linked list
import java.util.*;
public class nth_last_node
{
    public static Node head;
    public static class Node{
        private int data;
        private Node next;
        Node(int n)
        {
            this.data = n;
            this.next = null;
        }
    }
    public static void find_nth_node_from_tail(Node n,int k)
    {
        Node f = n;
        Node s = n;
        int count = 1;
        while(f.next != null)
        {
            f = f.next;
            count++;
            if(count > k)
            {
                s = s.next;
            }
        }
        System.out.print("The " + k +" last node of the linked list is: " + s.data);
    }
    public static void main(String args[])
    {
        nth_last_node list = new nth_last_node();
        Scanner sc = new Scanner(System.in);
        System.out.print("Which node from the tail will you like to see: ");
        int n = sc.nextInt();
        nth_last_node.head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        //head.next.next.next.next = new Node(5);
        find_nth_node_from_tail(head,n);
    }
}