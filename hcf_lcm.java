import java.util.*;
public class hcf_lcm
{
public static void main(String[] args)
{
    int m= 15;
    int n= 70;
    int m1 = m;
    int n1 = n;
    while(m1!=n1)
    {
        if(m1>n1)
        m1=m1-n1;
        else if(n1>m1)
        n1 = n1-m1;
    }
    System.out.println("HCF is: "+m1);
    System.out.println("LCM is: "+(m*n)/m1);
}
}