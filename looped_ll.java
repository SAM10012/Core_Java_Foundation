// 1. Find whether there is a loop or cycle in a linked list.
// 2. Find the first node of that loop.
import java.util.*;
public class looped_ll
{
    public static Node head;
    public static class Node
    {
        private int data;
        private Node next;
        Node(int n)
        {
            this.data = n;
            this.next = null;
        }  
    }
    public static void first_node_of_loop(Node n, Node f, Node s)
    {
        s = head;
        while(f!=s)
        {
            f = f.next;
            s = s.next;
        }
        System.out.print("\nThe first node of the loop is: " + s.data);
    }
    public static void check_for_cycle(Node n)
    {
        Node p = n;
        Node f = n;// fast pointer
        Node s = n;// slow pointer
        int flag = 0;
        while(p.next != null)
        {
        if(f.next == null || f.next.next == null)
        {
            System.out.print("There is no cycle present in the linked list. ");
            break;
        }
        else
        {
            f = f.next.next;
            s = s.next;
            p = p.next;
            //System.out.print(" ............................");
            if(f == s)
            {
                System.out.print("There is a cycle present in the linked list. ");
                flag = 1;
                break;
            }
            else
            {
                continue;
            }
        }
        }
        if(flag == 1)
        first_node_of_loop(head,f,s);
    }
    public static void main(String args[])
    {
        looped_ll list = new looped_ll();
        looped_ll.head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;
        //head.next.next.next = head.next.next;
        //head.next.next.next.next = new Node(5);
        //head.next.next.next.next.next = head.next;
        check_for_cycle(head);
    }
}