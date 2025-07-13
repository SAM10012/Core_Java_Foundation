/*
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,

Given 1->4->3->2->5->2 and x = 3,

return 1->2->2->4->3->5.
*/
/* SORT A BINARY LINKED LIST */
import java.util.*;
public class Less_then_greater
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
    public static void sort_as_said(Node head,int data)
    {
        int[] less = new int[5];
        int[] more = new int[5];
        Node p = head;
        Node q = head;
        int n1=0;
        int n2=0;
        while(p!=null)
        {
            if(p.data < data)
            {
                less[n1] = p.data;
                n1++;
            }
            else{
                more[n2] = p.data;
                n2++;
            }
            p=p.next;
        }
        for(int i=0;i<n1;i++)
        {
            q.data = less[i];
            q=q.next;
        }
        for(int j=0;j<n2;j++)
        {
            q.data = more[j];
            q=q.next;
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
        Less_then_greater list = new Less_then_greater();
        Less_then_greater.head = new Node(4);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        display(head);
        sort_as_said(head,3);
        display(head);
    }

}