import java.util.*;
public class Prime
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        int flag = 0;
        for(int i=2;i<=n/2;i++)
        {
            if(n % i == 0)
                flag = 0;
            else
                flag = 1;
        }
        if(flag == 1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}