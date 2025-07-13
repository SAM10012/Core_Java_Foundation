// Remove Nth node from the end of a singly linked list in one pass.
import java.util.*;
public class remove_nth_node_from_end_in_ll
{
    private static Node head;
    private static class Node{
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
        while(p!=null)
        {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }
    public static void delete_node_from_end(Node j,int k)
    {
        Node p = j;
        Node f = j;
        Node s = j;
        int count = 1;
        while(p.next!=null)
        {
            f=f.next;
            count++;
            p=p.next;
            //System.out.print("........");
            if(count > k+1)
            {
                s=s.next;
                //System.out.println(s.data + " ");
            }
        }
        
        if(k == 1)
        {
        s.next = null;
        }
        else if(k == count)
        {
            s = s.next;
            j = s;
        }
        else
        {s.next = s.next.next;}
        display(j);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        remove_nth_node_from_end_in_ll list = new remove_nth_node_from_end_in_ll();
        list.head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.print("Before deletion: ");
        display(head);
        System.out.print("\nEnter which node you want to delete from end: ");
        int n = sc.nextInt();
        System.out.print("\nAfter deletion: ");
        delete_node_from_end(head,n);
    }
}