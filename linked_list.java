import java.util.*;
public class linked_list
{
    private static Node head;
    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data  = data;
            this.next = null;
        }
    }

        public static void main(String[] args)
        {
            linked_list one = new linked_list();
            one.head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            Node p = head;
            Node ins = new Node(6);
            for(int i=1;i<2;i++)
            {
                p = p.next;
            }
            ins.next = p.next;
            p.next = ins;

            Node q = head;
            while(q!=null)
            {
                System.out.print(q.data);
                q = q.next;
            }
        }

    
}