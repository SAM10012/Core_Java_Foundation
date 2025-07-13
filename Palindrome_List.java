/*                                           PALINDROME LIST
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.
Note: Expected solution is linear in time and constant in space. 
------------------------------------------------------------------------------------------------*/

import java.util.*;
public class Palindrome_List
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
    public static int Is_Palindrome(Node head)
    {
        
        Node current = head;
        Node next = null;
        Node prev = null;
        Node p = head;
        int[] arr = new int[3];
        int i=0;
        while(p!=null)
        {
            arr[i] = p.data;
            i++;
            p=p.next;
        }
        if(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            
        }
        Node k = prev;
        //display(k);
        int flag = 0;
        //Node q= k;
        int j=0;
        while(k!=null)
        {
            if(k.data == arr[j])
            {
                flag = 1;
            }
            else{
                flag = 0;
                break;
            }
            j++;
            k=k.next;
        }
        return flag;
        

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
        Palindrome_List list = new Palindrome_List();
        Palindrome_List.head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        
        display(head);
        int result = Is_Palindrome(head);
        //display(head);
        System.out.println();
        if(result == 1)
        {
            System.out.println("The given list is a palindrome!");
        }
        else
        {
            System.out.println("The given list is not a palindrome!");
        }
    }

}