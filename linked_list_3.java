import java.util.*;
public class linked_list_3
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
    public static void insert(Node head,Node ins){
        Node p = head;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next = ins;
        
    }
    public static void insert_at_pos(Node head,int pos,Node ins)
    {
        Node p = head;
        int count = 1;
        if(pos == 1)
        {
            ins.next = head;
            head = ins;
        }
        while(count!=pos-1)
        {
            p=p.next;
            count++;
        }
        ins.next = p.next;
        p.next = ins;
    }
    public static void delete(Node head,int pos)
    {
        Node p = head;
        int count = 1;
        while(count!=pos -1)
        {
            p=p.next;
            count++;
        }
        p.next = p.next.next;
        
    }
    public static void delete_num(Node head,int num)
    {
        Node p = head;
        int count = 1;
        while(p!=null)
        {
            
            if(p.data == num){
                break;
            }
            count++;
            p=p.next;
        }
        Node q = head;
        int c= 1;
        while( c!=count-1)
        {
            q=q.next;
            c++;
        }
        q.next = q.next.next;
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
    public static void reverse(Node head)
    {
        Node current = head;
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
    public static void main(String[] args)
    {
        linked_list_3 list = new linked_list_3();
        linked_list_3.head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        insert(head,new Node(5));
        insert_at_pos(head,2,new Node(6));
        insert_at_pos(head,3,new Node(7));
        //insert_at_pos(head,1,new Node(10));
        delete(head,5);
        delete_num(head,7);
        reverse(head);
        display(head);
    }

}