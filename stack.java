import java.util.*;
public class stack
{
    private static Node top;
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
    public static void push(int data)
    {
        if(top == null)
        {
            top = new Node(data);
            head = top;
        }
        else{
            top.next = new Node(data);
            top = top.next;
        }
    }
    public static void pop()
    {
        if(top==null)
        System.out.println("Stack Underflow.");
        else{
            Node p = head;
            while(p.next!=top){
                p=p.next;
                
            }
            p.next = null;
                top = p;

        }
    }
    public static void display()
    {
        Node p = head;
        while(p!=top)
        {
            System.out.print(p.data + " ");
            p=p.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        stack stack1 = new stack();
        while(true)
        {
            System.out.println("Enter 1 for push, 2 for pop, 3 for display, 4 for exit...");
        
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1: System.out.print("Enter the value: ");
                    int val = sc.nextInt();
                    push(val);
                    break;
            case 2: pop();
                    break;
            case 3: display();
                    break;
            case 4: System.exit(0);
                    break;
            default: System.out.println("Please select within the given choices!!!");
                    break;
    
        }
    }
}
}