/* SORT A BINARY LINKED LIST */
import java.util.*;
public class binary_linked_list_sort
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
    public static void sort(Node head)
    {
        Node p = head;
        int n1=0;
        int n2 = 0;
        while(p!=null)
        {
            if(p.data == 0)
            n1++;
            else
            n2++;
            p=p.next;
        }
        Node k = head;
        for(int i=0;i<n1;i++){
            k.data = 0;
            k=k.next;
        }
        for(int j=0;j<n2;j++)
        {
            k.data = 1;
            k=k.next;
        }
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
        binary_linked_list_sort bin_list = new binary_linked_list_sort();
        bin_list.head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(1);
        head.next.next.next = new Node(0);
        display(head);
        sort(head);
        display(head);
    }

}