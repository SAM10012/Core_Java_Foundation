import java.util.*;
public class insert_and_delete_at_beg_of_linked_list
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
public static void delete_at_beg(Node p)
{
    head = p.next;
    display(head);
}
public static void insert_at_beg(Node key)
{
   
    key.next = head;
    head = key;
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
    insert_and_delete_at_beg_of_linked_list list = new insert_and_delete_at_beg_of_linked_list();
    insert_and_delete_at_beg_of_linked_list.head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    display(head);
    insert_at_beg(new Node(7));
    //display(head);
    delete_at_beg(head);
    //display(head);
}
}