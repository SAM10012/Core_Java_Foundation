import java.util.*;
public class SinglyLinkedList//class singly linked list
{
    private Node head;//Data member of class singly linked list
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
     
    public void display()
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.head + " --> ");
            current = current.next;
        }
        System.out.print("null");
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

        sll.display();
    }
    
}