import java.util.*;
public class sll1

{
    private static Node head;
    private static class Node{
        private int data;
        private Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static void display(Node head)
    {
        int count = 0;
        Node p = head;
        while(p!=null)
        {
            System.out.print(p.data + " ");
            count++;
            p = p.next;
        }
    }
    public static void reverse_it(Node head)
    {
        Node prev = null;
        Node next = null;
        Node current = head;
        while(current!=null)
        {
        
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        }
        Node p = prev;
        display(p);

    }
    
    public static void main(String[] args)
    {
        sll1 sll = new sll1();
        sll.head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        sll.display(head);
        System.out.println();
        sll.reverse_it(head);
        System.out.println();
        sll.display(head);
        
    }
}