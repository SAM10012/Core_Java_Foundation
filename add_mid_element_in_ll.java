// Add a middle element to a linked list in a single pass.
import java.util.*;
public class add_mid_element_in_ll
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
        while(p != null)
        {
            System.out.print(p.data + " ");
            p=p.next;
        }
    }
    public static void add_mid(int k)
    {
        Node p = head;
        Node f = head;
        Node s = head;
        int count = 1;
        while(p.next!=null)
        {
            f = f.next;
            count++;
            p=p.next;
            if(count%2 != 0)
            {
                s = s.next;
            }
        }
        Node new_node = new Node(k);
        new_node.next = s.next;
        s.next = new_node;
        System.out.print("\nAfter insertion: ");
        display(head);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        add_mid_element_in_ll list = new add_mid_element_in_ll();
        list.head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        //head.next.next.next.next = new Node(5);
        System.out.print("Enter the element you want to be inserted in the middle: ");
        int n = sc.nextInt();
        System.out.print("\nBefore insertion: ");
        display(head);
        add_mid(n);
        
    }

}