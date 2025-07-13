// Find the middle element of a linked list in one pass.
import java.util.*;
public class mid_val_ll_one_pass
{
    public static Node head;
    public static class Node{
        private int data;
        private Node next;
        Node(int n)
        {
            this.data = n;
            this.next = null;
        }
    }
    public static void find_mid_val(Node n)// For odd no. of elements it is working fine.
    //But for even no. of elements there will be 2 mid values and we have to consider the second mid value.
    {
        Node p = n;
        Node fast_ptr = n;
        Node slow_ptr = n;
        int count = 1;
        while(p.next != null)
        {
            fast_ptr = fast_ptr.next;
            p=p.next;
            count++;
            if(count%2 != 0)
            {
                slow_ptr = slow_ptr.next;
            }
        }
        if(count%2 == 0)
        System.out.print(slow_ptr.next.data);
        else
        System.out.print(slow_ptr.data);
    }
    public static void main(String args[])
    {
        //Scanner sc = new Scanner(System.in);
        mid_val_ll_one_pass list = new mid_val_ll_one_pass();
        list.head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new  Node(4);
        //head.next.next.next.next = new  Node(5);
        find_mid_val(head);
    }
}