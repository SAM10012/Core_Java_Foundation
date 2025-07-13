import java.util.*;
public class SinglyLinkedList//class singly linked list
{
    private static Node head;//Data member of class singly linked list
    private static class Node//class Node
    {
        private int data;//Data member 1
        private Node next;//Data menmber 2
        Node(int data)//Constructor
        {
            this.data = data;
            this.next = null;
        }
    }

    public void search(int val)
    {
        Node current = head;
        int flag=0;
        while(current!=null)
        {
            
            if(current.data == val)
            {
                System.out.println("\n Value Found!");
                flag=1;
                break;
            }
            else
            {
                current = current.next;
            }
        }
        if(flag==0)
        System.out.println("\n\n Oops! Value not Present.");
    }

    public void reverse()
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
        
    }
    public void del_at_pos(int pos)
    {
        int length = SinglyLinkedList.length();
        int count = 1;
        Node current = head;
        if(pos == 1 && head!=null)
        {
            head = head.next;
        }
        else if(pos == 1 && head == null)
        {
            System.out.println("The Singly Linked List is empty!!");
        }
        else if(pos == length + 1)
        {
            while(current.next.next != null)
            {
                current = current.next;
            }
            current.next = null;
        }
        else
        {
            while(current.next!=null  &&  count<pos-1)
            {
                current = current.next;
                count = count + 1;
            }
            current.next = current.next.next;
        }
    }

    public void insert_at_pos(int pos,int data)
    {
        Node new_node = new Node(data);
        Node current = head;
        int count = 1;
        while((current != null) && (count<pos-1))
        {
            current = current.next;
            count = count + 1;
        }
        new_node.next = current.next;
        current.next = new_node;
    }
    public void insert_at_end()
    {
        Node current = head;
        Node last_node = new Node(5);
        while(current.next!=null)
        {
            current = current.next;
        }
        current.next = last_node;
    }

    public void insert_at_beg()
    {
        Node begin = new Node(0);
        begin.next = head;
        head = begin;
    }



    public void display()// Method of class singly linked list
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static int length()
    {
        Node current = head;
        int count = 0;
        while(current != null)
        {
            count = count + 1;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args)
    {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        //Individually all the nodes are created, now we have to connect them

        //Connecting the nodes
        sll.head.next = second;//1 --> 2
        second.next = third;//1 --> 2 --> 3
        third.next = fourth;//1 --> 2 --> 3 --> 4 --> NULL

        //Displaying the nodes of SLL
        sll.display();

        //Length of SLL
        int length_of_ll = sll.length();
        System.out.println("\n The length of the LINKED LIST is : " + length_of_ll);

        sll.insert_at_beg();
        //Displaying the nodes of SLL
        sll.display();

        sll.insert_at_end();
        //Displaying the nodes of SLL
        System.out.println();
        sll.display();

        int length_of_l2 = sll.length();
        System.out.println("\n The length of the LINKED LIST is : " + length_of_l2);

        sll.insert_at_pos(4,6);
        System.out.println();
        sll.display();

        sll.del_at_pos(3);
        System.out.println();
        sll.display();
        
        sll.del_at_pos(6);
        System.out.println();
        sll.display();
        

        sll.del_at_pos(1);
        System.out.println();
        sll.display();

         sll.del_at_pos(2);
        System.out.println();
        sll.display();

        sll.search(4);
        //System.out.println();
        //ll.display();
        sll.search(11);
        sll.search(1);
        sll.search(3);
        sll.search(6);
        

        sll.reverse();
         sll.display();


    }
    
}