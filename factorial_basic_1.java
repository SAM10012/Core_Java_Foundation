import java.util.*;
public class factorial_basic_1
{
   
    
    public static void main(String[] args)
    {
        int n= 5;
        int prod = 1;
        for(int i=1;i<=n;i++)
        {
            prod = prod * i;
        }
        System.out.println(prod);


    }
}