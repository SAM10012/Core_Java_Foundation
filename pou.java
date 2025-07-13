import java.util.*;
public class pou

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
        System.out.println();
        System.out.println(count);
    }
    public static void insert(Node head, int count)
    {
        int pos = 0;
        if(count%2 == 0)
         pos = count/2;
        else 
        pos = (count + 1)/2;

        Node p = head;
        Node ins = new Node(6);
        for(int i=1;i<3;i++)
        {
            p = p.next;
        }
        ins.next = p.next;
        p.next = ins;
        display(head);

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
        pou sll = new pou();
        sll.head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        //sll.display(head);
        sll.insert(head,5);
        
        
    }
}