
  import java.util.*;
 
class Merging_Linked_Lists {
    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public static void insert(ListNode n,int k)
    {
        ListNode j = n;
        while(j.next!=null)
        {
            j=j.next;
        }
        j.next = new ListNode(k);
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(101);
        //System.out.print("cccccccc");
        //display(list3);
        //System.out.print("       dddddddddd");
        ListNode p = list1;
        ListNode q = list2;
        //display(p);
        //display(q);
          if(p==null && q==null)
        {
            list3 = null;
        }
        if(p==null && q!=null)
        {
            list3.val = q.val;
            q=q.next;
        }
        if(p!=null && q==null)
        {
            list3.val = p.val;
            p=p.next;
        }
        
        while(p!=null && q!=null)
        {
            if(list3.val == 101)
            {
            if(p.val <= q.val)
            {
                //System.out.print("First Node");
                list3.val = p.val;
                //display(list3);
                p=p.next;
            }
            else if(q.val <= p.val)
            {
                //System.out.print("First Node");
                list3.val = q.val;
                //display(list3);
                q=q.next;
            }
            }
            else 
            {
                
                if(p!=null && q!=null && p.val <= q.val)
            {
               // System.out.println("p <= q\n");
                insert(list3,p.val);
                //display(list3);
                p=p.next;
            }
               if(p!=null && q!=null && q.val <= p.val)
            {
                //System.out.print("p >= q");
                insert(list3,q.val);
                //display(list3);
                q=q.next;
            }
            
            }

        }
        if(p == null && q!=null)
            {
                while(q!=null)
                {
                    //System.out.print("p is null, q not null");
                    insert(list3,q.val);
                    //display(list3);
                    q=q.next;
                }
            }
            if(q==null && p!=null)
            {
                while(p!=null)
                {
                    //System.out.print("q is null, p not null");
                    insert(list3,p.val);
                    //display(list3);
                    p=p.next;
                }
            }
        return list3;
        
    }
    public static void display(ListNode d)
    {
        System.out.println();
        while(d!=null)
        {
            System.out.print(d.val + " ");
            d=d.next;
        }
    }
    public static void main(String[] args)
    {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        //display(list1);
        
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        //display(list2);
        ListNode res = mergeTwoLists(list1,list2);
        display(res);
    }
}