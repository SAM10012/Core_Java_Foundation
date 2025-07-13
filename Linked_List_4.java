import java.util.*;
public class Linked_List_4
{
    private static Node head;
    private static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }
    public static void reverse(Node first)
    {
        Node current = first;
        Node next = null;
        Node prev = null;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        display(head);
    }
    public static void del_at_beg()
    {
        head = head.next;
        display(head);
    }
    
    public static void ins_at_end(Node ins)
    {
        Node p = head;
        while(p.next != null)
        {
            p=p.next;
        }
        p.next = ins;
        display(head);
    }
    public static void del_at_pos(int loc)
    {
        int count = 1;
        Node p = head;
        while(count < loc -1)
        {
            p = p.next;
            count++;
        }
        p.next = p.next.next;
        display(head);
    }
    public static void ins_at_pos(int loc, Node ins)
    {
        int count = 1;
        Node p = head;
        while(count < loc-1)
        {
            p=p.next;
            count++;
        }
        ins.next = p.next;
        p.next = ins;
        display(head);
    }
    public static void del_at_end()
    {
        Node p = head;
        while(p.next.next != null)
        {
            p=p.next;
        }
        p.next = null;
        display(head);
    }
    public static void ins_at_beg(Node init_node)
    {
        init_node.next = head;
        head = init_node;
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
        Linked_List_4 list = new Linked_List_4();
        list.head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        display(head);
        ins_at_beg(new Node(10));
        del_at_end();
        ins_at_pos(3,new Node(7));
        del_at_pos(4);
        ins_at_end(new Node(9));
        del_at_beg();
        ins_at_end(new Node(5));
        reverse(head);
    }
}