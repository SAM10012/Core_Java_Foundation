import java.util.*;
public class HCF_and_LCM
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int m1=m;
        int n1=n;
        while(m!=n)
        {
            if(m>n)
            m= m-n;
            else
            n= n-m;
        }
        System.out.println("The hcf is : "+m);
        System.out.println("The lcm is : "+(m1*n1)/m);

    }
}