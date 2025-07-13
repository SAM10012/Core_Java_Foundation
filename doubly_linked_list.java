import java.util.*;
public class doubly_linked_list
{
    private static Node head;
    private static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void reverse(Node starting)
    {
        Node p = starting;
        Node next = null;
        Node prev = null;
        while(p!=null)
        {
            next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }
        head = prev;
        display(head);
    }
    public static void insert_at_pos(int pos,Node add)
    {
        Node p = head;
        int count = 1;
        while(count < pos-1)
        {
            p=p.next;
            count++;
        }
        add.next = p.next;
        p.next.prev = add;
        p.next = add;
        add.prev = p;
        display(head);

    }
    public static void delete_at_pos(int pos)
    {
        Node p = head;
        int count = 1;
        while(count < pos-1)
        {
            p=p.next;
            count++;
        }
        p.next.next.prev = p;
        //p.next.prev = null;
        p.next = p.next.next;
        
        
        //p.next.next = null;
        display(head);

    }
    public static void delete_at_end()
    {
        Node p = head;
        while(p.next.next != null)
        {
            p = p.next;
        }
        p.next.prev = null;
        p.next = null;
        display(head);

    }
    public static void insert_at_end(Node add)
    {
        Node p = head;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next = add;
        add.prev = p;
        display(head);
    }
    public static void insert_at_beg(Node add)
    {
        add.next = head;
        head.prev = add;
        head = add;
        display(head);
    }
    public static void delete_at_beg()
    {
        head = head.next;
        head.prev = null;
        display(head);
    }
    public static void display(Node head)
    {
        Node p = head;
        System.out.println();
        while(p!=null)
        {
            System.out.print(p.data + " ");
            p=p.next;
        }
    }
    public static void main(String[] args)
    {
        doubly_linked_list list = new doubly_linked_list();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        
        display(head);
        insert_at_beg(new Node(7));
        delete_at_beg();
        insert_at_end(new Node(7));
        delete_at_end();
        insert_at_pos(2,new Node(7));
        insert_at_pos(3,new Node(8));
        delete_at_pos(3);
        reverse(head);
        
    }
}
