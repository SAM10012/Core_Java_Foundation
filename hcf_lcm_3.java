import java.util.*;
public class hcf_lcm_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = a;
        int n = b;
        while(m!=n)
        {
            if(m>n)
            m=m-n;
            else if(n>m)
            n=n-m;
        }
        System.out.println("The hcf is: "+m);
        System.out.println("The lcm is: "+ (a*b)/m);
    }
}