class Solution_Check {
   
        public static class Node
        {
        String d;
        int d_length;
        Node next;
        Node(String d,int d_length )
        {
            this.d = d;
            this.d_length = d_length;
            this.next = null;
        }
        }
    public static Node head = null;
        public static void insert(Node q)
    {
            if(head == null)
                head = q;
        else{
        Node p = head;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next = q;
        //System.out.println(p.next.d+",,,,,,,");
        //System.out.println(p.next.d_length+",,,,,,,,,,");
        /*Node w = head;
        while(w!=null)
        {
            System.out.print(w.d + "  ");
            w=w.next;
        }*/
            return;
        }
    }
        public static void Check_Palindrome(StringBuilder n)
    {
        StringBuilder rev = new StringBuilder("");
        for(int i = n.length() - 1;i>=0;i--)
        {
            rev.append(String.valueOf(n.charAt(i)));
        }
        //System.out.println(rev);
        if((n.toString()).compareTo(rev.toString()) == 0)
        {
            //System.out.println(rev+"ccccccccccccccccccccccccccccccccccc");
            insert(new Node(rev.toString(),rev.length()));
            return;
        }
        return;
    }
         public static String longestPalindrome(String s) {
      
        for(int i=0;i<s.length();i++)
        {
            StringBuilder n = new StringBuilder("");
            n.append(String.valueOf(s.charAt(i)));
            for(int j=i+1;j<s.length();j++)
            {
                n.append(String.valueOf(s.charAt(j)));
                //System.out.println(n);
                Check_Palindrome(n);
                continue;
            }
        }
        
        Node z = head;
        int max = z.d_length;
        String ret = new String("");
        while(z.next!=null)
        {
        if(z.d_length >= max)
        {
            max = z.d_length;
            ret = z.d;
            //System.out.println(ret);
            z=z.next;
        }
        }
        //System.out.println(ret);
        return ret;
        
    }
    public static void main(String[] args)
    {
        String ans = longestPalindrome("cbbf");
        System.out.println(ans);
    }
    }
    
    
   
