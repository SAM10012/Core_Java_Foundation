import java.util.*;
public class prime_basic
{
    public static void main(String[] args)
    {
        int n=5;
        int flag = 1;
        for(int i=2;i<n/2;i++)
        {
            if(n%i == 0)
            {
                flag = 0;
            }
        }
        if(flag == 0)
        {
            System.out.println("NOt Prime");
        }
        else
            System.out.println("Prime");


    }
}