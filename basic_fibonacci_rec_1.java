import java.util.*;
public class basic_fibonacci_rec_1
{
    static int a=0,b=1,c=0;
    public static void fibonacci(int n)
    {
        if(n>0)
        {
            c=a+b;
            
            a=b;
            b=c;
            System.out.println(c+" ");
            fibonacci(n-1);
        }
        
    }
    public static void main(String[] args)
    {
        int n = 5;
        fibonacci(n-2);
    }
}